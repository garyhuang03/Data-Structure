
public class Permutation {
	public static void main(String[]arg) {
		char a[]= {'a','b','c'};
		perm(a,0,a.length-1);
	}
	public static void perm(char a[],int k,int m) {
		if(k==m) {
			for(int i=0;i<=m;i++) {
				System.out.print(a[i]);
				}
			System.out.println();
		}
		
		else {
			for(int i=k;i<=m;i++) {
				//swap
				char t=a[k];
				a[k]=a[i];
				a[i]=t;
				perm(a,k+1,m);
				//swap
				t=a[k];
				a[k]=a[i];
				a[i]=t;
			}
		}
	}

}
