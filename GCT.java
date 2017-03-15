class GCT{
	public static void main(String[] args){
		long mb=1024*1024;
		Runtime rt = Runtime.getRuntime();
		System.out.println("Total Memory:"+rt.totalMemory()/mb);
		System.out.println("Free Memory:"+rt.freeMemory()/mb);
		String str[]=new String[10000];
		for(int i=0;i<10000;i++){
			str[i]="String"+i;
		}
		System.out.println("After Creating objects");
		System.out.println("Total Memory:"+rt.totalMemory()/mb);
		System.out.println("Free Memory:"+rt.freeMemory()/mb);
		str=null;
		System.out.println("After Removing references");
		System.out.println("Total Memory:"+rt.totalMemory()/mb);
		System.out.println("Free Memory:"+rt.freeMemory()/mb);
		System.gc();
		System.out.println("After Garbage Collection");
		System.out.println("Total Memory:"+rt.totalMemory()/mb);
		System.out.println("Free Memory:"+rt.freeMemory()/mb);
	}
	protected void finalize(){
		System.out.println("Garbage Collector Called");
	}
}