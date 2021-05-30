public class Main {
	public static void main(String[] args) {

		Case theCase = new Case("2208", "Dell", "240", new Dimension(20, 20, 5));

		Monitor theMonitor = new Monitor("27", "Beast", 27, new Resolution(2540, 1440));

		Motherboard theMotherboard = new Motherboard("fks434", "Asus", 4, 6, "v2.44");

		PC thePC = new PC(theCase, theMonitor, theMotherboard);

		thePC.powerUp();
	}
}

class Motherboard {
	private String model;
	private String manufacturer;
	private int ramSlots;
	private int cardSlots;
	private String bios;

	public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.ramSlots = ramSlots;
		this.cardSlots = cardSlots;
		this.bios = bios;

	}

	public void loadProgram(String programName) {
		System.out.println("Program " + programName + " is loading.");
	}

	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getBios() {
		return bios;
	}

	public int getRamSlots() {
		return ramSlots;
	}

	public int getCardSlots() {
		return cardSlots;
	}
}

class Monitor {
	private String model;
	private String manufacturer;
	private int size;

	private Resolution resolution;

	public Monitor(String model, String manufacturer, int size, Resolution resolution) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.size = size;
		this.resolution = resolution;

	}

	public void drawPixel(int x, int y, String color) {
		System.out.println("Drawing pixel " + x + "," + y + "in colour " + color);
	}

	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public int getSize() {
		return size;
	}

	public Resolution getResolution() {
		return resolution;
	}

}

class Resolution {
	private int width;
	private int height;

	public Resolution(int width, int height) {
		this.width = width;
		this.height = height;
	}
}

class Case {
	private String model;
	private String manufacturer;
	private String powerSupply;
	private Dimension dimension;

	public Case(String model, String manufacturer, String powerSupply, Dimension dimension) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.powerSupply = powerSupply;
		this.dimension = dimension;
	}
	public void pressPowerButton()
	{
		System.out.println("power button presses");
	}
	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getPowerSupply() {
		return powerSupply;
	}

	public Dimension getDimension() {
		return dimension;
	}

}

class Dimension {
	private int width;
	private int height;
	private int depth;

	public Dimension(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
}

class PC {
	private Case theCase;
	private Monitor monitor;
	private Motherboard motherboard;

	public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
		this.theCase = theCase;
		this.monitor = monitor;
		this.motherboard = motherboard;
	}

	public void powerUp() {
		theCase.pressPowerButton();
		drawLogo();
	}

	private void drawLogo() {
		monitor.drawPixel(1220, 50, "red");

	}

}