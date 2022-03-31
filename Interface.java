import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class Interface extends JFrame {
	static class game {
		static char[] state;
		static double score;
		static int move;
	}

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface frame = new Interface();
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
	public Interface() {
		setTitle("Spçle");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 670, 411);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTextArea txtrKasIesksSpli = new JTextArea();
		txtrKasIesksSpli.setBackground(UIManager.getColor("Button.background"));
		txtrKasIesksSpli.setFont(new Font("Monospaced", Font.PLAIN, 19));
		txtrKasIesksSpli.setEditable(false);
		txtrKasIesksSpli.setBounds(103, 102, 192, 24);
		txtrKasIesksSpli.setText("Kas iesâks spçli?");
		contentPane.add(txtrKasIesksSpli);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Spçlçtâjs");
		rdbtnNewRadioButton.setBounds(144, 157, 82, 23);
		contentPane.add(rdbtnNewRadioButton);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Dators");
		rdbtnNewRadioButton_1.setBounds(150, 198, 76, 23);
		contentPane.add(rdbtnNewRadioButton_1);

		ButtonGroup first = new ButtonGroup();
		first.add(rdbtnNewRadioButton);
		first.add(rdbtnNewRadioButton_1);

		JButton btnNewButton = new JButton("Sâkt spçli!");
		btnNewButton.setBounds(266, 251, 109, 23);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Atpakaï");
		btnNewButton_1.setBounds(274, 302, 89, 23);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.setVisible(false);

		JButton btnNewButton_2 = new JButton("Veikt gâjienu");
		btnNewButton_2.setBounds(266, 271, 109, 23);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.setVisible(false);

		textField = new JTextField();
		textField.setBounds(294, 182, 48, 55);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setVisible(false);

		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 15));
		textArea.setBackground(SystemColor.text);
		textArea.setEditable(false);
		textArea.setBounds(266, 48, 101, 31);
		contentPane.add(textArea);

		JTextArea txtrLdzuIevadtPra = new JTextArea();
		txtrLdzuIevadtPra.setBackground(SystemColor.menu);
		txtrLdzuIevadtPra.setEditable(false);
		txtrLdzuIevadtPra.setText("Lûdzu ievadiet burtu\r\npâra numuru pçc kârtas!");
		txtrLdzuIevadtPra.setBounds(72, 181, 202, 47);
		contentPane.add(txtrLdzuIevadtPra);
		txtrLdzuIevadtPra.setVisible(false);

		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBackground(SystemColor.text);
		textArea_1.setEditable(false);
		textArea_1.setBounds(294, 90, 46, 36);
		contentPane.add(textArea_1);
		textArea_1.setVisible(false);

		JTextArea txtrPieejamieCipari = new JTextArea();
		txtrPieejamieCipari.setBackground(SystemColor.menu);
		txtrPieejamieCipari.setEditable(false);
		txtrPieejamieCipari.setText("S\u0101kuma\r\nburti:");
		txtrPieejamieCipari.setBounds(195, 43, 60, 36);
		contentPane.add(txtrPieejamieCipari);

		JTextArea txtrPunktuSkaits = new JTextArea();
		txtrPunktuSkaits.setBackground(SystemColor.menu);
		txtrPunktuSkaits.setEditable(false);
		txtrPunktuSkaits.setText("Punktu\r\nskaits:");
		txtrPunktuSkaits.setBounds(195, 90, 76, 47);
		contentPane.add(txtrPunktuSkaits);
		txtrPunktuSkaits.setVisible(false);

		JTextArea txtrIevadtaisNumursIr = new JTextArea();
		txtrIevadtaisNumursIr.setBackground(SystemColor.menu);
		txtrIevadtaisNumursIr.setEditable(false);
		txtrIevadtaisNumursIr.setText("Ievadîtais numurs ir\r\nârpuss spçles vçrtîbâm!");
		txtrIevadtaisNumursIr.setBounds(376, 182, 189, 47);
		contentPane.add(txtrIevadtaisNumursIr);
		txtrIevadtaisNumursIr.setVisible(false);

		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBackground(SystemColor.menu);
		textArea_2.setEditable(false);
		textArea_2.setBounds(211, 53, 215, 22);
		contentPane.add(textArea_2);
		textArea_2.setVisible(false);

		JTextArea txtrKasMaksimizsPunktus = new JTextArea();
		txtrKasMaksimizsPunktus.setEditable(false);
		txtrKasMaksimizsPunktus.setBackground(SystemColor.menu);
		txtrKasMaksimizsPunktus.setFont(new Font("Monospaced", Font.PLAIN, 19));
		txtrKasMaksimizsPunktus.setText("Kas maksimizçs punktus?");
		txtrKasMaksimizsPunktus.setBounds(350, 102, 258, 31);
		contentPane.add(txtrKasMaksimizsPunktus);

		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Spçlçtâjs");
		rdbtnNewRadioButton_2.setBounds(406, 157, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2);

		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Dators");
		rdbtnNewRadioButton_3.setBounds(406, 198, 109, 23);
		contentPane.add(rdbtnNewRadioButton_3);

		ButtonGroup max = new ButtonGroup();
		max.add(rdbtnNewRadioButton_2);
		max.add(rdbtnNewRadioButton_3);

		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setForeground(SystemColor.inactiveCaptionText);
		separator.setBounds(316, 90, 2, 150);
		contentPane.add(separator);

		game.state = Code.CreateStart();
		textArea.setText(String.valueOf(game.state));

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (first.getSelection() != null && max.getSelection() != null) {
					btnNewButton_1.setVisible(true);
					btnNewButton_2.setVisible(true);
					textField.setVisible(true);
					textArea_1.setVisible(true);
					textArea_2.setVisible(true);
					txtrLdzuIevadtPra.setVisible(true);
					txtrPieejamieCipari.setText("Pieejamie\r\nburti:");
					txtrPunktuSkaits.setVisible(true);

					separator.setVisible(false);
					txtrKasIesksSpli.setVisible(false);
					txtrKasMaksimizsPunktus.setVisible(false);
					btnNewButton.setVisible(false);
					rdbtnNewRadioButton.setVisible(false);
					rdbtnNewRadioButton_1.setVisible(false);
					rdbtnNewRadioButton_2.setVisible(false);
					rdbtnNewRadioButton_3.setVisible(false);
					game.move = 0;
					game.score = 0;

					if (rdbtnNewRadioButton_1.isSelected()) {
						if (rdbtnNewRadioButton_2.isSelected()) {
							int aiMove = Code.BestMove(game.state, true, 0);
							game.score = Code.CheckPairPoints(game.state[aiMove], game.state[aiMove - 1]);
							game.state = Code.Create(game.state, aiMove);
							textArea.setText(String.valueOf(game.state));
							game.move++;
						} else {
							int aiMove = Code.BestMove(game.state, false, 0);
							game.score = Code.CheckPairPoints(game.state[aiMove], game.state[aiMove - 1]);
							game.state = Code.Create(game.state, aiMove);
							textArea.setText(String.valueOf(game.state));
							game.move++;
						}
					}
					textArea_1.setText(String.valueOf(game.score));
				}
			}
		});

		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Interface over = new Interface();
				over.main(null);
			}
		});

		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((rdbtnNewRadioButton.isSelected() && game.move % 2 == 0)
						|| (rdbtnNewRadioButton_1.isSelected() && game.move % 2 == 1)) {
					try {
						Integer.parseInt(textField.getText());
					} catch (NumberFormatException f) {
						txtrIevadtaisNumursIr.setVisible(true);
					} catch (NullPointerException f) {
						txtrIevadtaisNumursIr.setVisible(true);
					}
					int playerMove = Integer.parseInt(textField.getText());
					if (playerMove > (game.state).length - 1 || playerMove < 1) {
						txtrIevadtaisNumursIr.setVisible(true);
					} else {
						txtrIevadtaisNumursIr.setVisible(false);
						textArea.setText(null);
						game.score = game.score
								+ Code.CheckPairPoints(game.state[playerMove], game.state[playerMove - 1]);
						game.state = Code.Create(game.state, playerMove);
						textArea_1.setText(String.valueOf(game.score));
						textArea.setText(String.valueOf(game.state));
						textField.setVisible(false);
						game.move++;
					}

				} else {
					textField.setText(null);
					if (rdbtnNewRadioButton_2.isSelected()) {
						int aiMove = Code.BestMove(game.state, false, 0);
						game.score = game.score + Code.CheckPairPoints(game.state[aiMove], game.state[aiMove - 1]);
						game.state = Code.Create(game.state, aiMove);
						textArea.setText(String.valueOf(game.state));
					} else {
						int aiMove = Code.BestMove(game.state, true, 0);
						game.score = game.score + Code.CheckPairPoints(game.state[aiMove], game.state[aiMove - 1]);
						game.state = Code.Create(game.state, aiMove);
						textArea.setText(String.valueOf(game.state));
					}
					textArea_1.setText(String.valueOf(game.score));
					textField.setVisible(true);
					game.move++;
				}
				if (game.move == 9) {
					btnNewButton_2.setVisible(false);
					textField.setVisible(false);
					textArea.setVisible(false);
					txtrLdzuIevadtPra.setVisible(false);
					txtrPieejamieCipari.setVisible(false);
					txtrIevadtaisNumursIr.setVisible(false);
					textArea_2.setVisible(true);

					if (game.score == 0)
						textArea_2.setText("Ir neizðíirsts!");
					if (rdbtnNewRadioButton_2.isSelected()) {
						if (game.score > 0)
							textArea_2.setText("Spçlçtâjs uzvar!");
						else
							textArea_2.setText("Dators uzvar!");
					} else {
						if (game.score > 0)
							textArea_2.setText("Dators uzvar!");
						else
							textArea_2.setText("Spçlçtâjs uzvar!");
					}
				}

			}
		});
	}
}
