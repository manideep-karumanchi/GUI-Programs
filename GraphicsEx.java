import java.awt.*;
import java.applet.Applet;
//<applet code="GraphicsEx.class" width="300" height="300"></applet>
public class GraphicsEx extends Frame{
	GraphicsEx(){
		setSize(400,400);
		setVisible(true);
	}
	public void paint(Graphics g){
		g.drawLine(10,10,100,10);
		g.drawRect(10,20,50,50);
		
		g.fillRect(70,20,50,50);
		g.drawOval(10,90,50,50);
		g.fillOval(70,90,50,50);
		g.drawArc(10,150,50,50,0,180);
		int x[]={10,200,10,200,10};
		int y[]={450,450,650,650,450};
		g.fillPolygon(x,y,5);
	}
	public static void main(String[] args){
		new GraphicsEx();
	}
}