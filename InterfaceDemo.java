interface IShape{
	double area();
	double circumference();
}
interface ICommonUtils{
	double area();
	void display(String shape);
}
class Circle implements IShape,ICommonUtils{
	final double PI=3.14, r;
	Circle(double r){
		this.r=r;
	}
	public double area(){
		return PI*r*r;
	}
	public double circumference(){
		return 2*PI*r;
	}
	public void display(String shape){
		System.out.println("======="+shape+"=========");
	}
}
class Rectangle implements IShape,ICommonUtils{
	double l,b;
	Rectangle(double l, double b){
		this.l=l;
		this.b=b;
	}
	public double area(){
		return l*b;
	}
	public double circumference(){
		return 2*(l+b);
	}
	public void display(String shape){
		System.out.println("======="+shape+"=========");
	}
}
class Square implements IShape{
	double s;
	Square(double s){
		this.s=s;
	}
	public double area(){
		return s*s;
	}
	public double circumference(){
		return 4*s;
	}
}
class InterfaceDemo{
	public static void main(String[] args){
		Circle c = new Circle(5.0);
		c.display("Circle");
		System.out.println("Radius of Circle:"+c.r);
		
		System.out.println("Area of Circle:"+c.area());
		
		System.out.println("Circumference of Circle:"+c.circumference());
		Rectangle r = new Rectangle(5.0,7.0);
		r.display("Rectangle");
		System.out.println("Area of Rectangle:"+r.area());
		System.out.println("Circumference of Rectangle:"+r.circumference());
		Square s = new Square(5.0);
		System.out.println("Area of Square:"+s.area());
		System.out.println("Circumference of Square:"+s.circumference());
	}
}