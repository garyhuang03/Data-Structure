
public class Palindrome {
	public static void main(String[] arg) {
		char a[]= {'a','b','c','c','b','a'};
		char b[]= {'a','b','a','b'};
		palin(a);
		palin(b);
		System.out.print(a);
		System.out.println(palin(a));
		System.out.print(b);
		System.out.println(palin(b));
	}
	public static String palin(char s[]) {
		int n=s.length;
		for(int i=0;i<n/2;i++) {
			if(s[i]!=s[n-1-i])
				return "不是迴文";
		}
		return "是迴文";
	}

}
