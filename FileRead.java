import java.io.*;
class FileRead{
	public static void main(String[] args){
		try(FileInputStream fin = new FileInputStream("StringBufferEx.java");FileOutputStream fout = new FileOutputStream("StringBufferEx1.java")){
			
			int i;
			char ch;
			do{
				i=fin.read();
				ch=(char)i;
				fout.write(ch);
				System.out.print(ch);
			}while(i!=-1);
			
		}catch(FileNotFoundException ex){}
		catch(IOException ex){}
		
	}
}