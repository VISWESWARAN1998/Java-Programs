// Author: Visweswaran

import java.applet.*;
import java.awt.*;

/*
 * <applet code="appletExample" width=300 height=100>
 * </applet>
 */
public class appletExample extends Applet {
	public void init()
	{
		this.setBackground(Color.CYAN);
		this.setForeground(Color.BLACK);
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
		g.drawString("Hello world from applet", 10, 10);
	}
}
