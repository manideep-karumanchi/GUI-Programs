import Operations.*;
class OperationsDemo{
	public static void main(String[] args){
		ArithmaticOperations ao=new ArithmaticOperations();
		RelationalOperations ro=new RelationalOperations();
		LogicalOperations lo=new LogicalOperations();
		System.out.println(ao.add(10,20));
	}
}