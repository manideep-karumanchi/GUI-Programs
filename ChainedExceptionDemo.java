class ChainedexceptionDemo{
	static void callMe()throws Throwable{
		System.out.println("Inside Call Me");
		ArithmeticException ae=new ArithmeticException("CallMe Exception");
		ae.initCause(new NullPointerException("CallMe Null Pointer Exception"));
		throw ae.initCause(new NullPointerException("CallMe Null Pointer Exception"));
	}
	public static void main(String[] args){
		try{
			callMe();
		}catch(Throwable e){
			System.out.println("Exception:"+e+"\ncause is:"+e.getCause());
		}
	}
}