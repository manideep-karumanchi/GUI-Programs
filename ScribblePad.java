/*<applet code=ScribblePad height=400 width=400></applet>*/
import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;
public class ScribblePad extends Applet{
	int x,y,nx,ny;
	public void init(){
		this.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent me){
			x=me.getX();
			y=me.getY();
		}
		});
		this.addMouseMotionListener(new MouseMotionAdapter(){
			public void mouseDragged(MouseEvent me){
				nx=me.getX();
				ny=me.getY();
				repaint();
			}
		});
	}
	public void update(Graphics g){
		g.drawLine(x,y,nx,ny);
		x=nx;
		y=ny;
	}
}

