
public class Exp {
	public static void main(String[]arg) {
		int x=5,y=2;
		System.out.println(x+"的"+y+"次方="+exp(x,y));
		System.out.println(x+"的"+y+"次方="+exp_rec(x,y));
	}
	public static int exp(int a,int b) {
		//forloop
		int count=1;
		for(int i=1;i<=b;i++)
			count=count*a;
		return count;
	}
	public static int exp_rec(int a,int b) {
		//recursive
		if(b==0)
			return 1;
		else
			return exp_rec(a,b-1)*a;
	}

}
