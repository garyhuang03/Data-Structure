
public class GCD {
	public static void main(String[]arg) {
		int a=12,b=9;
	    System.out.println(a+"蛤"+b+"程そ计"+gcd(a,b));
	    System.out.println(a+"蛤"+b+"程そ计"+gcd_rec(a,b));
	    System.out.println(a+"蛤"+b+"程そ计"+lcm(a,b));
	}
	public static int gcd(int a,int b) {
		//recursive
		if(a%b==0)
			return b;
		else
			return gcd(b,a%b);
	}
	public static int gcd_rec(int a,int b) {
		//while loop
		while(a !=0 && b !=0) {
			if(a>b)
				a=a%b;
			else
				b=b%a;
		}
		if(a==0) return b;
		else return a;
	}
	public static int lcm(int a,int b) {
		//lowest common multiple
		return a*b/gcd(a,b);
	}

}
