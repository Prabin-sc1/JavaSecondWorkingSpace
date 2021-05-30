
public class Main {

	public static void main(String[] args) {
		Car car = new Car("Base Car", 8);
		System.out.println(car.startEngine());
		System.out.println(car.accelerate());
		System.out.println(car.brake());
		System.out.println();
		Buggati b = new Buggati("Buggati", 4);
		System.out.println(b.startEngine());
		System.out.println(b.accelerate());
		System.out.println(b.brake());

	}

}

class Car {
	private String name;
	private int wheels;
	private int cylinders;
	private boolean engine;

	public Car(String name, int cylinders) {
		super();
		this.name = name;
		this.wheels = 4;
		this.cylinders = cylinders;
		this.engine = true;
	}

	public String getName() {
		return name;
	}

	public int getCylinders() {
		return cylinders;
	}

	public String startEngine() {
		return "car engine started";
	}

	public String accelerate() {
		return "car accelerated";
	}

	public String brake() {
		return "car stopped";
	}

}

class Comet extends Car {
	public Comet(String name, int cylinders) {
		super(name, cylinders);

	}

	@Override
	public String startEngine() {

		return "Comet's engine started";
	}

	@Override
	public String accelerate() {

		return "Comet accelerate";
	}

	@Override
	public String brake() {

		return "Comet stopped";
	}

}

class Lamborhgini extends Car {

	public Lamborhgini(String name, int cylinders) {
		super(name, cylinders);

	}

	@Override
	public String startEngine() {

		return "Lamborgini engine started";
	}

	@Override
	public String accelerate() {

		return "Lamborgini accelerate";
	}

	@Override
	public String brake() {

		return "Lamborgini stopped";
	}

}

class Buggati extends Car {

	public Buggati(String name, int cylinders) {
		super(name, cylinders);

	}

	@Override
	public String startEngine() {

		return "Buggati engine started";
	}

	@Override
	public String accelerate() {

		return "Buggati accelerate";
	}

	@Override
	public String brake() {

		return "Buggati stopped";
	}

}
