
public class Memory {
	private String model;
	
	
	private Primary primary;
	
	private Secondary secondary;
	public Memory(String model,Primary primary,Secondary secondary) {
		
		this.model=model;
		
		
		this.primary=primary;
		
		this.secondary=secondary;
	}
	
	
	
	public String getModel() {
		return model;
	}



	public Primary getPrimary() {
		return primary;
	}
	public Secondary getSecondary()
	{
		return secondary;
	}


	public void storage()
	{
		System.out.println("storing data and information.");
	}
}
