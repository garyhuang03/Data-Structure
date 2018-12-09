
public class HeapSort {
	public static void main(String[] arg) {
		//忽略9999 調整a[1..n]
		int a[]= {9999,1,6,8,10,4,9,7,2};
		int n=a.length-1;
		//從最後一個父點調整
		for(int i=n/2;i>0;i--) {
			adjust(a,i,n);
		}
		System.out.println("Max-Heap:");
		print(a);
		System.out.println();
		//HeapSort
		for(int i=n;i>0;i--) {
			int temp=a[1];
			a[1]=a[i];
			a[i]=temp;
			adjust(a,1,i-1);
		}
		System.out.println("HeapSort:");
		print(a);
	}
	//建Max-Heap
	public static void adjust(int a[],int i,int n) {
		int k=a[i];
		int j=2*i;
		while(j<=n) {
			if(j<n && (a[j]<a[j+1])) j++;
			
			if(k>=a[j]) break;
			else {
				a[j/2]=a[j];
				j=2*j;
			}
		}
		a[j/2]=k;
	}
	
	
	public static void print(int array[]) {
		for(int i=1;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}

}
