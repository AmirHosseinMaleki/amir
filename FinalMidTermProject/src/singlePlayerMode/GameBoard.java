package singlePlayerMode;

import gui.GameOver;
import gui.MainFrame;
import gui.TimeIsOver;

import java.awt.*;
import java.io.IOException;

/**
 * <code>{@link GameBoard}</code> class is a class that holds the
 * logic of the game.
 * The whole class is dominated by one main method <code>runGameBoard</code>
 * which contains all of the following explanations.
 * Most of the Classes are instantiated in the
 * <code>{@link GameBoard}</code> this class is designed for single
 * player mode of the game FasTyper the game is started in this class
 * in a time limit of 60 seconds (<code>{@link Stopwatch}</code> checks
 * the time is over or not.
 * The loop ends when a method of class <code>{@link Stopwatch}</code>,
 * <code>getElapsedTime</code> returns number 60000 (AKA 60Secs).
 * The main Gui frame of the game(<code>{@link MainFrame}</code> is
 * instantiated.
 * We added a {@link java.awt.event.KeyListener} to the frame so that the
 * <code>{@link MainFrame}</code> be sensitive to the Keyboard activities.
 * The whole class is dominated by one main method <code>runGameBoard</code>
 * which contains all of the following explanations.
 */
public class GameBoard {
    private Player player;

    public GameBoard(Player player) {
        this.player = player;
    }

    private Stopwatch stopwatch = new Stopwatch();
    private Stopwatch deadlineStopwatch = new Stopwatch();
    private CharacterListener characterListener = new CharacterListener();
    private MainFrame mainFrame = new MainFrame();

    private String randomChar = "";
    private int lastEnteredLetter = 0, score=0;
    private int deadline, letterLimit;
    private boolean inputEnteredFlag = true;
    private boolean isGameOver = false;

    /**
     * the main method of the class <code>{@link GameBoard}</code>
     * which contains all of the logic of the game how the scores
     * are set,how the time is managed, how creating words are done
     * and how we used classes <code>{@link CharacterListener}</code>
     * ,<code>{@link Player}</code>,<code>{@link Stopwatch}</code> and
     * <code>{@link TimeManager}</code>.
     */
    public void runGameBoard (){
        mainFrame.getFrame().addKeyListener(characterListener);
        mainFrame.getUserNameLabel().setText(player.getName());

        stopwatch.start();

        while (stopwatch.getElapsedTime() < 60000) {
            deadlineStopwatch.start();
            deadline = TimeManager.getDeadline(stopwatch.getElapsedTime());
            mainFrame.getDeadlineLabel().setText(deadline + " ms");
            letterLimit = WordManager.getLetterNumber(stopwatch.getElapsedTime());
            while (deadlineStopwatch.getElapsedTime() < deadline) {
                mainFrame.getTimeLeftLabel().setText( (60000 - stopwatch.getElapsedTime() )/ 1000 + ":" +
                        ( (60000 - stopwatch.getElapsedTime() / 100)%100 ) + ":"
                        + (60000 - stopwatch.getElapsedTime()) % 100) ;
                for (int counter = 0; counter < letterLimit && inputEnteredFlag; counter++) {
                    randomChar += "" + WordManager.getRandomChar();
                    player.getAchievements().setAllLetters(player.getAchievements().getAllLetters() + 1);
                    mainFrame.getAllLettersLabel().setText(player.getAchievements().getAllLetters() + "");
                }
                if(inputEnteredFlag){
                	player.getAchievements().setAllQuests(player.getAchievements().getAllQuests() + 1);
                	mainFrame.getRandomLettersLabel().setText(randomChar);
                	mainFrame.getAllQuestsLabel().setText(player.getAchievements().getAllQuests() + "");
                	mainFrame.getRandomLettersLabel().setForeground(new Color(90, 150, 250));
                }
                inputEnteredFlag = false;
                if (characterListener.getCounter() > 0 && lastEnteredLetter != characterListener.getCounter()) {
                    if (WordManager.checkCharacter(characterListener.getInputChar()[characterListener.getCounter()-1] ,
                            randomChar.charAt(characterListener.getCounter()-1))) {
                        player.getAchievements().setCorrectLetters(player.getAchievements().getCorrectLetters() + 1);
                        mainFrame.getCorrectLetterLabel().setText(player.getAchievements().getCorrectLetters() + "");
                        score++;
                    }
                    else {
                        player.getAchievements().setPower(player.getAchievements().getPower() - 5);
                        mainFrame.getProgressBar().setValue(player.getAchievements().getPower());
                        if (player.getAchievements().getPower() == 0) {
                            isGameOver = true;
                            break;
                        }
                    }
                    characterListener.setToDefaultInputChar(characterListener.getCounter());
                }
                if (letterLimit == characterListener.getCounter()) {
                    if(letterLimit==score){
                        Stopwatch delay = new Stopwatch();
                        player.getAchievements().setCorrectAnswers(player.getAchievements().getCorrectAnswers() + 1);
                        mainFrame.getCorrectAnswersLabel().setText(player.getAchievements().getCorrectAnswers() + "");
                        delay.start();
                        while (delay.getElapsedTime() < 200){
                            mainFrame.getRandomLettersLabel().setForeground(Color.GREEN);
                        }
                        delay.setToZero();
                        delay.setToZero();
                        score = 0;

                    }
                    characterListener.setToDefaultInputChar(4);
                    characterListener.setCounterToDefault();
                    randomChar = "";
                    inputEnteredFlag = true;
                }
                lastEnteredLetter = characterListener.getCounter();
            }
            if (isGameOver) {
                mainFrame.getFrame().setFocusable(false);
                break;
            }
            inputEnteredFlag = true;
            randomChar = "";
            characterListener.setToDefaultInputChar(4);
            deadlineStopwatch.setToZero();
        }
        mainFrame.getTimeLeftLabel().setText("00:00:00");
    	mainFrame.getFrame().setVisible(false);
        stopwatch.stop();
        if (isGameOver) {
        	GameOver gameOver=new GameOver();
        	gameOver.getPowerLeft().setText(player.getAchievements().getPower()+"%");
        	gameOver.getCorrectAnswers().setText(player.getAchievements().getCorrectAnswers()+
        			" of "+player.getAchievements().getAllQuests());
        	gameOver.getCorrectLetters().setText(player.getAchievements().getCorrectLetters()+
        			" of "+player.getAchievements().getAllLetters());
        	gameOver.getPlayerLevel().setText((int)(((float)player.getAchievements().getCorrectLetters()
        			/player.getAchievements().getAllLetters())*100)+"."+
        			(int)(((float)player.getAchievements().getCorrectLetters()
        	    	/player.getAchievements().getAllLetters())*10000)%100+"%");
        }
        else {
            TimeIsOver timeIsOver=new TimeIsOver();
            timeIsOver.getPowerLeft().setText(player.getAchievements().getPower()+"%");
            timeIsOver.getCorrectAnswers().setText(player.getAchievements().getCorrectAnswers()+
        			" of "+player.getAchievements().getAllQuests());
            timeIsOver.getCorrectLetters().setText(player.getAchievements().getCorrectLetters()+
        			" of "+player.getAchievements().getAllLetters());
            timeIsOver.getPlayerLevel().setText((int)(((float)player.getAchievements().getCorrectLetters()
        			/player.getAchievements().getAllLetters())*100)+"."+
        			(int)(((float)player.getAchievements().getCorrectLetters()
        	    	/player.getAchievements().getAllLetters())*10000)%100+"%");
        }

    }
}
