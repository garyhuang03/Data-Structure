
public class ShellSort {
	public static void main(String[] arg) {
		int a[]= {9,8,7,6,5,4,3,2,1,0};
		int n=a.length;
		System.out.println("Before ShellSort:");
		print(a);
		System.out.println();
		System.out.println("Sorting:");
		shell(a,n);
		System.out.println("After ShellSort:");
		print(a);
	}
	public static void shell(int a[],int n) {
		int span=n/2;
		while(span>=1) {
			for(int i=0;i<span;i++) {
				for(int j=i+span;j<n;j+=span) {
					for(int k=j-span;k>=i;k-=span) {
						if(a[k]>a[k+span]) {
							int temp=a[k];
							a[k]=a[k+span];
							a[k+span]=temp;
						}
						else break;
					}
				}
			}
			span=span/2;
			print(a);
			System.out.println();
		}
		
	}
	
	
	
	public static void print(int array[]) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}

}
