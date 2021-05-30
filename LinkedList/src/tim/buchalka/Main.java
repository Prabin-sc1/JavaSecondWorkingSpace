package tim.buchalka;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
	public static void main(String[] args) {
		List<String> al=new ArrayList<>();
		al.add("ss");
		al.add("fds");
		al.add("dfdsf");
		al.add("rafs");
		ListIterator<String> i=al.listIterator();		
		while(i.hasNext()) {
			String s=(String)i.next();
			
			System.out.println(s);
		}
	}

}
