class outer{
	interface inner{
		void innerMethod();
	}
}
class NestedInterfaceDemo implements outer.inner{
	public void innerMethod(){
		System.out.println("Inner Method");
	}
	public static void main(String[] args){
		NestedInterfaceDemo n = new NestedInterfaceDemo();
		n.innerMethod();
	}
}