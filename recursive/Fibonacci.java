
public class Fibonacci {
	public static void main(String[]arg) {
		int n =10;
		System.out.println("F" + n + "=" + fib(n));
		System.out.println("F" + n + "=" + fib_rec(n));
		System.out.println("F" + n + "=" + fibDP(n));
	}
	public static int fib(int n) {
		//forloop
		int a=0,b=1,c=0,i;
		for(i=2;i<=n;i++) {
			c=a+b;
			a=b;
			b=c;
		}
		return c;
	}
	public static int fib_rec(int n) {
		//recursive
		if(n==0) return 0;
		else if(n==1) return 1;
		else {
			return fib_rec(n-1)+fib_rec(n-2);
		}
	}
	public static int fibDP(int n) {
		//Dynamic Programming
		int a[]=new int[n+1];
		a[0]=0;
		a[1]=1;
		if(n==0) return a[0];
		else if(n==1) return a[1];
		else {
		for(int i=2;i<=n;i++) {
			a[i]=a[i-1]+a[i-2];
		}
	    }
            return a[n];
      }

}
