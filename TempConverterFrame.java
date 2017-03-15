import java.applet.*;
import java.awt.*;
import java.awt.event.*;
class TempConverterFrame extends Frame implements ActionListener{
	Label cl,fl;
	TextField ctf,ftf;
	Button cbtn,rbtn;
	TempConverterFrame(){
		
		super("Temp Converter");
		this.setLayout(new FlowLayout());
		
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
		
		setSize(200,200);
		setVisible(true);
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
	public static void main(String[] args){
		new TempConverterFrame();
	}
}