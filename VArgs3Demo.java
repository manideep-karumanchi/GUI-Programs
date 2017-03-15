class VArgs3{
	void test(int ... args){
		
		System.out.println("No of Arguments: "+args.length+" Values: int");
		for(int e:args)
			System.out.print(e+"\t");
		System.out.println();
	}
	void test(double ... args){
		System.out.println("No of Arguments: "+args.length+" Values:");
		for(double e:args)
			System.out.print(e+"\t");
		System.out.println();
	}
}
class VArgs3Demo{
	public static void main(String[] args){
		VArgs3 ob1 = new VArgs3();
		ob1.test();
		ob1.test(10);
		ob1.test(10,20,30);
		ob1.test(10.0,20.0,30.0);
		ob1.test(10.0,20,30.0);
	}
}