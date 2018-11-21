
public class Factorial {
	public static void main(String[]arg) 
	{
		int n=5;
		System.out.println(n + "!=" + factorial(n));//iterative
		System.out.println(n + "!=" + factorial_rec(n));//recursive
		
	}
	     public static int factorial(int n) 
	    {
	    	//for loop
	    	int sum=1;
	    	for(int i=1;i<=n;i++)
	    	{
	    		sum=sum*i;
	    	}
	    	return sum;	  	
	    }
	    
	    public static int factorial_rec(int n) 
	    {
	    	//recursive
	    	if(n==0) return 1;
	    	else {
	    		return n * factorial_rec(n-1);
	    	}
	    }

}
