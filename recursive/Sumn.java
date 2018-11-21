
public class Sumn {
	public static void main(String[]arg) {
		int n=10;
		System.out.println("sum 1 to " + n + "=" + sum(n)); //forloop
		System.out.println("sum 1 to " + n + "=" + sum_rec(n)); //recursive
		
	}
	public static int sum(int n) 
	{
		//forloop
		int sum=0,i;
		for(i=1;i<=n;i++) 
		{
			sum=sum+i;
		}
			return sum;
	}
	
	public static int sum_rec(int n)  
	{
		//recursive
		if(n==0) return 0;
		else 
		{
			return n + sum_rec(n-1);
		}
	}

}
