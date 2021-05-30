

import java.util.TreeSet;

public class Example2 {

	public static void main(String[] args) {
		TreeSet hs=new TreeSet();
        hs.add("D");
        hs.add("A");
        hs.add("B");
        hs.add("E");
        hs.add("C");
        System.out.println(hs.comparator());
	}

}
