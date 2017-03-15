import java.awt.*;
import java.awt.event.*;
class ScrollbarDemo extends Frame implements MouseMotionListener,AdjustmentListener{
	Scrollbar vsb,hsb;
	ScrollbarDemo(){
		setLayout(new FlowLayout());
		vsb = new Scrollbar(Scrollbar.VERTICAL,0,1,0,300);
		hsb = new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,300);
		
		vsb.setPreferredSize(new Dimension(20,100));
		hsb.setPreferredSize(new Dimension(100,20));
		add(vsb);
		add(hsb);
		setSize(300,300);
		setVisible(true);
		addMouseMotionListener(this);
		vsb.addAdjustmentListener(this);
		hsb.addAdjustmentListener(this);
	}
	public void adjustmentValueChanged(AdjustmentEvent ae){
		repaint();
	}
	public void mouseDragged(MouseEvent me){
		int x=me.getX();
		int y=me.getY();
		vsb.setValue(y);
		hsb.setValue(x);
	}
	public void mouseMoved(MouseEvent me){
	}
	public static void main(String[] args){
		new ScrollbarDemo();
	}
	public void paint(Graphics g){
		g.drawString("*",hsb.getValue(),vsb.getValue());
		
	}
}