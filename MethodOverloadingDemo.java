class MethodOverloading{
	void add(float a, float b){
		System.out.println("Floating point addition:"+(a+b));
	}
	void add(double a, double b){
		System.out.println("Double Floating point addition:"+(a+b));
	}
}
class MethodOverloadingDemo{
	public static void main(String[] args){
		MethodOverloading m=new MethodOverloading();
		m.add(10,20);
	}
}