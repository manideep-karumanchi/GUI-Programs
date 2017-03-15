import java.util.Scanner;
class Arrays{
	static Scanner s;
	public static void main(String[] args){
		int m1[][],m2[][];
		int r1,c1,r2,c2;
		s = new Scanner(System.in);
		
		
		System.out.print("Enter rows of M1:");
		r1 = s.nextInt();
		System.out.print("Enter Columns of M1:");
		c1 = s.nextInt();
		m1=new int[r1][c1];
		m1=read(r1,c1);
		print(m1,r1,c1);
		
		System.out.print("Enter rows of M2:");
		r2 = s.nextInt();
		System.out.print("Enter Columns of M2:");
		c2 = s.nextInt();
		m2=new int[r2][c2];
		m2=read(r2,c2);
		print(m2,r2,c2);
		
		System.out.println("Resulting Matrix:");
		add(m1,m2,r1,c1,r2,c2);
	}
	public static int[][] read(int r, int c){
		int[][] m=new int[r][c];
		
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print("m["+i+"]["+j+"]=");
				m[i][j]=s.nextInt();
			}
		}
		return m;
	}
	public static void print(int[][] m,int r,int c){
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print(m[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public static void add(int[][] m1,int[][] m2,int r1,int c1,int r2,int c2){
		int m[][]=new int[r1][c1];
		if(r1 == r2 && c1 == c2){
			for(int r=0;r<r1;r++)
				for(int c=0;c<c1;c++)
					m[r][c]=m1[r][c]+m2[r][c];
			print(m,r1,c1);
		}
		else{
			System.out.println("Addition of M1 and M2 is not possible");
		}
		
	}
}