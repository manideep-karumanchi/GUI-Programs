import java.applet.*;
import java.awt.*;
import java.awt.event.*;
class FrameExample extends Frame{
	Label sl,nl,el,wl,cl;
	FrameExample(){
		
		super("Temp Converter");
		
		cl = new Label("Center");
		nl = new Label("North");
		el = new Label("East");
		wl = new Label("West");
		sl = new Label("South");
		
		add(sl,BorderLayout.SOUTH);
		add(cl,BorderLayout.CENTER);
		add(nl,BorderLayout.NORTH);
		add(el,BorderLayout.EAST);
		add(wl,BorderLayout.WEST);
		
		setSize(200,200);
		setVisible(true);
	}
	
	public static void main(String[] args){
		new FrameExample();
	}
}