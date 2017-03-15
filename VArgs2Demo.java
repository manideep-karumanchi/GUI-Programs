class VArgs2{
	void test(int[] args){
		System.out.println("No of Arguments: "+args.length+" Values:");
		for(int e:args)
			System.out.print(e+"\t");
	}
}
class VArgs2Demo{
	public static void main(String[] args){
		VArgs2 ob1 = new VArgs2();
		ob1.test(new int[]{});
		ob1.test(new int[]{10,20});
		ob1.test(new int[]{10,20,30});
	}
}