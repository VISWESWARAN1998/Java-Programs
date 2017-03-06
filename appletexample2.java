// Author : Visweswaran

import java.awt.*;
import java.applet.*;


public class appletexample2 extends Applet implements Runnable{
	Thread t = null;
	int no = 10;
	volatile boolean stop;
	public void init()
	{
		this.setBackground(Color.magenta);
		this.setForeground(Color.black);
	}
	public void start()
	{
		t = new Thread(this);
		stop = false;
		t.start();
	}
	public void stop()
	{
		stop=true;
		t=null;
	}
	public void run()
	{
		for(;;)
		{
			try
			{
				repaint();
				Thread.sleep(100);
				if(stop)break;
			}
			catch(InterruptedException e)
			{
				
			}
		}
	}
	public void destroy()
	{
		
	}
	public void paint(Graphics g)
	{
		if(no==1000)no=10;
		g.drawRect(no, 50, 500, 200);
		g.fillRect(no, 50, 500, 100);
		g.fillOval(no+10, 250, 100, 100);
		g.fillOval(no+400, 250, 100, 100);
		g.drawLine(0, 350, no+1000, 350);
		g.drawString("Programmed by Visweswaran",200+(no-10),500);
		showStatus("Bus is moving...");
		no+=10;
	}
}
