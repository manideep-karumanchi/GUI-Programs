import java.awt.*;
import java.awt.event.*;
class SignUpForm extends Frame implements ActionListener{
	Label nl,rnl,gl,dobl,al,cl,hl;
	TextField nt,rt;
	CheckboxGroup gcbg;
	Checkbox mcb,fcb,wcb,pccb,rbcb;
	Choice dc,mc,yc;
	TextArea ata;
	List cityl;
	Button sb,cb;
	String details;
	int ver=500;
	SignUpForm(String title){
		super(title);
		
		nl=new Label("Name");
		rnl=new Label("Regd. No.");
		gl=new Label("Gender");
		dobl=new Label("Date of Birth");
		al=new Label("Address");
		cl=new Label("City");
		hl=new Label("Hobbies");
		
		nt=new TextField(20);
		rt=new TextField(20);
		rt.setEchoChar('*');
		
		gcbg=new CheckboxGroup();
		mcb=new Checkbox("Male",gcbg,false);
		fcb=new Checkbox("Female",gcbg,false);
		wcb=new Checkbox("Watching TV");
		pccb=new Checkbox("Playing Cricket");
		rbcb=new Checkbox("Reading Books");
		
		dc=new Choice();
		mc=new Choice();
		yc=new Choice();
		dc.addItem("dd");
		mc.addItem("mm");
		yc.addItem("yyyy");
		for(int i=1;i<31;i++){
			dc.addItem(""+i);
		}
		for(int i=1;i<13;i++){
			mc.addItem(""+i);
		}
		for(int i=1900;i<2014;i++){
			yc.addItem(""+i);
		}
		
		ata=new TextArea(5,20);
		
		cityl=new List(4);
		cityl.add("Guntur");
		cityl.add("Prakasham");
		cityl.add("Krishna");
		cityl.add("East Godavari");
		cityl.add("West Godavari");
		cityl.add("Nellur");
		cityl.add("Chittor");
		
		sb=new Button("Submit");
		cb=new Button("Clear");
		
		setLayout(new GridLayout(10,2));
		add(nl);
		add(nt);
		
		add(rnl);
		add(rt);
		
		add(gl);
		Panel gp=new Panel();
		gp.add(mcb);
		gp.add(fcb);
		add(gp);
		
		add(dobl);
		Panel dobp=new Panel();
		dobp.add(dc);
		dobp.add(mc);
		dobp.add(yc);
		add(dobp);
		
		add(al);
		add(ata);
		
		add(cl);
		add(cityl);
		
		add(hl);
		Panel hop=new Panel();
		hop.add(wcb);
		hop.add(pccb);
		hop.add(rbcb);
		add(hop);
		
		add(sb);
		add(cb);
		sb.addActionListener(this);
		cb.addActionListener(this);
		setVisible(true);
		setSize(500,600);
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==sb){
			details=nl.getText()+"\t"+nt.getText()+"\n";
			details+=rnl.getText()+"\t"+rt.getText()+"\n";
			String gender;
			if(mcb.getState())
				gender=mcb.getLabel();
			else
				gender=fcb.getLabel();
			details+=gl.getText()+"\t"+gender+"\n";	details+=dobl.getText()+"\t"+dc.getSelectedItem()+"/"+mc.getSelectedItem()+"/"+yc.getSelectedItem()+"\n";
			details+=al.getText()+"\t"+ata.getText()+"\n";
			details+=cl.getText()+"\t"+cityl.getSelectedItem()+"\n";
			String Hob="";
			if(wcb.getState()){
				Hob+=wcb.getLabel();
			}
			if(pccb.getState()){
				Hob+=pccb.getLabel();
			}
			if(rbcb.getState()){
				Hob+=rbcb.getLabel();
			}
			details+=hl.getText()+"\t"+Hob+"\n";
			repaint();
			System.out.println(details);
		}
		else{
			
		}
	}
	public void update(Graphics g){
		g.drawString(details,30,ver);
	}
}
class AWTComponents{
	public static void main(String[] args){
		new SignUpForm("Sign Up Form");
	}
}