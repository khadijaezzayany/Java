import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TextColor implements ActionListener {
	JPanel panel;
	JFrame frame;
	JButton button;
	JLabel label;
	ArrayList<String> GENquestions = new ArrayList<String>();

	public TextColor() {
		frame = new JFrame();
		button = new JButton("MONTRER UN AUTRE FAIT");
		panel = new JPanel();
		label = new JLabel();
		JLabel label3 = new JLabel();

		panel.setBorder(BorderFactory.createEmptyBorder(25, 25, 25, 25));
		panel.setLayout(new GridLayout(0, 1));

		frame.setSize(600, 400);
		frame.setVisible(true);
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setTitle("Le saviez-vous");

		button.setSize(20, 20);
		button.setFont(new Font("Verdana", Font.BOLD, 15));
		// panel.setBackground(Color.BLUE);
		button.addActionListener(this);

		panel.setLayout(new BorderLayout());
		panel.add(BorderLayout.SOUTH, button);

		panel.add(label3);
		label3.setText("Le saviez-vous?");
		label3.setFont(new Font("Comic Sans MS", Font.PLAIN, 19));
		panel.add(BorderLayout.NORTH, label3);

		panel.add(label);
		label.setText("La biére ne fait pas prendre du vente.");
		label.setFont(new Font("Comic Sans MS", Font.PLAIN, 19));
		panel.add(BorderLayout.CENTER, label);

		GENquestions.add("Who was the second President of the United States?");
		GENquestions.add("The youngest son of Bob Marley was who?");
		GENquestions.add("In the film '8 Mile', the character portrayed by Eminem is known as what?");
		GENquestions.add("What is the capital city of New Zealand?");
		GENquestions.add("What is the capital city of Australia?");
		GENquestions.add("How many millilitres are there in an English pint?");
		GENquestions.add("What was the biggest selling game for the PS2 worldwide?");

	}

	public void actionPerformed(ActionEvent arg0) {
		int r = (int) (Math.random() * (256));
		int g = (int) (Math.random() * (256));
		int b = (int) (Math.random() * (256));
		Color c = new Color(r, g, b);
		panel.setBackground(c);
		button.setForeground(c);

		Random rand = new Random();
		int randomX = rand.nextInt(GENquestions.size());
		String element = GENquestions.get(randomX);

		label.setText(element);

	}

}
