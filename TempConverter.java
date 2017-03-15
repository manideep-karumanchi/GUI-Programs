import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code=TempConverter height=100 width=100></applet>*/
public class TempConverter extends Applet implements ActionListener{
	Label cl,fl;
	TextField ctf,ftf;
	Button cbtn,rbtn;
	public void init(){
		cl = new Label("Celsius");
		fl = new Label("Fahrenheit");
		
		ctf = new TextField(30);
		ftf = new TextField(30);
		
		cbtn = new Button("Convert");
		rbtn= new Button("Reset");
		
		add(cl);
		add(ctf);
		
		add(fl);
		add(ftf);
		
		add(cbtn);
		add(rbtn);
		
		cbtn.addActionListener(this);
		rbtn.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getActionCommand().equals("Convert")){
			String cTempStr=ctf.getText();
			if(!cTempStr.equals("")){
				double cTemp=Double.parseDouble(cTempStr);
				double fTemp=(cTemp*(9.0/5.0))+32;
				String fTempStr=String.valueOf(fTemp);
				ftf.setText(fTempStr);
			}
			else{
				ftf.setText("0.0");
			}
		}
		else{
			ftf.setText("");
			ctf.setText("");
		}
	}
}