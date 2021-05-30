import java.util.ArrayList;

public class AudioList {
	private ArrayList<String> audioList = new ArrayList<>();

	public void add(String title) {
		audioList.add(title);

	}

	public ArrayList<String> getAudioList() {
		return audioList;
	}

	public void printList() {
		System.out.println("You have " + audioList.size() + " songs in your audio list.");
		for (int i = 0; i < audioList.size(); i++) {
			System.out.println((i + 1) + "." + audioList.get(i));
		}
	}
	public void modify(String currentAudio,String anotherAudio) {
		int pos=search(currentAudio);
		if(pos>=0) {
			modify(pos,anotherAudio);
		}
	}

	private void modify(int pos, String anotherAudio) {
		audioList.set(pos, anotherAudio);
		// System.out.println((pos+1)+" was modified.");

	}

	public void remove(String audio){
		int pos=search(audio);
		if(pos>=0) {
			remove(pos);
		}
		
	}
	private  void remove(int pos) {

		audioList.remove(pos);
		// System.out.println((pos+1)+" was removed.");
	}

	private int search(String title) {
		return audioList.indexOf(title);
	}
	public boolean find(String title) {
		int pos=search(title);
		if(pos>=0) {
			return true;
		}
		return false;
	}

}
