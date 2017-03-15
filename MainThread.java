class Resources{
	String s1="STR1",s2="STR2";
}
class MyThread1 extends Thread{
	Resources r;
	Thread t1;
	MyThread1(Resources r){
		this.r=r;
		t1=new Thread(this,"First");
		t1.start();
	}
	public void run(){
		synchronized(r.s1){
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
			synchronized(r.s2){
				System.out.println(r.s1+""+r.s2);
			}
		}
	}
}
class MyThread2 extends Thread{
	Resources r;
	Thread t1;
	MyThread2(Resources r){
		this.r=r;
		t1=new Thread(this,"First");
		t1.start();
	}
	public void run(){
		synchronized(r.s2){
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
			synchronized(r.s1){
				System.out.println(r.s1+""+r.s2);
			}
		}
	}
}
class MainThread{
	public static void main(String[] args){
		Resources r=new Resources();
		new MyThread1(r);
		new MyThread2(r);
	}
} 