class PRTest{
	int a,b;
	PRTest(int a, int b){
		this.a=a;
		this.b=b;
	}
	void doubleValues(PRTest pr){
		pr.a=2*pr.a;
		pr.b*=2;
	}
}
class PVTestDemo{
	public static void main(String[] args){
		PRTest pr = new PRTest(10,20);
		System.out.println("Before Calling"+pr.a+"\t"+pr.b);
		pr.doubleValues(pr);
		System.out.println("After Calling"+pr.a+"\t"+pr.b);
	}
}