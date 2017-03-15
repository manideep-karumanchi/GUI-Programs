import java.awt.*;
class GridBagDemo extends Frame{
	GridBagLayout gbag;
	GridBagConstraints gbc;
	Label fl,cl;
	TextField ftf,ctf;
	Button cb,rb;
	GridBagDemo(){
		fl=new Label("Fahrenheit");
		cl=new Label("Celsius");
		
		ftf=new TextField();
		ctf=new TextField();
		
		cb=new Button("Convert");
		rb=new Button("reset");
		
		
		gbag = new GridBagLayout();
		setLayout(gbag);
		
		gbc=new GridBagConstraints();
		gbc.gridwidth=GridBagConstraints.RELATIVE;
		gbc.insets=new Insets(5,5,5,5);
		gbag.setConstraints(fl,gbc);
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		gbag.setConstraints(ftf,gbc);
		
		
		gbc.gridwidth=GridBagConstraints.RELATIVE;
		gbag.setConstraints(cl,gbc);
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		gbag.setConstraints(ctf,gbc);
		
		gbc.gridwidth=GridBagConstraints.RELATIVE;
		gbag.setConstraints(cb,gbc);
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		gbag.setConstraints(rb,gbc);
		
		add(fl);
		add(ftf);
		add(cl);
		add(ctf);
		add(cb);
		add(rb);
		
		setSize(200,200);
		setVisible(true);
	}
	public static void main(String[] args){
		new GridBagDemo();
	}
}