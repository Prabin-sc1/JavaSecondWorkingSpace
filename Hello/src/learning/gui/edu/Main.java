 package learning.gui.edu;
class MyData<T>{
  T i;

   public void add(T i1){
   i=i1;

}
public T get(){
return (i);
 }
}

public class Main{
 public static void main(String[] args){

MyData<Integer> m=new MyData<Integer>();
MyData<String> m1=new MyData<String>();

Integer k=5;
m.add(k);
m1.add("BHooliya");
System.out.println("m="+m.get()+",m1="+m1.get());



 }
}