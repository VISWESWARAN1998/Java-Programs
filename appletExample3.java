// Author : Visweswaran

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CalculateOddorEven
{
	boolean isoddOrEven(int no)
	{
		if(no%2==0)return true;
		else return false;
	}
}

public class appletExample3 extends Applet
{
	TextField get;
	Button calculate;
	public void init()
	{
		get = new TextField();
		calculate = new Button();
		ButtonClick click = new ButtonClick();
		calculate.addActionListener(click);
		calculate.setBounds(10,130,120,30);
		calculate.setLabel("Calculate");
		get.setBounds(10,120,400, 20);
		this.add(get);
		this.add(calculate);
		this.setLayout(null);
		
	}
	public void start()
	{
		
	}
	public void stop()
	{
		
	}
	public void destroy()
	{
		
	}
	public void paint(Graphics g)
	{
		g.drawString("Enter the no to find whether it is odd or even", 10, 20);
		showStatus("ODD OR EVEN PROGRAM");
	}
	class ButtonClick implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			String no = get.getText().toString();
			Integer integer = Integer.parseInt(no);
			boolean answer = new CalculateOddorEven().isoddOrEven(integer);
			if(answer==true)get.setText("EVEN NO");
			else get.setText("ODD NO");
		}
		
	}
}
