class MyThread extends Thread{
	public void run(){
		System.out.println("Hai");
	}
}
class MyThreadDemo{
	public static void main(String[] args){
		System.out.println("Mainthread"+Thread.currentThread());
		Thread t=new Thread(new MyThread(),"Mythread");
		System.out.println("Mythread"+t);
		t.start();
	}
}
