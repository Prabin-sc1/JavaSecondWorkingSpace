package learninig.concurreny.edu;

public class AnotherThread extends Thread {
	@Override
	 public void run() {
		System.out.println("Hello from "+currentThread().getName());
		try {
		//	Thread.sleep(3000);
			Thread.sleep(1000, 110000);
		}catch(InterruptedException e) {
			System.out.println("Exception: "+e.getMessage());
			return;
		}
		System.out.println("Three seconds have passed and i'm awake");
	}
	

}
