import javax.swing.JFrame;

class SimpleWindow extends JFrame
{
	public static void main(String[] args) {
		new SimpleWindow();
	}

	public SimpleWindow()
	{
		this.setSize(400,400);
		this.setLocationRelativeTo(null);
		this.setVisible(true);	
	}
}
