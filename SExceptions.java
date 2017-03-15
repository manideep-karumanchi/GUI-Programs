class SExceptions{
	static void callMe()throws Exception{
		Exception ex;
		try{
			throw new Exception("Try Exception");
		}catch(Exception e){
			ex=e;
		}
		finally{
			
			throw new Exception("Finally Exception").addSuppressed(ex);
		}
	}
	public static void main(String[] args){
		try{
			callMe();
		}catch(Exception e){
			System.out.println("Exception:"+e);
		}
	}
}