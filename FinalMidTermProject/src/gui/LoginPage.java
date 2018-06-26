package gui;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Button;

import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.SwingConstants;

import singlePlayerMode.GameBoard;
import singlePlayerMode.Player;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

public class LoginPage {

	private JFrame frame;
	private JTextField textField;
	private Button button;
	
	public LoginPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 17));
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 619, 416);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		button = new Button("Join");
		button.setForeground(Color.WHITE);
		button.setBackground(new Color(30, 144, 255));
		button.setBounds(358, 244, 143, 31);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				Thread th=new Thread(new Runnable() {
					
					@Override
					public void run() {
			    		Player player = new Player(textField.getText());
			    		GameBoard gameBoard = new GameBoard(player);
						try {
							gameBoard.runGameBoard();
						} catch (Exception e) {
							System.out.println(e.getMessage());
						}
					}
				});
				th.start();
			}
		});
		frame.getContentPane().add(button);
		
		textField = new JTextField("Ali");
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0){
				textField.setText("");
			}
		});
		textField.setBounds(358, 184, 143, 31);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Log In");
		lblNewLabel.setForeground(new Color(0, 0, 139));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 38));
		lblNewLabel.setBounds(370, 34, 119, 48);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblPlayerName = new JLabel("Player Name :");
		lblPlayerName.setForeground(new Color(0, 191, 255));
		lblPlayerName.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 13));
		lblPlayerName.setBounds(358, 167, 81, 16);
		frame.getContentPane().add(lblPlayerName);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(LoginPage.class.getResource("/images/LoginPagePic.jpg")));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 0, 601, 369);
		frame.getContentPane().add(lblNewLabel_1);
		frame.setVisible(true);
		frame.setFocusable(false);
	}

	public Button getButton() {
		return button;
	}
	public JTextField getTextField() {
		return textField;
	}
	public JFrame getFrame() {
		return frame;
	}
}