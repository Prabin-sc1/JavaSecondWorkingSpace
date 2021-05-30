package _abstract;

public class Main {
	public static void main(String[] args) {
		Dog dog=new Dog("Bhooliya");
		dog.eat();
		dog.breathe();
		System.out.println();
		Bird bird=new Parrot("Parrot");
		bird.eat();
		bird.breathe();
		bird.fly();
		
		Penguin penguin=new Penguin("Penguin");
		penguin.fly();
	}

}
