
public class ALU {
	private String model;
	
	public ALU(String model) {
		this.model=model;
	}
	public String getModel() {
		return model;
	}
	
	public void arithmeticOperation() {
		System.out.println("Okay I'm solving your arithmetic problem.");
	}
	
	public void logicalOperation() {
		System.out.println("Okay I'm solving your logical operation.");
	}
}
