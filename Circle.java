class Circle{
	final double PI=3.14;
	double area(int r){
		return PI*r*r;
	}
	public static void main(String[] args){
		Circle c = new Circle();
		System.out.println("Area of the circle:"+c.area(5));
	}
}
