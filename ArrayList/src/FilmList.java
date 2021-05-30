import java.util.ArrayList;

public class FilmList {
	ArrayList<String> film = new ArrayList<>();

	public ArrayList<String> getFilm() {
		return film;
	}

	public void add(String name) {
		film.add(name);

	}

	public void print() {
		System.out.println("There are " + film.size() + " in your film list.");
		for (int i = 0; i < film.size(); i++) {
			System.out.println((i + 1) + "." + film.get(i));
		}
	}

	public void modify(String oldFilm, String newFilm) {
		int pos = findItem(oldFilm);
		// film.set(pos, newFilm);
		if (pos >= 0) {
			modify(pos, newFilm);
		}
	}

	private void modify(int pos, String newFilm) {
		film.set(pos, newFilm);
		// System.out.println("Film " + (pos + 1) + " has been modified.");
	}

	public void remove(String movie) {
		int pos = findItem(movie);
		// film.remove(pos);
		if (pos >= 0) {
			remove(pos);
		}
	}

	private void remove(int pos) {
		// String theItem = film.get(pos);
		film.remove(pos);
		// System.out.println((pos + 1) + " was removed successfully ");
	}

	private int findItem(String searchItem) {
		return film.indexOf(searchItem);
	}

	public boolean search(String searchItem) {
		int pos = findItem(searchItem);
		if (pos >= 0) {
			return true;
		}
		return false;

	}
}
