package models;

public class Game {
	private String name;
	private int releaseDate;
	private int level;
	public Game(String name, int releaseDate, int level) {
		super();
		this.name = name;
		this.releaseDate = releaseDate;
		this.level = level;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(int releaseDate) {
		this.releaseDate = releaseDate;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	@Override
	public String toString() {
		return "Gioco [name=" + name + ", releaseDate=" + releaseDate + ", level=" + level + "]";
	}


}
