/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	//Scanner s=new Scanner(System.in);
	  //  int n=s.nextInt();
	  int n=4;
		int sp=0;
		int st=n;
		int k=1;
		while(k<=n){
		for(int i=0;i<=sp;i++){
		    System.out.print(" ");
		}
		for(int j=1;j<=st;j++){
		    System.out.print("* ");
		}
		System.out.print("\n");
		st--;
		sp++;
		k++;
		}
	}
}
