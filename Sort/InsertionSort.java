
public class InsertionSort {
	public static void main(String[] arg) {
		int a[]= {6,5,1,2,4};
		System.out.println("插入排序前:");
		print(a);
		System.out.println();
		System.out.println("排序過程:");
		for(int j=1;j<a.length;j++) {
			insertsort(a,a[j],j-1);
		}
		System.out.println("插入排序後:");
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
	
	
	
	public static void print(int array[]) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
}


