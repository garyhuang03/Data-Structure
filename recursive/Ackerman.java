
public class Ackerman {
	public static void main(String[]arg) {
		int m=2,n=2;
		System.out.println("Ackerman("+m+","+n+")="+ack(m,n));
	}
	public static int ack(int m,int n) {
		if(m==0) 
			return n+1;
		else if(n==0)
			return ack(m-1,1);
		else 
			return ack(m-1,ack(m,n-1));
	}

}
