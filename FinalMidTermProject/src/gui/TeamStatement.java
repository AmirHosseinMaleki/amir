package teamStatement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;

public class TeamStatement {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeamStatement window = new TeamStatement();
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
	public TeamStatement() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 721, 484);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 57, 679, 20);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(12, 119, 679, 20);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(12, 302, 679, 20);
		frame.getContentPane().add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(12, 360, 679, 20);
		frame.getContentPane().add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setBounds(162, 13, 20, 411);
		frame.getContentPane().add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setOrientation(SwingConstants.VERTICAL);
		separator_5.setBounds(426, 13, 26, 348);
		frame.getContentPane().add(separator_5);
		
		JLabel lblTeam = new JLabel("Team");
		lblTeam.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblTeam.setHorizontalAlignment(SwingConstants.CENTER);
		lblTeam.setBounds(38, 13, 90, 30);
		frame.getContentPane().add(lblTeam);
		
		JLabel label = new JLabel("1");
		label.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(239, 13, 107, 28);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("2");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(514, 13, 107, 31);
		frame.getContentPane().add(label_1);
		
		JLabel lblTeamName = new JLabel("Team Name");
		lblTeamName.setFont(new Font("Sylfaen", Font.PLAIN, 20));
		lblTeamName.setHorizontalAlignment(SwingConstants.CENTER);
		lblTeamName.setBounds(12, 71, 138, 35);
		frame.getContentPane().add(lblTeamName);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(12, 167, 679, 14);
		frame.getContentPane().add(separator_6);
		
		JLabel lblPowerAverage = new JLabel("Power Average");
		lblPowerAverage.setFont(new Font("Sylfaen", Font.PLAIN, 20));
		lblPowerAverage.setHorizontalAlignment(SwingConstants.CENTER);
		lblPowerAverage.setBounds(12, 134, 143, 20);
		frame.getContentPane().add(lblPowerAverage);
		
		JLabel lblGroupMembers = new JLabel("Group Members");
		lblGroupMembers.setFont(new Font("Sylfaen", Font.PLAIN, 20));
		lblGroupMembers.setHorizontalAlignment(SwingConstants.CENTER);
		lblGroupMembers.setBounds(12, 194, 143, 50);
		frame.getContentPane().add(lblGroupMembers);
		
		JLabel lblNewLabel = new JLabel("The Winner Members");
		lblNewLabel.setFont(new Font("Sylfaen", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 317, 143, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblTheWinnerTeam = new JLabel("The Winner Team");
		lblTheWinnerTeam.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		lblTheWinnerTeam.setHorizontalAlignment(SwingConstants.CENTER);
		lblTheWinnerTeam.setBounds(12, 379, 138, 35);
		frame.getContentPane().add(lblTheWinnerTeam);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(TeamStatement.class.getResource("/Pic/Queue_48px.png")));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(38, 257, 90, 32);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(TeamStatement.class.getResource("/Pic/Gender Neutral User_16px.png")));
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(184, 181, 40, 30);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(TeamStatement.class.getResource("/Pic/Gender Neutral User_16px.png")));
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(184, 225, 40, 30);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(TeamStatement.class.getResource("/Pic/Gender Neutral User_16px.png")));
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(184, 272, 40, 30);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon(TeamStatement.class.getResource("/Pic/Olympic Medal Gold_48px.png")));
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setBounds(358, 302, 56, 59);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon(TeamStatement.class.getResource("/Pic/Olympic Medal Gold_48px.png")));
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setBounds(626, 302, 56, 59);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("");
		label_8.setIcon(new ImageIcon(TeamStatement.class.getResource("/Pic/Trophy_48px.png")));
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setBounds(503, 374, 67, 50);
		frame.getContentPane().add(label_8);
		
		JLabel lblGoogle = new JLabel("Google");
		lblGoogle.setForeground(new Color(255, 69, 0));
		lblGoogle.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 23));
		lblGoogle.setHorizontalAlignment(SwingConstants.CENTER);
		lblGoogle.setBounds(194, 57, 201, 59);
		frame.getContentPane().add(lblGoogle);
		
		JLabel lblApple = new JLabel("Apple");
		lblApple.setForeground(new Color(30, 144, 255));
		lblApple.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		lblApple.setHorizontalAlignment(SwingConstants.CENTER);
		lblApple.setBounds(446, 57, 236, 59);
		frame.getContentPane().add(lblApple);
		
		JLabel label_9 = new JLabel("54.9%");
		label_9.setForeground(new Color(255, 69, 0));
		label_9.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 23));
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setBounds(218, 119, 159, 49);
		frame.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("67.1%");
		label_10.setForeground(new Color(30, 144, 255));
		label_10.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 23));
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setBounds(503, 119, 129, 49);
		frame.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("");
		label_11.setIcon(new ImageIcon(TeamStatement.class.getResource("/Pic/Person Male_16px.png")));
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setBounds(446, 181, 40, 29);
		frame.getContentPane().add(label_11);
		
		JLabel label_12 = new JLabel("");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setIcon(new ImageIcon(TeamStatement.class.getResource("/Pic/Person Male_16px.png")));
		label_12.setBounds(446, 225, 40, 30);
		frame.getContentPane().add(label_12);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(TeamStatement.class.getResource("/Pic/Person Male_16px.png")));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(446, 270, 40, 32);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Reza");
		lblNewLabel_2.setForeground(new Color(255, 69, 0));
		lblNewLabel_2.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(274, 181, 140, 30);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblMateen = new JLabel("Mateen");
		lblMateen.setForeground(new Color(255, 99, 71));
		lblMateen.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		lblMateen.setHorizontalAlignment(SwingConstants.CENTER);
		lblMateen.setBounds(274, 225, 140, 30);
		frame.getContentPane().add(lblMateen);
		
		JLabel lblAmirhossein = new JLabel("AmirHossein");
		lblAmirhossein.setForeground(new Color(255, 69, 0));
		lblAmirhossein.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		lblAmirhossein.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmirhossein.setBounds(274, 272, 140, 30);
		frame.getContentPane().add(lblAmirhossein);
		
		JLabel lblOmid = new JLabel("Omid");
		lblOmid.setForeground(new Color(30, 144, 255));
		lblOmid.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		lblOmid.setHorizontalAlignment(SwingConstants.CENTER);
		lblOmid.setBounds(514, 181, 153, 30);
		frame.getContentPane().add(lblOmid);
		
		JLabel lblAbass = new JLabel("Abass");
		lblAbass.setForeground(new Color(30, 144, 255));
		lblAbass.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		lblAbass.setHorizontalAlignment(SwingConstants.CENTER);
		lblAbass.setBounds(514, 228, 153, 27);
		frame.getContentPane().add(lblAbass);
		
		JLabel lblNewLabel_3 = new JLabel("Ali");
		lblNewLabel_3.setForeground(new Color(30, 144, 255));
		lblNewLabel_3.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(514, 272, 153, 30);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblMateen_1 = new JLabel("Mateen");
		lblMateen_1.setForeground(new Color(255, 0, 0));
		lblMateen_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 25));
		lblMateen_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblMateen_1.setBounds(184, 302, 172, 59);
		frame.getContentPane().add(lblMateen_1);
		
		JLabel lblAli = new JLabel("Ali");
		lblAli.setForeground(new Color(0, 0, 255));
		lblAli.setFont(new Font("Segoe UI Black", Font.PLAIN, 25));
		lblAli.setHorizontalAlignment(SwingConstants.CENTER);
		lblAli.setBounds(446, 302, 175, 59);
		frame.getContentPane().add(lblAli);
		
		JLabel lblGoogle_1 = new JLabel("Google");
		lblGoogle_1.setForeground(new Color(50, 205, 50));
		lblGoogle_1.setFont(new Font("Snap ITC", Font.PLAIN, 30));
		lblGoogle_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblGoogle_1.setBounds(239, 374, 252, 50);
		frame.getContentPane().add(lblGoogle_1);
		
		JLabel label_13 = new JLabel("");
		label_13.setIcon(new ImageIcon(TeamStatement.class.getResource("/Pic/background-board-caffeine-951234.jpg")));
		label_13.setBounds(0, 0, 703, 437);
		frame.getContentPane().add(label_13);
	}

}
