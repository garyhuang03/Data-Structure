
public class SelectionSort {
	public static void main(String[] arg) {
		int a[]= {6,17,9,4,8,5};
		System.out.println("選擇排序前:");
		print(a);
		System.out.println();
		System.out.println("排序過程:");
		select(a,a.length);
		System.out.println("選擇排序後:");
		print(a);
}
	
	//Selection Sort
	public static void select(int a[],int n) {
		for(int i=0;i<n-1;i++) {
		    int m=i;
			for(int j=i+1;j<n;j++) {
			  if(a[j]<a[m]) {
				m=j;
			  }
			}
			    if(i!=m) {
				int temp=a[i];
				a[i]=a[m];
				a[m]=temp;
			    }
			
			print(a);
			System.out.println();
		}
	}
	
	
	
	public static void print(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
