import java.awt.*;
import java.awt.event.*;
class CardLayoutDemo extends Frame implements ActionListener{
	CardLayout cl;
	Panel main,first,second;
	Button next,previous;
	CardLayoutDemo(){
		cl=new CardLayout();
		main=new Panel();
		main.setLayout(cl);
		
		first=new Panel();
		next=new Button("Next");
		first.add(next);
		
		second=new Panel();
		previous=new Button("Previous");
		second.add(previous);
		
		main.add(first,"first");
		main.add(second,"second");
		
		add(main);
		setVisible(true);
		setSize(200,200);
		next.addActionListener(this);
		previous.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource().equals(next))
			cl.next(main);
		else if(ae.getSource().equals(previous))
			cl.previous(main);
	}
	public static void main(String[] args){
		new CardLayoutDemo();
	}
}