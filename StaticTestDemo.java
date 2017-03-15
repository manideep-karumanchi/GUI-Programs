class StaticTest{
	static int a,b;
	static void test(){
		a=10;
		System.out.println("Hello, World!");
	}
	
}
class StaticTestDemo{
	
	public static void main(String[] args){
		StaticTest o1=new StaticTest();
		o1.a=10;o1.b=20;
		System.out.println("o1.a="+o1.a+"\to1.b="+o1.b);
		StaticTest o2=new StaticTest();
		o2.a=20;o2.b=30;
		System.out.println("o2.a="+o1.a+"\to2.b="+o1.b);
		System.out.println("o1.a="+o1.a+"\to1.b="+o1.b);
		System.out.println(o1.a+"\t"+o1.b);
		StaticTest.test();
	}
	static{
		System.out.println("Static block");
	}
}