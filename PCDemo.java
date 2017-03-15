class Buffer{
	int buffer[];
	boolean produced;
	Buffer(){
		buffer=new int[1];
	}
	void produce(int item){
		System.out.println(item+" Produced");
		buffer[0]=item;
	}
	int consume(){
		return buffer[0];
	}
}
class Producer extends Thread{
	Thread p;
	Buffer b;
	
	Producer(Buffer b){
		this.b=b;
		b.produced=false;
		p=new Thread(this,"Producer");
		p.start();
	}
	public void run(){
		int i=0;
		while(true){
			synchronized(b){
				while(b.produced){
					try{
						b.wait();
					}catch(Exception e){}
				}
				i++;
				b.produce(i);
				try{
					Thread.sleep(1000);
				}catch(Exception e){}
				b.produced=true;
				
				b.notify();
			}
		}
	}
}
class Consumer extends Thread{
	Thread c;
	Buffer b;
	Consumer(Buffer b){
		this.b=b;
		c=new Thread(this,"Consumer");
		c.start();
	}
	public void run(){
		while(true){
			synchronized(b){
				while(!b.produced){
					try{
						b.wait();
					}catch(Exception e){}
				}
				System.out.println(b.consume()+" Consumed");
				b.produced=false;
				b.notify();
			}
			
		}
	}
}
class PCDemo{
	public static void main(String[] args)throws Exception{
		Buffer b=new Buffer();
		Producer p=new Producer(b);
		Consumer c=new Consumer(b);
		p.p.join();
		c.c.join();
	}
}