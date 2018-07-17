package statement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class Statement {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Statement window = new Statement();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Statement() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 16));
		frame.setBounds(100, 100, 716, 467);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(427, 13, 27, 394);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(188, 13, 51, 394);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(12, 66, 674, 27);
		frame.getContentPane().add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(12, 131, 674, 27);
		frame.getContentPane().add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(12, 189, 674, 27);
		frame.getContentPane().add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(12, 257, 674, 27);
		frame.getContentPane().add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(12, 326, 674, 36);
		frame.getContentPane().add(separator_6);
		
		JLabel lblName = new JLabel("Name");
		lblName.setForeground(new Color(199, 21, 133));
		lblName.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 25));
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setBounds(48, 26, 89, 27);
		frame.getContentPane().add(lblName);
		
		JLabel lblA = new JLabel("Omid");
		lblA.setForeground(new Color(0, 139, 139));
		lblA.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblA.setHorizontalAlignment(SwingConstants.CENTER);
		lblA.setBounds(251, 13, 113, 40);
		frame.getContentPane().add(lblA);
		
		JLabel lblNewLabel_1 = new JLabel("Ali");
		lblNewLabel_1.setForeground(new Color(0, 139, 139));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(487, 13, 148, 37);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblPowerLeft = new JLabel("Power Left");
		lblPowerLeft.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 25));
		lblPowerLeft.setHorizontalAlignment(SwingConstants.CENTER);
		lblPowerLeft.setBounds(33, 90, 130, 28);
		frame.getContentPane().add(lblPowerLeft);
		
		JLabel lblCorrectAnswer = new JLabel("Correct Answer");
		lblCorrectAnswer.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 25));
		lblCorrectAnswer.setBounds(12, 151, 174, 25);
		frame.getContentPane().add(lblCorrectAnswer);
		
		JLabel lblCorrectLetter = new JLabel("Correct Letter");
		lblCorrectLetter.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 25));
		lblCorrectLetter.setHorizontalAlignment(SwingConstants.CENTER);
		lblCorrectLetter.setBounds(22, 208, 154, 36);
		frame.getContentPane().add(lblCorrectLetter);
		
		JLabel lblPlayerLevel = new JLabel("Player Level");
		lblPlayerLevel.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 25));
		lblPlayerLevel.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayerLevel.setBounds(22, 271, 141, 42);
		frame.getContentPane().add(lblPlayerLevel);
		
		JLabel label = new JLabel("39%");
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(264, 79, 89, 39);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("55%");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(514, 79, 96, 39);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("12");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(257, 140, 107, 36);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("11");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(514, 142, 96, 34);
		frame.getContentPane().add(label_3);
		
		JLabel lblNewLabel = new JLabel("20");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(274, 208, 79, 36);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("8");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(514, 208, 96, 36);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel label_4 = new JLabel("48.5%");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(264, 271, 100, 40);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("71.6%");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(528, 271, 82, 40);
		frame.getContentPane().add(label_5);
		
		JLabel lblWin = new JLabel("Won");
		lblWin.setForeground(new Color(50, 205, 50));
		lblWin.setFont(new Font("Snap ITC", Font.PLAIN, 30));
		lblWin.setHorizontalAlignment(SwingConstants.CENTER);
		lblWin.setBounds(210, 346, 205, 61);
		frame.getContentPane().add(lblWin);
		
		JLabel lblGameOver = new JLabel("Game Over");
		lblGameOver.setForeground(new Color(255, 0, 0));
		lblGameOver.setFont(new Font("Snap ITC", Font.PLAIN, 30));
		lblGameOver.setHorizontalAlignment(SwingConstants.CENTER);
		lblGameOver.setBounds(466, 346, 205, 61);
		frame.getContentPane().add(lblGameOver);
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon(Statement.class.getResource("/images/UsersStatementPic.jpg")));
		label_6.setBounds(0, 0, 698, 420);
		frame.getContentPane().add(label_6);
	}
}
