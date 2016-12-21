import javax.swing.*;


public class SimpleWindowWithTitle extends JFrame{
public static void main(String[] args) {
	new SimpleWindowWithTitle();
}
public SimpleWindowWithTitle()
{
	this.setSize(400,600);
	this.setLocationRelativeTo(null);
	this.setResizable(false);
	this.setTitle("This is a frame with a Title");
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setVisible(true);
}
}
