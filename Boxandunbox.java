class Boxandunbox{
	static int test(Integer iob){
		return iob;
	}
	public static void main(String[] args){
		Integer iob=1000;
		int i=iob.byteValue();
		System.out.println(iob+"\t"+i);
	}
}