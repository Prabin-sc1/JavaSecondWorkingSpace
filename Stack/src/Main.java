import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Static s=new Static();
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		boolean start=true;
		int ch = 0;
		while(start) {
			switch(choice) {
			case 1:
				s.push(ch);
				break;
			case 2:
				s.pop(ch);
				break;
			case 3:
				s.display();
				break;
				
			}
			
		}
	}
}
class Static{
	private final static int MAX_SIZE=5;
	int[] s = new int[MAX_SIZE];
	int top = -1;
	
	public void push(int item) {
		if(top == MAX_SIZE-1 ) {
			System.out.println("stack is full");
		}else {
			top++;
			s[top]=item;
		}
	}
	public void pop(int item) {
		if(top < 0) {
			System.out.println("stack is empty");
		}else {
			item=s[top];
			top--;
		}
	}
	public void display() {
		for(int i=top;i!=-1;i--) {
			System.out.println(s[top]);
		}
	}
	
}