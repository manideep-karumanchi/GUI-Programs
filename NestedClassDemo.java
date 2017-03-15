class Outer{
	static int outer_x=100;
	public void outer_Method(){
		Inner i = new Inner();
		i.inner_Method();
	}
	static class Inner{
		int inner_x=100;
		public void inner_Method(){
			System.out.println("Outer_X="+outer_x);
		}
	}
}
class NestedClassDemo{
	public static void main(String[] args){
		Outer.Inner o=new Outer.Inner();
		o.inner_Method();
	} 
}