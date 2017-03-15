class StackUnderFlowException extends Exception{
	StackUnderFlowException(String msg){
		super(msg);
	}
}
class StackOverFlowException extends Exception{
	StackOverFlowException(String msg){
		super(msg);
	}
}
class _Stack{
	int stk[];
	int tos,size;
	_Stack(int size){
		this.size=size;
		stk=new int[this.size];
		tos=0;
	}
	boolean isFull(){
		if(tos==size)
			return true;
		else
			return false;
	}
	boolean isEmpty(){
		if(tos==0)
			return true;
		else
			return false;
	}
	void push(int ele)throws StackOverFlowException{
		if(isFull()){
			throw new StackOverFlowException("Stack Over Flow");
		}
		else
			stk[tos++]=ele;
	}
	int pop()throws StackUnderFlowException{
		if(isEmpty())
			throw new StackUnderFlowException("Stack Under Flow");
		else
			return stk[--tos];
		
	}
}
class _StackDemo{
	public static void main(String[] args){
		_Stack s=new _Stack(5);
		try{
			s.push(1);
			s.push(2);
			s.push(3);
			s.push(4);
			s.push(5);
			s.push(5);
		}catch(Exception e){
			System.out.println(e);
		}
		try{
			System.out.println("top ele:"+s.pop());
			System.out.println("top ele:"+s.pop());
			System.out.println("top ele:"+s.pop());
			System.out.println("top ele:"+s.pop());
			System.out.println("top ele:"+s.pop());
			System.out.println("top ele:"+s.pop());
		}catch(Exception e){
			System.out.println(e);
		}
	}
}