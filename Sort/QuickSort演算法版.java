
public class QuickSortAlgo {
	public static void main(String[] arg) {
		int a[]= {61,52,43,34,25,16};
		print(a);
		quick(a,0,a.length-1);
		print(a);
	}
	
	
	public static void quick(int a[],int l,int u){
		if(l<u) {
			int q=partition(a,l,u);
			quick(a,l,q-1);
			quick(a,q+1,u);
		}
	}
	
	public static int partition(int a[],int l,int u) {
		int x=a[u];
		int i=l-1;
		for(int j=l;j<u;j++) {
			if(a[j]<=x) {
				i++;
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
		}
		int t=a[i+1];
		a[i+1]=a[u];
		a[u]=t;
		return i+1;
	}
	
	
	public static void print(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

}
