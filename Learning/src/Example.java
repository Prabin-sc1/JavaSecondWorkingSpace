import java.util.*;
public class Example{
   public static void main(String[] args){
    LinkedList l=new LinkedList();
    l.add("Physics");
    l.add("Math");
    l.add("PST");
    l.add("LC");
    System.out.println(l);
    
    ListIterator lt=l.listIterator();
    while(lt.hasNext()) {
    	String s=(String)lt.next();
   // System.out.println(s);
    	if(s.equals("PST")) 
    		lt.set("Java");
    	
    		else if(s.equalsIgnoreCase("LC")) 
    			lt.add("math-3");
    			
    		else if(s.equals("Physics")) 
    			lt.remove();
    		
    	
    	}
    System.out.print(l);
    }
    		
  }
