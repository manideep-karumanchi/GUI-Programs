import java.applet.*;
import java.awt.*;
import java.awt.event.*;
//<applet code=ListDemo height=300 width=300></applet>
public class ListDemo extends Applet implements ItemListener{
	List branch;
	String si="";
	public void init(){
		branch = new List(5,true);
		branch.add("Civil");
		branch.add("Chemical");
		branch.add("CSE");
		branch.add("ECE");
		branch.add("EEE");
		branch.add("EIE");
		branch.add("IT");
		branch.add("ME");
		add(branch);
		branch.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie){
		si=branch.getSelectedItem();
		repaint();
	}
	public void paint(Graphics g){
		g.drawString("Selected branch is:"+si,10,100);
	}
}