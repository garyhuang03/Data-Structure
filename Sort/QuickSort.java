
public class QuickSort {
	public static void main(String[] arg) {
	int a[]= {61,52,43,34,25,16};
	System.out.println("快速排序前:");
	print(a);
	System.out.println();
	System.out.println("排序過程:");
	quick(a,0,a.length-1);
	System.out.println("快速排序後:");
	print(a);
	}
	
	public static void quick(int a[],int l,int u) {
	  if(l<u) { 
		int i=l,j=u+1,pivot=a[l];
		do {
			do {
				i++; 
				if(i==u)break;
			} while(a[i]<pivot);//i找大
			do j--; while(a[j]>pivot);//j找小
			if(i<j){
				//i<j則swap
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			  }
		 }while(i<j);
		//swap a[l] a[j]
		int temp=a[l];
		a[l]=a[j];
		a[j]=temp;
		
		print(a);
		System.out.println();
		//Divide and Conquer
		quick(a,l,j-1);
		quick(a,j+1,u);
	  }
}
	
	
	public static void print(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
