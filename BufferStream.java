import java.io.*;
class BufferStream{
	public static void main(String[] args)throws IOException{
		BufferedInputStream br = new BufferedInputStream(System.in);
		String str;
		do{
			str=br.readLine();
			System.out.println(str);
		}while(!str.equals("stop"));
	}
}