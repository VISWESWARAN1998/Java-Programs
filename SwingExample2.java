// Author : Visweswaran

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

class Design extends JFrame
{
	Design()
	{
		this.setTitle("Database");
		this.setSize(400,400);
		JPanel mainPanel = new JPanel();
		JLabel label1 = new JLabel("Testing...");
		JButton button = new JButton("A button 1");
		mainPanel.add(label1);
		this.add(mainPanel);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}


public class SwingExample2 {
public static void main(String[] args) {
	new Design();
}
}
