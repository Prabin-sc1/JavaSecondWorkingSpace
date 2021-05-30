package series.playlist.using.linkedlist;

public class Episode {
	private String name;
	private double duration;
	private int episodeNumber;

	public Episode(String name, double duration, int episodeNumber) {
		this.name = name;
		this.duration = duration;
		this.episodeNumber = episodeNumber;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return "\nTitle:" + this.name + "\nDuration:" + this.duration + "\nEpisode Number:" + this.episodeNumber;
	}

}
