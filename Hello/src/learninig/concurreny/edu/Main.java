package learninig.concurreny.edu;



public class Main {

	public static void main(String[] args) {
	
		System.out.println("Hello from first thread");
		
		Thread anotherThread=new AnotherThread();
		anotherThread.setName("== Another Thread");
		anotherThread.start();
		
		new Thread() {
			public void run() {
				System.out.println("Hello from anonymous class");
			}
			
		}.start();
		
		Thread myRunnableThread=new Thread(new MyRunnable()
				{
			@Override
			public void run()
			{
			System.out.println("HEllo from runnable interface");
				}
			});
		
		
	myRunnableThread.start();
	//anotherThread.interrupt();
		System.out.println("Hello again from main thread");
		
	
	}

}
