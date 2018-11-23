
public class Practice {
	public static void main(String[] arg) {
		int a=5;
		quiz(a);
	}
	public static void quiz(int a) {
		if(a>1) {
			quiz(a/2);
			quiz(a/2);
		}
		System.out.print("*");
	}

}
