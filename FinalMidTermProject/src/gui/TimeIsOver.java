package gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;

public class TimeIsOver {

	private JFrame frame;
	private JLabel powerLeft;
	private JLabel correctAnswers;
	private JLabel correctLetters;
	private JLabel playerLevel;

	public TimeIsOver() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel powerLeftTxt = new JLabel("Power Left:");
		powerLeftTxt.setBounds(20, 60, 100, 14);
		powerLeftTxt.setForeground(Color.WHITE);
		powerLeftTxt.setFont(new Font("BankGothic Lt BT", Font.BOLD, 14));
		frame.getContentPane().add(powerLeftTxt);
		
		powerLeft = new JLabel("100%");
		powerLeft.setBounds(100, 55, 140, 20);
		powerLeft.setForeground(Color.RED);
		powerLeft.setFont(new Font("BankGothic Lt BT", Font.BOLD, 20));
		frame.getContentPane().add(powerLeft);
		
		JLabel correctAnswersTxt = new JLabel("Correct Answers:");
		correctAnswersTxt.setBounds(200, 60, 140, 14);
		correctAnswersTxt.setForeground(Color.WHITE);
		correctAnswersTxt.setFont(new Font("BankGothic Lt BT", Font.BOLD, 14));
		frame.getContentPane().add(correctAnswersTxt);
		
		correctAnswers = new JLabel("100%");
		correctAnswers.setBounds(320, 55, 140, 20);
		correctAnswers.setForeground(new Color(0,170,0));
		correctAnswers.setFont(new Font("BankGothic Lt BT", Font.BOLD, 20));
		frame.getContentPane().add(correctAnswers);
		
		JLabel correctLettersTxt = new JLabel("Correct Letters:");
		correctLettersTxt.setBounds(450, 60, 140, 14);
		correctLettersTxt.setForeground(Color.WHITE);
		correctLettersTxt.setFont(new Font("BankGothic Lt BT", Font.BOLD, 14));
		frame.getContentPane().add(correctLettersTxt);
		
		correctLetters = new JLabel("100%");
		correctLetters.setBounds(560, 55, 140, 20);
		correctLetters.setForeground(new Color(0,170,0));
		correctLetters.setFont(new Font("BankGothic Lt BT", Font.BOLD, 20));
		frame.getContentPane().add(correctLetters);
		
		JLabel playerLevelTxt = new JLabel("Player Level:");
		playerLevelTxt.setBounds(210, 160, 140, 25);
		playerLevelTxt.setForeground(Color.WHITE);
		playerLevelTxt.setFont(new Font("BankGothic Lt BT", Font.BOLD, 20));
		frame.getContentPane().add(playerLevelTxt);
		
		playerLevel = new JLabel("100%");
		playerLevel.setBounds(350, 160, 140, 25);
		playerLevel.setForeground(Color.BLUE);
		playerLevel.setFont(new Font("BankGothic Lt BT", Font.BOLD, 30));
		frame.getContentPane().add(playerLevel);
		
		JLabel lblNewLabel = new JLabel("Time Is Over");
		lblNewLabel.setForeground(new Color(255, 204, 51));
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 47));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(180,260, 300, 101);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(TimeIsOver.class.getResource("/images/TimeIsOverPic.jpg")));
		lblNewLabel_1.setBounds(0, 0, 700, 400);
		frame.getContentPane().add(lblNewLabel_1);
		frame.setVisible(true);
	}

	public JLabel getPowerLeft() {
		return powerLeft;
	}

	public JLabel getCorrectAnswers() {
		return correctAnswers;
	}

	public JLabel getCorrectLetters() {
		return correctLetters;
	}

	public JLabel getPlayerLevel() {
		return playerLevel;
	}
}
