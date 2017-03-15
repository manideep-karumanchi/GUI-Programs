class A{
	A(){
		System.out.println("Constructor A");
	}
	void methodA(){
		System.out.println("Class A");
	}
}
class B extends A{
	B(){
		System.out.println("Constructor B");
	}
	void methodA(){
		System.out.println("Class B");
	}
	void methodB(){
		System.out.println("Class B\tmethod B");
	}
}
class C extends B{
	C(){
		System.out.println("Constructor C");
	}
	void methodA(){
		System.out.println("Class C");
	}
	
}
class InheritanceDemo{
	public static void main(String[] args){
		C c=new C();
	}
}