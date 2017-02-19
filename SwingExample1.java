// Author: Visweswaran

/*
 *  Panels explained
 */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;


class Frame extends JFrame
{
	Frame()
	{
		setSize(400,600);
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Hello world from Java swing");
		label.setToolTipText("This is to explain the usage of panels and frames in JAVA swing");
		//add label to the panel
		panel.add(label);
		//add the panel to the frame 
		add(panel);
	}
}


public class SwingExample1 {
public static void main(String[] args) {
	Frame obj = new Frame();
	obj.setVisible(true);
	
}
}
