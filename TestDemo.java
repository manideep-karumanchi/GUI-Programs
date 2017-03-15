//Passing objects as arguments to methods
class Test{
	int a,b;
	Test(int a,int b){
		this.a=a;
		this.b=b;
	}
	boolean Equals(Test ob){
		return (ob.a==a && ob.b==b);
	}
}
class TestDemo{
	public static void main(String[] args){
		Test ob1=new Test(10,20);
		Test ob2=new Test(10,20);
		
		System.out.println("ob1 == ob2:"+ob1.Equals(ob2));
	}
}