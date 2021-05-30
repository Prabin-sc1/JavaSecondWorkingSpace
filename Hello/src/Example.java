//public class Example{
//   public void printArray(String[] s){
//   for(int i=0;i<s.length;i++)
//   System.out.println(s[i]);
//   }
//  
//
//public static void main(String[] args){
//  Example e=new Example();
//  String fruits[]=new String[]{"apple","mango","papaya"};
//  e.printArray(fruits);
//  }
//}
//class MyData<T>{
//  T i;
//  public void add(T i1){
//  i=i1;
//   }
//  public T  get(){
//  return i;
//}
//
// }
//public class Example{
//   public static void main(String[] args){
//   MyData<Integer> m1=new MyData<Integer>();   
//   MyData<String> m2=new MyData<String>();
//   Integer k=0;
//   m1.add(k); 
//   m2.add("dfa");
//  System.out.println("m1="+m1.get()+"m2="+m2.get());
//   }
//
//}

import javax.swing.*;

public class Example extends JFrame{
JLabel l1,l2,l3,l4;
JTextField t1,t2;
JButton b1;



public Example() { }
public Example(String s){
super(s);
}

public void setComponents(){
l1=new JLabel("Addition of two numbers:");
l2=new JLabel("First no:");
l3=new JLabel("Second no");
l4=new JLabel();
t1=new JTextField();
t2=new JTextField();
b1=new JButton("Add");

add(l1);

add(l2);
add(t1);
add(l3);
add(t2);
add(b1);
add(l4);

 

t1=new JTextField();
t2=new JTextField();
b1=new JButton();



}


   public static void main(String[] args){

   Example  e=new Example("Welcome");
   e.setComponents();


   e.setVisible(true);
   e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   e.setSize(400,290);
   
  } 
}
//1024*786