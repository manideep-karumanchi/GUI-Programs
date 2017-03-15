interface IVarTest{
	int i=10;
	double d=10.0;
	char c='a';
}
interface IVarTest1 extends IVarTest{
	float f=20.0f;
}
class VarTest implements IVarTest1{
	void print(){
		System.out.println("i="+i+"\nd="+d+"\nc="+c+"\nf="+f);
	}
	public static void main(String[] args){
		VarTest vt = new VarTest();
		vt.print();
	}
}