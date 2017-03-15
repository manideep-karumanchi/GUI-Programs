import java.awt.*;
import java.awt.event.*;
class RegistrationForm extends Frame implements ActionListener{
	String msg="";
	GridBagLayout gbag;
	GridBagConstraints gbc;
	Label rl,nl,gl,bl,sl,al,hl,el,cl;
	TextField rtf,ntf,etf,ctf;
	TextArea ata;
	Checkbox mcb,fcb,h1cb,h2cb,h3cb;
	CheckboxGroup gcbg;
	List slst;
	Choice blst;
	Button sb,rb;
	RegistrationForm(String title){
		super(title);
		gbag=new GridBagLayout();
		setLayout(gbag);
		gbc=new GridBagConstraints();
		
		gbc.gridwidth=GridBagConstraints.RELATIVE;
		rl=new Label("Regd. No.");
		gbag.setConstraints(rl,gbc);
		
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		rtf=new TextField(30);
		gbag.setConstraints(rtf,gbc);
		
		gbc.gridwidth=GridBagConstraints.RELATIVE;
		nl=new Label("Name");
		gbag.setConstraints(nl,gbc);
		
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		ntf=new TextField(30);
		gbag.setConstraints(ntf,gbc);
		
		gbc.gridwidth=GridBagConstraints.RELATIVE;
		gl=new Label("Gender");
		gbag.setConstraints(gl,gbc);
		
		gcbg=new CheckboxGroup();
		mcb=new Checkbox("Male",gcbg,false);
		fcb=new Checkbox("Female",gcbg,false);
		
		gbc.gridwidth=GridBagConstraints.RELATIVE;
		gbag.setConstraints(mcb,gbc);
		
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		gbag.setConstraints(fcb,gbc);
		
		gbc.gridwidth=GridBagConstraints.RELATIVE;
		bl=new Label("Branch");
		gbag.setConstraints(bl,gbc);
		
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		blst=new Choice();
		gbag.setConstraints(blst,gbc);
		blst.add("CE");
		blst.add("CH");
		blst.add("CSE");
		blst.add("ECE");
		blst.add("EEE");
		blst.add("IT");
		
		gbc.gridwidth=GridBagConstraints.RELATIVE;
		sl=new Label("Section");
		gbag.setConstraints(sl,gbc);
		
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		slst=new List();
		gbag.setConstraints(slst,gbc);
		slst.add("A");
		slst.add("B");
		slst.add("C");
		
		gbc.gridwidth=GridBagConstraints.RELATIVE;
		al=new Label("Address");
		gbag.setConstraints(al,gbc);
		
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		ata=new TextArea(5,30);
		gbag.setConstraints(ata,gbc);
		
		gbc.gridwidth=GridBagConstraints.RELATIVE;
		sb=new Button("Submit");
		gbag.setConstraints(sb,gbc);
		
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		rb=new Button("Reset");
		gbag.setConstraints(rb,gbc);
		
		add(rl);add(rtf);
		add(nl);add(ntf);
		add(gl);add(mcb);add(fcb);
		add(bl);add(blst);
		add(sl);add(slst);
		add(al);add(ata);
		add(sb);add(rb);
		
		setSize(300,350);
		setVisible(true);
		
		sb.addActionListener(this);
		rb.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getActionCommand().equals("Submit")){
			msg+="Regd. No.:"+rtf.getText();
			msg+=" Name:"+ntf.getText();
			msg+=" Gender:"+gcbg.getSelectedCheckbox().getLabel();
			msg+=" Branch:"+blst.getSelectedItem();
			msg+=" Section:"+slst.getSelectedItem();
			repaint();
		}
	}
	public void paint(Graphics g){
		g.drawString(msg,10,350);
	}
	public static void main(String[] args){
		new RegistrationForm("Registration Form");
	}
}