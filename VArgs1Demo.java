class VArgs1{
	void test(){
		System.out.println("Zero Args");
	}
	void test(int a){
		System.out.println("one Arg"+a);
	}
	void test(int a, int b){
		System.out.println("Two Args"+a+"\t"+b);
	}
}
class VArgs1Demo{
	public static void main(String[] args){
		VArgs1 ob1 = new VArgs1();
		ob1.test();
		ob1.test(10);
		ob1.test(10,20);
	}
}