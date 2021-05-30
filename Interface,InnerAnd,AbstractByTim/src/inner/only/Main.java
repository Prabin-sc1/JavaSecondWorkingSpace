package inner.only;

import java.util.Scanner;

public class Main {
	private static Scanner s = new Scanner(System.in);
	private static Button button = new Button("Print");

	public static void main(String[] args) {
		class ClickListener implements Button.OnClickListener {
			public ClickListener() {
				System.out.println("I've been attached.");
			}

			@Override
			public void onClick(String title) {
				System.out.println(title + " was clicked.");

			}			

		}
//		Gearbox mcLaren=new Gearbox(6);
//		mcLaren.addGear(1, 5.3);
//		mcLaren.addGear(2, 10.6);
//		mcLaren.addGear(3, 15.9);
//		mcLaren.addGear(4, 17.9);
//		
//		mcLaren.operatingClutch(true);
//     	mcLaren.changeGear(1);
//		mcLaren.operatingClutch(false);
//		System.out.println(mcLaren.wheelSpeed(1000));
//		
//		mcLaren.changeGear(2);
//		System.out.println(mcLaren.wheelSpeed(3000));
//		
//		mcLaren.operatingClutch(true);
//		mcLaren.changeGear(3);
//	    mcLaren.operatingClutch(false);
//     	System.out.println(mcLaren.wheelSpeed(5000));		
//     	
//     	mcLaren.operatingClutch(true);
//     	mcLaren.changeGear(4);
//     	mcLaren.operatingClutch(false);
//     	System.out.println(mcLaren.wheelSpeed(6000));
//     	

		button.setOnClickListener(new ClickListener());
		
//		button.setOnClickListener(new Button.OnClickListener() {
//			
//			@Override
//			public void onClick(String title) {
//			System.out.println(title+" was clicked");
//				
//			}
//		});
		listen();
	}

	private static void listen() {
		boolean quit = false;
		
			while (!quit) {
				System.out.println("Enter your choice");
				int choice=s.nextInt();
				s.nextLine();
				switch(choice) {
				
				case 0:quit =true;break;
				case 1:
					button.onClick();
				}

			}
		}
	}

//Gear class is local to that Gearbox Class