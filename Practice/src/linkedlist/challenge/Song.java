package linkedlist.challenge;

public class Song {
	private String title;
	private double duration;
	
	public Song(String title, double duration) {
		this.title=title;
		this.duration=duration;
	}
	
	public String getTitle() {
		return title;
	}
	
	public static Song createSong(String title, double duration) {
		return new Song(title,duration);
	}
	
	@Override
	public String toString() {
		return this.title+":"+this.duration;
	}
	

}
