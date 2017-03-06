// Author: Visweswaran

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

/*
 <applet code="appletImage.class" height=300 width=300>
 </applet>
 */

public class appletsImage extends Applet
{
	Image display;
	public void init()
	{
		display = getImage(getDocumentBase(),"lonelyBird.jpg");
	}
	public void paint(Graphics g)
	{
		g.drawImage(display,0,0,this);
	}
	
}
