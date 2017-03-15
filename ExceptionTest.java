class MyException extends Exception{
	MyException(String msg){
		super(msg);
	}
}
class ExceptionTest{
	public static void main(String[] args){
		try{
			throw new MyException("MyException");
		}catch(MyException e){
			System.out.println(e);
		}
	}
}