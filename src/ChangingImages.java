import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class ChangingImages extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	Random rand = new Random();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChangingImages frame = new ChangingImages();
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
	public ChangingImages() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(5, 0, 0, 0));
		
		JLabel lblProvechoHaveSome = new JLabel("Provecho! Have some breakfast!");
		lblProvechoHaveSome.setFont(new Font("Lucida Sans Typewriter", Font.BOLD | Font.ITALIC, 12));
		lblProvechoHaveSome.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblProvechoHaveSome);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(3, 0, 0, 0));
		
		
		JLabel lblFood = new JLabel("");
		lblFood.setIcon(new ImageIcon(ChangingImages.class.getResource("/images/eggs.jpeg")));
		lblFood.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblFood);
		
		/**
		 * drinks label
		 */
		JLabel lblDrink = new JLabel("");
		lblDrink.setIcon(new ImageIcon(ChangingImages.class.getResource("/images/coffee.jpeg")));
		lblDrink.setHorizontalAlignment(SwingConstants.CENTER);
		lblDrink.setHorizontalTextPosition(SwingConstants.LEADING);
		panel.add(lblDrink);
		
		/**
		 * sweets label
		 */
		JLabel lblSweets = new JLabel("");
		lblSweets.setIcon(new ImageIcon(ChangingImages.class.getResource("/images/french-toast.png")));
		lblSweets.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblSweets);
		
		JCheckBox checkFood = new JCheckBox("food");
		checkFood.setFocusable(false);
		checkFood.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(checkFood);
		
		JCheckBox checkSweets = new JCheckBox("sweets");
		checkSweets.setFocusable(false);
		checkSweets.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(checkSweets);
		
		JCheckBox checkDrink = new JCheckBox("drink");
		checkDrink.setFocusable(false);
		checkDrink.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(checkDrink);
		
		JButton btnUpdate = new JButton("update");
		btnUpdate.setFocusable(false);
		btnUpdate.setOpaque(true);
		btnUpdate.setMinimumSize(new Dimension(0, 0));
		btnUpdate.setMargin(new Insets(300, 300, 299, 300));
		btnUpdate.setContentAreaFilled(false);
		
		
		btnUpdate.addActionListener(new ActionListener() {
			int int1 = 0;
			int int2 = 0;
			int int3 = 0;
			int int4 = 1;
			public void actionPerformed(ActionEvent e) {
				
				/**
				 * this switches the sweets icon
				 */
				if (checkSweets.isSelected()) {
					switch (int1) {
					case 0:
						lblSweets.setIcon(new ImageIcon(ChangingImages.class.getResource("/images/pancakes.jpeg")));
						int1++;
						break;
					case 1:
						lblSweets.setIcon(new ImageIcon(ChangingImages.class.getResource("/images/french-toast.png")));
						int1++;
						break;
					case 2:
						lblSweets.setIcon(new ImageIcon(ChangingImages.class.getResource("/images/fruit-cup.jpeg")));
						int1 = 0;
						break;
					}
				}
				
				/**
				 * this switches the drinks icon
				 */
				if (checkDrink.isSelected()) {
					switch (int2) {
					case 0:
						lblDrink.setIcon(new ImageIcon(ChangingImages.class.getResource("/images/carrot.png")));
						int2++;
						break;
					case 1:
						lblDrink.setIcon(new ImageIcon(ChangingImages.class.getResource("/images/coffee.jpeg")));
						int2++;
						break;
					case 2:
						lblDrink.setIcon(new ImageIcon(ChangingImages.class.getResource("/images/orange.jpeg")));
						int2 = 0;
						break;
					}
				}
					
				/**
				 * this switches the food icon
				 */
				if (checkFood.isSelected()) {
					switch (int3) {
					case 0:
						lblFood.setIcon(new ImageIcon(ChangingImages.class.getResource("/images/eggs.jpeg")));
						int3++;
						break;
					case 1:
						lblFood.setIcon(new ImageIcon(ChangingImages.class.getResource("/images/cereal.jpeg")));
						int3++;
						break;
					case 2:
						lblFood.setIcon(new ImageIcon(ChangingImages.class.getResource("/images/omelette.jpeg")));
						int3 = 0;
						break;
					}
				}
				
				if ((!(checkFood.isSelected()) && (!checkSweets.isSelected()) && (!checkDrink.isSelected()))) {
					/**
					 * sweets label
					 */
					switch (int4) {
					case 1:
						panel.setBackground(Color.CYAN);
						int4++;
						break;
					case 2:
						panel.setBackground(Color.GREEN);
						int4++;
						break;
					case 3:
						panel.setBackground(Color.BLUE);
						int4++;
						break;
					case 4:
						panel.setBackground(Color.YELLOW);
						int4++;
						break;
					case 5:
						panel.setBackground(Color.RED);
						int4 = 1;
						break;
					}
					

				}
			}
		});
		btnUpdate.setPreferredSize(new Dimension(90, 90));
		panel_1.add(btnUpdate);

		
		
		/**
		 * food label
		 */
		
		/**
		 * these are the check-boxes to pick the thing you want to change
		 */
		
		
		/**
		 * 
		 *this button method randomizes the pictures in the labels
		 *
		 */
	}

}
