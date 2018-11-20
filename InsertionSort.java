
public class InsertionSort {
	public static void main(String[] arg) {
		int a[]= {6,5,1,2,4};
		//before sorting
		System.out.println("Before insertion sort:");
		print(a);
		System.out.println();
		//sorting
		System.out.println("Sorting:");
		for(int j=1;j<a.length;j++) {
			insertsort(a,a[j],j-1);
		}
		//after sorting
		System.out.println("After insertion sort:");
		print(a);
		
		
	}
	
	//insertion sort
	public static void insertsort(int a[],int key,int i) {
		while(key<a[i]) {
			a[i+1]=a[i];
			i--;
			if(i==-1)
				break;
		}
		a[i+1]=key;
		print(a);
		System.out.println();
		
	}
	
	
	//print array
	public static void print(int array[]) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
}


