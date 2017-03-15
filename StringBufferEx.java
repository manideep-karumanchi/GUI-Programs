class StringBufferEx{
	public static void main(String[] args){
		StringBuffer sb=new StringBuffer(4);
		System.out.println("length"+sb.length()+"\tcapacity:"+sb.capacity());
		sb=new StringBuffer(new java.util.Scanner(System.in).next());
		System.out.println("length"+sb.length()+"\tcapacity:"+sb.capacity());
		sb.ensureCapacity(35);
		System.out.println("length"+sb.length()+"\tcapacity:"+sb.capacity());
		sb.setCharAt(1,' ');
		System.out.println(sb);
		System.out.println("sb.append(string):"+sb.append("string")+"\tsb:"+sb);
		System.out.println("sb.insert(1,e):"+sb.insert(1,"e")+"\tsb:"+sb);
		System.out.println("sb.deleteCharAt(2):"+sb.deleteCharAt(2)+"\tsb:"+sb);
		System.out.println("sb.replace(0,4,next):"+sb.replace(0,4,"next")+"\tsb:"+sb);
	}
}