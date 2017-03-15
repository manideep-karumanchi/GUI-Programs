import java.applet.*;
import java.awt.*;
import java.awt.event.*;
//<applet code=RadioButton height=200 width=100></applet>
public class RadioButton extends Applet implements ItemListener{
	Checkbox mcb,fcb;
	Label gl;
	CheckboxGroup gcbg;
	String selectedGender="";
	public void init(){
		gcbg = new CheckboxGroup();
		mcb = new Checkbox("Male",gcbg,false);
		fcb = new Checkbox("Female",gcbg,false);
		
		gl=new Label("Gender");
		
		add(gl);add(mcb);add(fcb);
		mcb.addItemListener(this);
		fcb.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie){
		selectedGender= gcbg.getSelectedCheckbox().getLabel();
		repaint();
	}
	public void paint(Graphics g){
		g.drawString("Selected Gender is:"+selectedGender,10,90);
	}
}