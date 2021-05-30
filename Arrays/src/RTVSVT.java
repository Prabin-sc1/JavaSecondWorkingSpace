import java.util.Arrays;

public class RTVSVT {

	public static void main(String[] args) {
		int[] x=new int[5];
		System.out.println(Arrays.toString(x));
		x[3]=4;
		System.out.println(Arrays.toString(x));
		int[] y=x;
		System.out.println(Arrays.toString(y));
		
		 y=new int[] {3,4,5};
		 System.out.println(Arrays.toString(y));
		 
		 modifyArray(y);
		 System.out.println(Arrays.toString(x));
		
	}
	public static void modifyArray(int[] array) {
		array[2]=9;
		array=new int[] {3,44};
	}

}
