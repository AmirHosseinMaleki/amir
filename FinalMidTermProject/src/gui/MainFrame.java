package gui;

import java.awt.*;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class MainFrame {
	private JFrame frame;
	private JProgressBar progressBar;
	private JLabel userNameLabel;
	private JLabel timeLeftLabel;
	private JLabel correctAnswersLabel;
	private JLabel correctLetterLabel;
	private JLabel randomLettersLabel;
	private JLabel deadlineLabel;
	private JLabel allQuestsLabel;
	private JLabel allLettersLabel;

	/**
	 * Create the application.
	 */
	public MainFrame() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setType(Type.NORMAL);
		frame.setBounds(100, 100, 515, 384);
		frame.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("Exit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(400, 311, 89, 23);
		frame.getContentPane().add(btnNewButton);

		progressBar = new JProgressBar();
		progressBar.setToolTipText("");
		progressBar.setStringPainted(true);
		progressBar.setBackground(Color.WHITE);
		progressBar.setForeground(new Color(179, 0, 89));
		progressBar.setValue(100);
		progressBar.setBounds(56, 108, 146, 14);
		frame.getContentPane().add(progressBar);

		JLabel lblPower = new JLabel("Power");
		lblPower.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPower.setBounds(56, 74, 46, 23);
		frame.getContentPane().add(lblPower);

		JLabel lblUserName = new JLabel("User Name:");
		lblUserName.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblUserName.setBounds(56, 30, 69, 24);
		frame.getContentPane().add(lblUserName);

		userNameLabel = new JLabel("");
		userNameLabel.setForeground(new Color(179, 0, 89));
		userNameLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		userNameLabel.setBounds(128, 30, 74, 24);
		frame.getContentPane().add(userNameLabel);

		JSeparator separator = new JSeparator();
		separator.setBounds(22, 144, 467, 2);
		frame.getContentPane().add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(231, 11, 2, 135);
		frame.getContentPane().add(separator_1);

		JLabel lblTimeLeft = new JLabel("Time left:");
		lblTimeLeft.setBounds(269, 36, 60, 14);
		frame.getContentPane().add(lblTimeLeft);

		timeLeftLabel = new JLabel("");
		timeLeftLabel.setForeground(new Color(174,4,4));
		timeLeftLabel.setBounds(327, 36, 143, 14);
		frame.getContentPane().add(timeLeftLabel);

		JLabel lblNewLabel_2 = new JLabel("Correct Answers:");
		lblNewLabel_2.setBounds(269, 70, 103, 14);
		frame.getContentPane().add(lblNewLabel_2);

		correctAnswersLabel = new JLabel("0" + " of ");
		correctAnswersLabel.setForeground(new Color(174,4,4));
		correctAnswersLabel.setBounds(382, 70, 66, 14);
		frame.getContentPane().add(correctAnswersLabel);

		allQuestsLabel = new JLabel("0");
		allQuestsLabel.setForeground(new Color(174,4,4));
		allQuestsLabel.setBounds(418, 70, 66, 14);
		frame.getContentPane().add(allQuestsLabel);

		JLabel lblNewLabel_4 = new JLabel("Correct Letters:");
		lblNewLabel_4.setBounds(269, 106, 103, 14);
		frame.getContentPane().add(lblNewLabel_4);

		correctLetterLabel = new JLabel(0 + " of " );
		correctLetterLabel.setForeground(new Color(174,4,4));
		correctLetterLabel.setBounds(366, 106, 66, 14);
		frame.getContentPane().add(correctLetterLabel);

        allLettersLabel = new JLabel("0");
        allLettersLabel.setForeground(new Color(174,4,4));
        allLettersLabel.setBounds(400, 106, 66, 14);
        frame.getContentPane().add(allLettersLabel);


        randomLettersLabel = new JLabel("");
        randomLettersLabel.setForeground(new Color(179, 0, 89));
		randomLettersLabel.setHorizontalAlignment(SwingConstants.CENTER);
		randomLettersLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		randomLettersLabel.setBounds(206, 172, 69, 45);
		frame.getContentPane().add(randomLettersLabel);

		JLabel lblNewLabel_7 = new JLabel("Deadline:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(174, 228, 59, 30);
		frame.getContentPane().add(lblNewLabel_7);

		deadlineLabel = new JLabel(1000 + " ms.");
		deadlineLabel.setForeground(new Color(174,4,4));
		deadlineLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		deadlineLabel.setBounds(243, 228, 86, 30);
		frame.getContentPane().add(deadlineLabel);

		JLabel lblNewLabel_10 = new JLabel("Type the letters as quickly as possible");
		lblNewLabel_10.setBounds(140, 315, 218, 14);
		frame.getContentPane().add(lblNewLabel_10);

        frame.setTitle("FAST TYPER GAME!");
        
        JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(LoginPage.class.getResource("/images/MainFramePic.jpg")));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 0, 601, 369);
		frame.getContentPane().add(lblNewLabel_1);

        frame.setFocusable(true);
        frame.setVisible(true);
        frame.setAlwaysOnTop(true);
	}

    public JFrame getFrame() {
        return frame;
    }

	public JProgressBar getProgressBar() {
		return progressBar;
	}

	public JLabel getUserNameLabel() {
		return userNameLabel;
	}

	public JLabel getTimeLeftLabel() {
		return timeLeftLabel;
	}

	public JLabel getCorrectAnswersLabel() {
		return correctAnswersLabel;
	}

	public JLabel getCorrectLetterLabel() {
		return correctLetterLabel;
	}

	public JLabel getAllQuestsLabel() {
		return allQuestsLabel;
	}

	public JLabel getAllLettersLabel() {
		return allLettersLabel;
	}

	public JLabel getRandomLettersLabel() {
		return randomLettersLabel;
	}

	public JLabel getDeadlineLabel() {
		return deadlineLabel;
	}
}