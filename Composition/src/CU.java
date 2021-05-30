
public class CU {
	private String model;
	
	
	public CU(String model) {
		super();
		this.model = model;
	}


	public String getModel() {
		return model;
	}


	public void control()
	{
		System.out.println("I'm the one that control all those threads performed by ALU.");
	}
}
