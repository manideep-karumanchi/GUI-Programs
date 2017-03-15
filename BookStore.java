import java.applet.*;
import java.awt.*;
import java.awt.event.*;
//<applet code=BookStore height=200 width=100 ></applet>
public class BookStore extends Applet implements ItemListener{
	Checkbox jcb,cppcb,ccb;
	Label priceLabel;
	double price=0.0;
	public void init(){
		jcb = new Checkbox("Java");
		cppcb = new Checkbox("C++");
		ccb = new Checkbox("C");
		
		priceLabel=new Label("0.0");
		
		add(jcb);add(cppcb);add(ccb);
		add(priceLabel);
		jcb.addItemListener(this);
		cppcb.addItemListener(this);
		ccb.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie){
		Checkbox cb = (Checkbox)ie.getSource();
		if(cb.equals(jcb)){
			price+=cb.getState()?200:-200;
		}
		else if(cb.equals(cppcb)){
			price+=cb.getState()?300:-300;
		}
		else if(cb.equals(ccb)){
			price+=cb.getState()?400:-400;
		}
		priceLabel.setText(""+price);
	}
}