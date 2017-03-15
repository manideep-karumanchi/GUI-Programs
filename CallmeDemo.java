class Callme{
	void call(String msg){
		System.out.print("[");
		System.out.print(msg);
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){}
		System.out.println("]");
	}
}
class MyThread extends Thread{
	Callme c;
	Thread t;
	MyThread(Callme c,String msg){
		this.c=c;
		t=new Thread(this,msg);
		t.start();
	}
	public void run(){
		synchronized(c){
			c.call(this.getName());
		}
	}
}
class CallmeDemo{
	public static void main(String[] args){
		Callme c=new Callme();
		new MyThread(c,"One");
		new MyThread(c,"Two");
		new MyThread(c,"Three");
	}
}