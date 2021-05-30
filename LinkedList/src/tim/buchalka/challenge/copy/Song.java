package tim.buchalka.challenge.copy;

public class Song {
	private String title;
	private double duration;

	public Song(String title, double duration) {
		super();
		this.title = title;
		this.duration = duration;
	}

	public String getTitle() {
		return title;
	}

	public String toString() {
		return this.title + ":" + this.duration;
	}

}
