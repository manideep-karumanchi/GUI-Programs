//import Operations.ArithmaticOperations;
//import Operations.RelationalOperations;
//import static Operations.LogicalOperations.*;
//import Operations.LogicalOperations;
import Operations.*;
class OperationTest{
	public static void main(String[] args){
		int a=10,b=20;
		ArithmaticOperations ao=new ArithmaticOperations();
		System.out.println(a+"+"+b+"="+ao.add(a,b));
		System.out.println(a+"-"+b+"="+ao.sub(a,b));
		System.out.println(a+"*"+b+"="+ao.mul(a,b));
		System.out.println(a+"/"+b+"="+ao.div(a,b));
		RelationalOperations ro=new RelationalOperations();
		System.out.println(a+"=="+b+"="+ro.equal(a,b));
		System.out.println(a+">"+b+"="+ro.greater(a,b));
		System.out.println(a+"<"+b+"="+ro.lower(a,b));
		System.out.println(true+"||"+false+"="+LogicalOperations.or(true,false));
		System.out.println(true+"&&"+false+"="+LogicalOperations.and(true,false));
	}
}