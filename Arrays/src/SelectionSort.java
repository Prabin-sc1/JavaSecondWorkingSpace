
public class SelectionSort {

	public static void main(String[] args) {
		int[] a= {4,5,8,9,3};
		int l=a.length;
		for(int i=0;i<l-1;i++) {
			int minIndex=i;
			for(int j=i;j<l;j++) {
				if(a[j]<a[minIndex]) {
					minIndex=j;
				}
				
				
			}
			int temp=a[i];
			a[i]=a[minIndex];
			a[minIndex]=temp;
			
		}
		for(int item:a) {
			System.out.println(item);
		}
	}
}
