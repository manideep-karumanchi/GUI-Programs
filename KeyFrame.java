import java.awt.*;
import java.awt.event.*;
class KeyFrame extends Frame implements KeyListener,WindowListener{
	int x=150,y=150,dx=0,dy=0;
	KeyFrame(String title){
		super(title);
		this.setFocusable(true);
		setSize(300,300);
		setVisible(true);
		this.addWindowListener(this);
		this.addKeyListener(this);
	}
	public void windowActivated(WindowEvent we){}
	public void windowClosed(WindowEvent we){
		
	}
	public void windowClosing(WindowEvent we){
		setVisible(false);
	}
	public void windowDeactivated(WindowEvent we){}
	public void windowDeiconified(WindowEvent we){}
	public void windowIconified(WindowEvent we){}
	public void windowOpened(WindowEvent we){}
	public void keyPressed(KeyEvent ke){
		if(ke.getKeyCode()==KeyEvent.VK_LEFT){
			dx=-2;
			dy=0;
			repaint();
		}
		else if(ke.getKeyCode()==KeyEvent.VK_RIGHT){
			dx=2;
			dy=0;
			repaint();
		}
		else if(ke.getKeyCode()==KeyEvent.VK_UP){
			dx=0;
			dy=-2;
			repaint();
		}
		else if(ke.getKeyCode()==KeyEvent.VK_DOWN){
			dx=0;
			dy=2;
			repaint();
		}
	}
	public void keyReleased(KeyEvent ke){}
	public void keyTyped(KeyEvent ke){}
	public void update(Graphics g){
		x=x+dx;
		y=y+dy;
		g.fillOval(x,y,30,40);
	}
	public static void main(String[] args){
		new KeyFrame("Key Events Demo");
	}
}