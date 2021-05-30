
public class Register {
	private String model;
	private int capacity;
	
	
	
	public Register(String model, int capacity) {
		super();
		this.model = model;
		this.capacity = capacity;
	}



	public String getModel() {
		return model;
	}



	public int getCapacity() {
		return capacity;
	}



	public void manageInputOutput()
	{
		System.out.println("You consider me as high speed memory with least storing capacity.");
	}
}
