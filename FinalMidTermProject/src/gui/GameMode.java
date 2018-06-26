package gui;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

public class GameMode {

	private JFrame frame;
	private Button button;
	public GameMode() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 592, 403);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("GameMode");
		lblNewLabel.setForeground(new Color(0, 139, 139));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Yu Gothic Light", Font.PLAIN, 35));
		lblNewLabel.setBounds(188, 33, 188, 43);
		frame.getContentPane().add(lblNewLabel);
		
		button = new Button("SinglePlayer");
		button.setBackground(new Color(0, 153, 204));
		button.setForeground(Color.WHITE);
		button.setFont(new Font("A3 Arial AzLat", Font.ITALIC, 15));
		button.setBounds(188, 118, 188, 33);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				LoginPage loginPage = new LoginPage();
				
			}
		});
		frame.getContentPane().add(button);
		
		Button button_1 = new Button("MultiPlayer");
		button_1.setForeground(Color.WHITE);
		button_1.setBackground(new Color(0, 51, 153));
		button_1.setFont(new Font("A3 Arial AzLat", Font.ITALIC, 15));
		button_1.setBounds(188, 178, 188, 33);
		frame.getContentPane().add(button_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(GameMode.class.getResource("/images/GameModePic.jpg")));
		lblNewLabel_1.setBounds(0, 0, 584, 356);
		frame.getContentPane().add(lblNewLabel_1);
		frame.setVisible(true);
		frame.setFocusable(false);
	}

	public Button getButton() {
		return button;
	}

	public JFrame getFrame() {
		return frame;
	}
	
}
