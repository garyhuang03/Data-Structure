
public class MergeSort {
	public static void main(String[] arg) {
		int a[]= {9,8,5,1,6,3,4};
		int l=0;
		int n=a.length;
		int r=n-1;
		System.out.println("Before MergeSort:");
		print(a);
		System.out.println();
		sort(a,l,r);
		System.out.println("After MergeSort:");
		print(a);
	}
	public static void sort(int a[],int l,int r) {
		if(l<r) {
			int m=(l+r)/2;
			sort(a,l,m);
			sort(a,m+1,r);
			merge(a,l,m,r);
		}
	}
	public static void merge(int a[],int l,int m,int r) {
		int run1=m-l+1;//length of run1
		int run2=r-m;//length of run2
		
		int p[]=new int[run1];
		int q[]=new int[run2];
		
		for(int i=0;i<run1;i++)
			p[i]=a[l+i];
		for(int i=0;i<run2;i++)
			q[i]=a[m+1+i];
		//MergeSort比大小
		int i=0,j=0,k=l;
		while(i<run1 && j<run2) {
			if(p[i]<=q[j]) {
				a[k]=p[i];
				i++;
			}
			else {
				a[k]=q[j];
				j++;
			}
			k++;
		}
		//若run1或run2尚未scan完
		while(i<run1) {
			a[k]=p[i];
			i++; k++;
		}
		while(j<run2) {
			a[k]=q[j];
			j++; k++;
		}
	}
	
	
	public static void print(int array[]) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}

}
