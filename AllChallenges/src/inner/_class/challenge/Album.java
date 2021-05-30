//Note:I had just make some changes ,you can check original code of linked list challenge .I had implemented inner class in the place of ArrayList which is instance member.
package inner._class.challenge;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
	private String name;
	private String artist;
	private SongList songs;

	public Album(String name, String artist) {
		super();
		this.name = name;
		this.artist = artist;
		this.songs = new SongList();
	}

	public boolean add(String title, double duration) {
      return this.songs.add(new Song(title,duration));
	}


	public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
	
		Song checkedSong=this.songs.findSong(trackNumber);
		if(checkedSong !=null) {
		playlist.add(checkedSong);
		return true;
		}
		System.out.println("This album does not have a track " + trackNumber);
		return false;
	}

	public boolean addToPlayList(String trackTitle, LinkedList<Song> playList) {
		Song checkedSong=this.songs.findSong(trackTitle);
		if(checkedSong!=null) {
			playList.add(checkedSong);
			return true;
		}
				
				
				System.out.println("This song " + trackTitle + " is not in this albums.");
		return false;

	}

	public class SongList {
		private ArrayList<Song> songs;

		public SongList() {
			super();
			this.songs = new ArrayList<>();
		}

		public boolean add(Song song) {
			if (songs.contains(song)) {
				return false;

			}
			this.songs.add(song);
			return true;
		}

		private Song findSong(String title) {
			for (Song checkedSong : this.songs) {
				if (checkedSong.getTitle().equalsIgnoreCase(title)) {
					return checkedSong;
				}
			}
			return null;

		}

		private Song findSong(int trackNumber) {
			int index = trackNumber - 1;
			if (index >= 0 && index < this.songs.size()) {
				return songs.get(index);
			}
			return null;
		}

	}

}
