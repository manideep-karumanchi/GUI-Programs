package Operations;
class ArithmaticOperations{
	int add(int a,int b){
		return a+b;
	}
	int sub(int a,int b){
		return a-b;
	}
	int mul(int a,int b){
		return a*b;
	}
	int div(int a,int b){
		return a/b;
	}
}
class RelationalOperations{
	boolean equal(int a,int b){
		return a==b;
	}
	boolean greater(int a,int b){
		return a>b;
	}
	boolean lower(int a,int b){
		return a<b;
	}
	
}
class LogicalOperations{
	boolean and(boolean a,boolean b){
		return a&b;
	}
	boolean or(boolean a,boolean b){
		return a|b;
	}
}