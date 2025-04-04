package core;

public class song {
	String Songname;
	String Artist;
	public song(String songname, String artist) {
		super();
		Songname = songname;
		Artist = artist;
	}
	@Override
	public String toString() {
		return "song [Songname=" + Songname + ", Artist=" + Artist + "]";
	}
	public String getSongname() {
		return Songname;
	}
	public void setSongname(String songname) {
		Songname = songname;
	}
	public String getArtist() {
		return Artist;
	}
	public void setArtist(String artist) {
		Artist = artist;
	}
	

}
