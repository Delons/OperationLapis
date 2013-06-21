package game;

import javax.swing.JOptionPane;

public class Missions {

	private static Missions missions;

	public static Missions getInstance() {
		if (missions == null) {
			missions = new Missions();
		}
		return missions;
	}
	
	private Functions functions = Functions.getInstance();
	String missionName;
	
	public void standBy(){
		
		functions.write("Please choose a mission to contine", false);
		
	}
	
	public void firstTime(){
		
		functions.write("Load a saved game or start a new one. To load a game, click 'Menu' or press 'Escape'", false);
		
	}
	
	public void mission110(){
		
		missionName = "Mission 1.1.0 - Training Mission";
		
		
	}
	
	public void mission11a(){
		
		
		
	}

	public String getMissionName() {
		return missionName;
	}
	
	
	
}
