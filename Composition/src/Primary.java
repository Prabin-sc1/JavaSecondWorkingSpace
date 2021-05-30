
public class Primary {
	private String name;
	private String model;

	public Primary(String name, String model) {
		super();
		this.name = name;
		this.model = model;
	}

	public String getName() {
		return name;
	}

	public String getModel() {
		return model;
	}
	
	public void store() {
		System.out.println("storing least amount of data and info. with high speed and bearing in your mind i'm volatile");
	}

}
