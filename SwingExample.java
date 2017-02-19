// Author : Visweswaran

import javax.swing.JFrame;


class Main extends JFrame
{
	Main()
	{
		setSize(400,400);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}

public class SwingExample extends JFrame {
	public static void main(String[] args) {
		Main frame = new Main();
		frame.setTitle("This can also be done");
	}
}
