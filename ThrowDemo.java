class ThrowDemo{
	static int divide(int a,int b)throws Exception,{
		if(b==0)
			throw new Exception("Denominator can't be zero");
		return a/b;
	}
	public static void  main(String[] args){
		int a=10,b=0,c=0;
		try{
			c=divide(a,b);
		}catch(Exception e){
			System.out.println("Exception:"+e);
		}
		System.out.println(c);
	}
}