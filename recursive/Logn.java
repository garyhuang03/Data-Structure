
public class Logn {
	public static void main(String[] arg) {
		int x=16,n=2;
		System.out.println("Log以"+n+"為基底"+"取"+x+"="+log(x,n));
	}
	public static int log(int x,int n) {
		if(n<=1) System.out.println("error");
		if(x<n) return 0;
		x=x/n;
		return (log(x,n)+1);
	}

}
