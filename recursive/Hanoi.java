
public class Hanoi {
	public static void main(String[]arg) {
		hanoi(3,'A','B','C');
	}
	public static void hanoi(int n,char a,char b,char c) {
		if (n==1)
		  System.out.println("move disk "+n+" from "+a+" to "+c);
		else {
			hanoi(n-1,a,c,b);
			System.out.println("move disk "+n+" from "+a+" to "+c);
			hanoi(n-1,b,a,c);
		}
	}

}
