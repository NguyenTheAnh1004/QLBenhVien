package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class quantriGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					quantriGUI frame = new quantriGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public quantriGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 629);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		panel.setBounds(0, 0, 886, 93);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("H\u1EC7 th\u1ED1ng qu\u1EA3n l\u00FD b\u1EC7nh vi\u1EC7n");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 36));
		lblNewLabel.setBounds(272, 23, 509, 51);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Danh s\u00E1ch b\u1EC7nh nh\u00E2n");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setIcon(new ImageIcon("Image\\bill-12-32.png"));
		btnNewButton.setBounds(0, 92, 214, 58);
		contentPane.add(btnNewButton);
		
		JButton btnDanhSchBc = new JButton("Danh s\u00E1ch b\u00E1c s\u0129");
		btnDanhSchBc.setIcon(new ImageIcon("Image\\bill-12-32.png"));
		btnDanhSchBc.setHorizontalAlignment(SwingConstants.LEFT);
		btnDanhSchBc.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnDanhSchBc.setBounds(0, 147, 214, 58);
		contentPane.add(btnDanhSchBc);
		
		JButton btnDanhSchNhn = new JButton("Danh s\u00E1ch nh\u00E2n vi\u00EAn");
		btnDanhSchNhn.setIcon(new ImageIcon("Image\\bill-12-32.png"));
		btnDanhSchNhn.setHorizontalAlignment(SwingConstants.LEFT);
		btnDanhSchNhn.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnDanhSchNhn.setBounds(0, 203, 214, 65);
		contentPane.add(btnDanhSchNhn);
		
		JButton btnDanhSchTi = new JButton("Danh s\u00E1ch t\u00E0i kho\u1EA3n");
		btnDanhSchTi.setIcon(new ImageIcon("Image\\bill-12-32.png"));
		btnDanhSchTi.setHorizontalAlignment(SwingConstants.LEFT);
		btnDanhSchTi.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnDanhSchTi.setBounds(0, 262, 214, 58);
		contentPane.add(btnDanhSchTi);
		
		JButton btnNewButton_7 = new JButton("B\u00E1o c\u00E1o");
		btnNewButton_7.setIcon(new ImageIcon("Image\\statistic-2-32.png"));
		btnNewButton_7.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_7.setBounds(0, 318, 214, 58);
		contentPane.add(btnNewButton_7);
		
		JLabel lblNewLabel_1 = new JLabel("Xin ch\u00E0o qu\u1EA3n tr\u1ECB vi\u00EAn");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1.setBounds(498, 132, 256, 52);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("Image\\customer-service-78-256.png"));
		lblNewLabel_2.setBounds(498, 232, 248, 255);
		contentPane.add(lblNewLabel_2);
	}

}
