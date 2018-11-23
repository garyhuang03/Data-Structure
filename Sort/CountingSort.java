
public class CountingSort {
	public static void main(String[] arg) {
		int a[]= {1,2,0,1,5,0,2,2,1,5};
		int k=5;//
		int n=a.length;
		System.out.println("Before CountingSort:");
		print(a);
		System.out.println();
		count(a,n,k);
		System.out.println("After ShellSort:");
		print(a);
	}
	public static void count(int a[],int n,int k) {
		int output[]=new int[n];
		int count[]=new int[k+1];
		//init
		for(int i=0;i<=k;i++) {
			count[i]=0;
		}
		//count
		for(int i=0;i<n;i++) {
			count[a[i]]++;
		}
		//
		for(int i=1;i<=k;i++) {
			count[i]+=count[i-1];
		}
		//output
		for(int i=n-1;i>=0;i--) {
			output[count[a[i]]-1]=a[i];
			count[a[i]]--;
		}
		//
		for(int i=0;i<n;i++) {
			a[i]=output[i];
		}
			
	}
	
	
	public static void print(int array[]) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}

}
