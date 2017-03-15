class Test{
	int a=10;
	Test(int a){
		this.a=a;
	}
	Test incrementA(){
		return new Test(a+10);
	}
}
class TestDemo1{
	public static void main(String[] args){
		Test ob1=new Test(10);
		System.out.println("Before Calling:"+ob1.a);
		Test ob2=ob1.incrementA();
		System.out.println("After Calling:"+ob2.a);
	}
}