package game;

public class Character {

	private static Character character;
	
	public static Character getInstance(){
		if (character == null){
			character = new Character();
		}
		return character;
	}
	
	String name;
	int points, hints;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public int getHints() {
		return hints;
	}
	public void setHints(int hints) {
		this.hints = hints;
	}

	
	
}
