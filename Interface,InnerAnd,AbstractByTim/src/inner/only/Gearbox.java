package inner.only;

import java.util.ArrayList;

public class Gearbox {
	private ArrayList<Gear> gears;
	private int maxGears;
	private int currentGear = 0;
	private boolean clutchIsIn;

	public Gearbox(int maxGears) {
		super();
		this.gears = new ArrayList<>();
		this.maxGears = maxGears;
		Gear neutral = new Gear(0, 0.0);
		this.gears.add(neutral);

		for (int i = 0; i < maxGears; i++) {
			addGear(i, i * 5.3);
		}
	}

	public void operatingClutch(boolean in) {
		this.clutchIsIn = in;
	}

	private void addGear(int gearNumber, double ratio) {
		if ((gearNumber > 0) && (gearNumber <= maxGears)) {
			this.gears.add(new Gear(gearNumber, ratio));
		}
	}

	public void changeGear(int newGear) {
		if ((newGear >= 0) && (newGear < this.gears.size()) && clutchIsIn) {
			this.currentGear = newGear;
			System.out.println("Gear " + newGear + " selected");
		} else {
			System.out.println("Grind");
			this.currentGear = 0;
		}
	}

	public double wheelSpeed(int revs) {
		if (clutchIsIn) {
			System.out.println("Scream!!!");
			return 0.0;
		}
		return revs * gears.get(currentGear).getRatio();
	}

	private class Gear {
		private int gearNumber;
		private double ratio;

		public Gear(int gearNumber, double ratio) {
			super();
			this.gearNumber = gearNumber;
			this.ratio = ratio;
		}

		public double getRatio() {
			return ratio;
		}

		public double driveSpeed(int revs) {
			return revs * (this.ratio);
		}
	}
}

//2 special cases of inner classes
//1.local class-->local classes are declared inside a block,such as method or an if statement,and their scope is restricted completely to that particular block
//Lecturer like anonymous class
//2.anonymous class-->
