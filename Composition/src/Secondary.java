
public class Secondary {
	private String name;
	private String model;

	public Secondary(String name, String model) {
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
		System.out.println("storing data and info. for future use.");
	}

}
