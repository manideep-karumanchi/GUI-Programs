import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code=KeyDemo height=300 width=300></applet>*/
public class KeyDemo extends Applet implements KeyListener{
	int x=150,y=150,dx=0,dy=0;
	public void init(){
		setFocusable(true);
		this.addKeyListener(this);
	}
	public void keyPressed(KeyEvent ke){
		if(ke.getKeyCode()==KeyEvent.VK_UP){
			dy=-2;
			dx=0;
			repaint();
		}
		else if(ke.getKeyCode()==KeyEvent.VK_DOWN){
			dy=2;
			dx=0;
			repaint();
		}
		else if(ke.getKeyCode()==KeyEvent.VK_LEFT){
			dx=-2;
			dy=0;
			repaint();
		}
		else if(ke.getKeyCode()==KeyEvent.VK_RIGHT){
			dx=2;
			dy=0;
			repaint();
		}
	}
	public void keyReleased(KeyEvent ke){}
	public void keyTyped(KeyEvent ke){
	}
	public void paint(Graphics g){
		x=x+dx;y=y+dy;
		g.fillOval(x,y,30,30);
	}
}