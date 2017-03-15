class Prime{
	int num,counter;
	Prime(){
		num=0;
		counter=0;
		System.out.println("Parameter Less Constructor");
	}
	Prime(int n){
		num=n;
		counter=0;
		System.out.println("Constructor with one parameter");
	}
	Prime(int n,int c){
		num=n;
		counter=c;
		System.out.println("Constructor with Two parameters");
	}
	void primeorNot(){
		//counter=0;
		for(int i=2;i<=num/2;i++){
			if(num%i==0)counter++;
		}
		if(counter==0){
			System.out.println(num+"is a prime");
		}
		else{
			System.out.println(num+"is not a prime");
		}
	}
}
class PrimeDemo{
	public static void main(String[] args){
		
		Prime p=new Prime(9);
		Prime p1=new Prime(5,0);
		p1.primeorNot();
		p.primeorNot();
		System.out.println(p.num+"\t"+p.counter);		
		System.out.println(p1.num+"\t"+p1.counter);
	}
}