class rethrow{
	static void callme()throws Exception{
		try(Resource r=new Resource()){
			r.access();
		}catch(Exception e){
			throw e;
		}
	}
	
	public static void main(String[] args)throws Exception{
		try{
			callme();
		}catch(Exception e){
			System.out.println("Original Exception:"+e);
			for(Throwable t:e.getSuppressed()){
				System.out.println("Suppressed Exception:"+t);
			}
		}
	}
}
class Resource implements AutoCloseable{
	public void access()throws ArithmeticException{
		System.out.println("Resource Utilized");
		throw new ArithmeticException("Resourece Access Exception");
	}
	public void close()throws NullPointerException{
		System.out.println("Resource Closed");
		throw new NullPointerException("Resourece Closed Exception");
	}
}