interface IDefaultMethodEx{
	default void print(){
		System.out.println("This is Default Method");
	}
	void test();
}
interface IDefaultMethodEx1{
	void print();
	default void test(){}
}
class DefaultMethodEx implements IDefaultMethodEx,IDefaultMethodEx1{
	public void print(){
		System.out.println("This is not default implementation");
	}
	public void test(){
	}
	public static void main(String[] args){
		IDefaultMethodEx ob=new DefaultMethodEx();
		ob.print();
		ob.test();
	}
}