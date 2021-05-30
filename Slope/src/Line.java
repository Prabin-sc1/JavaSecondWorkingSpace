

public class Line {
	private Point p1;
	private Point p2;
	

	public Line(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p1;

	}

	public Point getP1() {
		return p1;
	}

	

	public Point getP2() {
		return p2;
	}

	public double getSlope() {
		if (this.p1.getX() == this.p2.getX()) {
			throw new IllegalArgumentException("Denominator can't be 0.");

		}
		return (double) (this.p2.getY() - this.p1.getY()) / (this.p2.getY() - this.p1.getX());
	}
}
	

