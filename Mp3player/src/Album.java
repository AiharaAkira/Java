import java.util.ArrayList;

public class Album {
	public final String title;
	public final int year;
	public final Artist artist;
	private final ArrayList<Song> tracks = new ArrayList<>();
	

	public Album(String title, int year, Artist artist) {

		this.title = title;
		this.year = year;
		this.artist = artist;
	}
	
	public void addTrack(Song track) {
		tracks.add(track);
	}
	
	public Song getTrack(int trackNumber) {
		if(trackNumber < 1 || trackNumber > tracks.size()) {
			return null;
		}
		return tracks.get(trackNumber - 1);
	}

}
