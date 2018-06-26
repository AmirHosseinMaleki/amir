package singlePlayerMode;

/**
 * @author mateenBagheri, AmirhosseinMaleki, RezaTahmasbi
 * @since 1397/03/09
 *
 * <code>{@link Achievements}</code> class is a class which has the duty
 * of saving all the achievements of the <code>{@link Player}</code>.It's
 * contained by 5 private attributes power,correctAnswers,allQuests,allLetters
 * and correctLetters which need to be shown to the user at the end of the
 * game by our gui.
 */
public class Achievements {

    private int power;
    private int correctAnswers;
    private int allQuests;
    private int correctLetters;
    private int allLetters;

    /**
     * <code>{@link Achievements}</code> constructor constructs a class of
     * <code>{@link Achievements}</code> with all the values set to zero or
     * null <i>but</i> power attribute which has the initial value of 100.
     */
    public Achievements() {
        this.power = 100;
    }

    /**
     * <i>getPower</i> is a getter method which gets the power of the
     * player (which is constantly being changed as an attribute of the
     * class {@link Player}).
     * @return the power which is show in progress bar in {@link gui.MainFrame}
     */
    public int getPower() {
        return power;
    }

    /**
     * <i>setPower</i> is a setter method which sets the value of the
     * power which is shown in the progress bar in {@link gui.MainFrame}.
     * @param power the power that any player has which represents the
     *              the time/energy that he/she has got left to play.
     */
    public void setPower(int power) {
        this.power = power;
    }

    /**
     * <i>getCorrectAnswers</i> is a getter method which return the an
     * integer representing the number of the correct answers that the
     * {@link Player} has earned during the game.
     * @return the number of correct answers of the {@link Player}.
     */
    public int getCorrectAnswers() {
        return correctAnswers;
    }

    /**
     * <i>setCorrectAnswer</i> is a setter method used for setting a
     * value in the class {@link Achievements} which is representing number
     * of the correct Tasks that the player has achieved during a one
     * -time game.
     * @param correctAnswers
     */
    public void setCorrectAnswers(int correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    /**
     * <code>getAllQuests</code> is a getter method which returns number of
     * series of characters given the {@link Player} to type.
     * @return the number of the arrays given to user to type.
     */
    public int getAllQuests() {
        return allQuests;
    }

    /**
     * <code>setAllQuests</code> is a setter which sets the value of allQuests.
     * @param allQuests the number of the arrays given to the user to type.
     */
    public void setAllQuests(int allQuests) {
        this.allQuests = allQuests;
    }

    /**
     * <code>getCorrectLetters</code> is a getter method which returns the number
     * of letters that are entered correctly by the user.
     * @return the number of letters entered correctly by the user.
     */
    public int getCorrectLetters() {
        return correctLetters;
    }

    /**
     * <code>setCorrectLetters</code> is a setter which sets the number of the letters
     * entered correctly by the {@link Player}
     * @param correctLetters the number of letters entered correctly by the {@link Player}.
     */
    public void setCorrectLetters(int correctLetters) {
        this.correctLetters = correctLetters;
    }

    /**
     * <code>getAllLetters</code> is a getter method which returns the number of all letters
     * given to user.
     * @return all the letters given to the user in the given time.
     */
    public int getAllLetters() {
        return allLetters;
    }

    /**
     * <code>setAllLetters</code> sets the attribute representing all the  letters given to
     * the <code>Player</code> by the given time by {@link Stopwatch}.
     * @param allLetters all letters given to the player by the time.
     */
    public void setAllLetters(int allLetters) {
        this.allLetters = allLetters;
    }
}
