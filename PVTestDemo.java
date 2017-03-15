class PVTest{
	void doubleValues(int a, int b){
		a=2*a;
		b*=2;
	}
}
class PVTestDemo{
	public static void main(String[] args){
		int a=10,b=20;
		PVTest pv = new PVTest();
		System.out.println("Before Calling"+a+"\t"+b);
		pv.doubleValues(a,b);
		System.out.println("After Calling"+a+"\t"+b);
	}
}