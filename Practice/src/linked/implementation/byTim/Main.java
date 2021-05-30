package linked.implementation.byTim;

public class Main {

	public static void main(String[] args) {
		MyLinkedList mll=new MyLinkedList(null);
		mll.traverse(mll.getRoot());
		
       String strData="G A M P E R T S A B D";
       String[] s=strData.split(" ");
       
       for(String data:s) {
    	   mll.add(new Node(data));
       }
          mll.traverse(mll.getRoot());
          mll.remove(new Node("R"));
          mll.traverse(mll.getRoot());
          
	}

}
