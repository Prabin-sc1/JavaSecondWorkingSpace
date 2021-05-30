import java.util.ArrayList;
import java.util.Scanner;
class GroceryList{
    public ArrayList<String> groceryList=new ArrayList<>();
    
    public void addItemInGroceryList(String item){
    groceryList.add(item);
    }
    public void printItemInGroceryList(){
    	  System.out.println("There are "+groceryList.size()+" item in grocery list");
    for(int i=0;i<groceryList.size();i++){
    	System.out.println((i+1)+"."+groceryList.get(i));
    
       }
   }
    public void modifyItemInGroceryList(int pos,String anotherItem){
     groceryList.set(pos,anotherItem);
     System.out.println("Grocery item "+(pos+1)+" was modified.");
    
  }
  public void removeItemFromGroceryList(int pos){
   String theItem=groceryList.get(pos);
   groceryList.remove(pos);
  System.out.println("Grocery item "+(pos+1)+" was removed.");
  

  }
  public String searchItem(String item){

  int pos=groceryList.indexOf(item);  
  if(pos>=0){
   return groceryList.get(pos);
  }
  return null;
  }
}

  public class Main1{
  private static Scanner s=new Scanner(System.in);
  private static GroceryList groceryList=new GroceryList();

   public static void main(String[] args){
   boolean quit=false;
  int choice=0;
   printInstructions();
   while(!quit){
   System.out.println("Enter your choice:");
    choice=s.nextInt();
    s.nextLine();
   switch(choice){
   case 1:
    printInstructions();
    break;
   case 2:
   groceryList.printItemInGroceryList();
   break;
   case 3:
   addItem();
   break;
   case 4:
   modifyItem();
   break;
   case 5:
   removeItem();
   break;
   case 6:
   searchItem();
   break;
   case 7:
   quit=true;
   break;

    }
  }

 }
  public static void printInstructions(){
   System.out.println("Press:\n"+"\t1.To print Option\n"+"\t2.To print Item in the list\n"+"\t3.To add an item\n"+"\t4.To modify item in the list\n"+"\t5.To remove item from list\n"+"\t6.To search an item\n"+"\t7.Quit");

 }  
  public static void addItem(){
   System.out.println("Enter the item that you wanna add to list.");
   groceryList.addItemInGroceryList(s.nextLine());


}
//  public static void printItemInGroceryList(){
//   System.out.println("You have "+groceryList.size()+" in your grocery list");
//    for(int i=0;i<groceryList.size();i++){
//    System.out.println(groceryList.get(i));
//
//}
//}
  public static void modifyItem(){
  System.out.println("Enter item number");
  int itemNo=s.nextInt();
  s.nextLine();
  String newItem=s.nextLine();
  groceryList.modifyItemInGroceryList(itemNo-1,newItem);
}
  public static void removeItem(){
  System.out.println("Enter item number");
  int itemNo=s.nextInt();
  s.nextLine();
  
  groceryList.removeItemFromGroceryList(itemNo-1);
  
} 
  public static void searchItem(){
  System.out.println("Enter the name of item that you wanna search.");
  String searchItem=s.nextLine();
  if(groceryList.searchItem(searchItem)!=null){
  System.out.println(searchItem+" is found.");
}
  else{
   System.out.println(searchItem+" is not found");
   }
}

}
  
    