import java.awt.Graphics;
import java.applet.Applet;
/*
<applet code="AppletEx.class" width="300" height="300">
			<param name="data" value="Helloo" />
			<param name="data1" value="Helloo1" />
		</applet>
*/
public class AppletEx extends Applet{
	public void init(){
		
		System.out.println("Init");
	}
	public void start(){
		System.out.println("Start");
	}
	public void stop(){
		System.out.println("Stop");
	}
	public void destroy(){
		System.out.println("Destroy");
	}
	public void paint(Graphics g){
		g.drawString(getParameter("data"),20,20);
		g.drawString(getParameter("data1"),20,50);
		System.out.println("Paint");
	}
}