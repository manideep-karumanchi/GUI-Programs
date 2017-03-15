class GreatestNumber{
	public static void main(String[] args){
		float num1=100.0f,num2=100.1f,num3=75.83f;
		if(num1>=num2){
			if(num1>=num3){
				System.out.println(num1+"is Greatest");
			}
		}
		else if(num2>=num1){
			if(num2>=num3){
				System.out.println(num2+"is Greatest");
			}
		}
		else{
			System.out.println(num3+"is Greatest");
		}
	}
}