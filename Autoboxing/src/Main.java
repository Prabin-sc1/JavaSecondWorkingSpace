import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		String []arr=new String[10];
		int []ano=new int[10];
		ArrayList<String> list=new ArrayList<>();
		list.add("aa");
		list.add("bb");
		ArrayList<Integer> list2=new ArrayList<>();
		for(int i=0;i<=10;i++) {
			list2.add(Integer.valueOf(i));
		}
		for(int i=0;i<=10;i++) {
			System.out.println(i+"-->"+list2.get(i).intValue());
		}
		System.out.println();
		
		ArrayList<Double> doubleValue=new ArrayList<>();
		for(double i=0.0;i<=10.0;i+=0.5) {
			doubleValue.add(i);
		}
		for(int  i=0;i<doubleValue.size();i++) {
			double value=doubleValue.get(i);
			System.out.println(i+"-->"+value);
		}
		
	}

}
//a. Integer intValue=56;
//b. Integer intValue=Integer.valueOf(56);
//a and b are same .At compile time a is converted Integer.valueOf(56) with own built in properties 
//so we can just write Integer intValue=50 also compiler maintains that.
