class finallyDemo{
	static void a(){
		try{
			System.out.println("a()");
			throw new NullPointerException("Demo");
		}
		catch(Exception e){
			
		}
		finally{
			System.out.println("a() Completed");
		}
	}
	static void b(){
		try{
			System.out.println("b()");
			
		}
		catch(Exception e){
			
		}
		finally{
			System.out.println("b() Completed");
		}
	}
	static void c(){
		try{
			System.out.println("c()");
			return;
		}
		catch(Exception e){
			
		}
		finally{
			System.out.println("c() Completed");
		}
	}
	public static void main(String[] args){
		a();
		b();
		c();
	}
}