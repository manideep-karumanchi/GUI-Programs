class GCT1{
	public static void main(String[] args){
		long mb=1024*1024;
		Runtime rt = Runtime.getRuntime();
		System.out.println("Total Memory:"+rt.totalMemory()/mb);
		System.out.println("Free Memory:"+rt.freeMemory()/mb);
		String str[]=new String[10000];
		
	}
}