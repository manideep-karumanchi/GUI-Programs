class TryCatch{
	public static void main(String[] args){
		int a=10,b=2,c=0;
		int arr[]=new int[1];
		try{
			c=a/b;
			try{
				arr[1]=10;
			}catch(NullPointerException e){}
			System.out.println("This stmt will never called");
		}catch(ArithmeticException|ArrayIndexOutOfBoundsException e){
			System.out.println("Exception");
		}
		catch(Exception e){
			System.out.println("Exception");
		}
		System.out.println(a+"/"+b+"="+c);
	}
}