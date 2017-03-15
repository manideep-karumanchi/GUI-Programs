import java.awt.*;
class GridLayoutDemo extends Frame{
	int n=4;
	GridLayoutDemo(){
		setLayout(new GridLayout(n,n));
		for(int r=0;r<n-1;r++)
			for(int c=0;c<n;c++)
				add(new Button((r*n+c)+""));
		setVisible(true);
		setSize(200,200);
	}
	public static void main(String[] args){
		new GridLayoutDemo();
	}
}