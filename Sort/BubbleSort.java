
public class BubbleSort {
	public static void main(String[] arg) {
		int a[]= {5,1,2,3,4};
		int n=a.length;
		System.out.println("Before BubbleSort:");
		print(a);
		System.out.println();
		System.out.println("Sorting:");
		bubble(a,n);
		System.out.println("After BubbleSort:");
		print(a);
	}
	
	public static void bubble(int a[],int n){
		for(int i=n-1;i>=1;i--) {
			boolean flag=false;//表示有無SWAP
			for(int j=0;j<i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=true;
				}
				if(flag==false)
				break;
				print(a);
				System.out.println();
			}
		}
	}

	
	public static void print(int array[]) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
	
}
