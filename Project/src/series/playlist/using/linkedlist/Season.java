package series.playlist.using.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Season {
	private String name;
	private int part;
	private ArrayList<Episode> episodes;

	public Season(String name, int part) {
		this.name = name;
		this.part = part;
		this.episodes = new ArrayList<>();
	}

	public boolean addEpisode(String name, double duration, int number) {
		if (findEpisode(name) == null) {
			this.episodes.add(new Episode(name, duration, number));
			return true;
		}
		return false;
	}

	private Episode findEpisode(String name) {
		for (Episode checkedEpisode : this.episodes) {
			if (checkedEpisode.getName().equalsIgnoreCase(name)) {
				return checkedEpisode;
			}
		}
		return null;
	}

	public boolean addToPlayList(int episodeNumber, LinkedList<Episode> playList) {
		int index = episodeNumber - 1;
		if ((index > 0) && (index <= this.episodes.size())) {
			playList.add(this.episodes.get(index));
			return true;
		}
		return false;
	}

	public boolean addToPlayList(String episodeName, LinkedList<Episode> playList) {
		Episode checkedEpisode = findEpisode(episodeName);
		if (checkedEpisode != null) {
			playList.add(checkedEpisode);
			return true;
		}
		return false;
	}

}
