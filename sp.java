/*<applet code=sp height=400 width=400></applet>*/
import java.applet.*;
import java.awt.event.*;
import java.awt.*;
public class sp extends Applet implements MouseListener,MouseMotionListener{
	int x,y,nx,ny;
	String msg="";
	public void init(){
		
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	public void mouseEntered(MouseEvent me){
		msg="Mouse Entered("+me.getX()+","+me.getY()+")";
	}
	public void mouseExited(MouseEvent me){}
	public void mouseClicked(MouseEvent me){
		x=me.getX();
		y=me.getY();
	}
	public void mousePressed(MouseEvent me){
		
	}
	public void mouseReleased(MouseEvent me){}

	public void mouseMoved(MouseEvent me){}
	public void mouseDragged(MouseEvent me){
		nx=me.getX();
		ny=me.getY();
		repaint();
	}
	public void update(Graphics g){
		showStatus(msg);
		g.setColor(Color.black);
		g.drawLine(x,y,nx,ny);
		x=nx;
		y=ny;
	}
}