class A{
	int i;
	A(int i){
		this.i=i;
	}
	A test(A a){
		return a;
	}
}
class Demo{
	public static void main(String[] args){
		A a = new A(10);
		System.out.println("Old Object:"+a.i);
		A a2 = a.test(a);
		a2.i=20;
		System.out.println("New Object:"+a2.i);
	}
}