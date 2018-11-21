
public class Binomial {
	public static void main(String[]arg) {
		int n=5,m=2;
		System.out.println("C"+n+"¨ú"+m+"="+Bin(n,m));
		System.out.println("C"+n+"¨ú"+m+"="+Bin_rec(n,m));
	}
	public static int Bin(int q,int p) {
		//forloop
		int a=1,b=1,c=1;
		for(int i=1;i<=q;i++)
			a=a*i;
		for(int i=1;i<=p;i++)
			b=b*i;
		for(int i=1;i<=(q-p);i++)
			c=c*i;
		return a/(b*c);
	}
	public static int Bin_rec(int n,int m) {
		//recursive
		if(m==0||n==m)
			return 1;
		else
			return Bin_rec(n-1,m)+Bin_rec(n-1,m-1);
	}

}
