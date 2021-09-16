
public class Song {
	public final String title;
	public final Artist artist;
	public final Album album;
	
	public Song(String title, Artist artist, Album album) {
		this.album = album;
		this.artist = artist;
		this.title = title;
	}
	
	public String toString() {
		return title + " - " + artist.name + "\n" + album.title + "(" + album.year + ")"; 
	}
}
