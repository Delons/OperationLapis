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
		
		missionName = "Start Menu";
		functions.write("Welcome to Operation Lapis: The Game! To begin, load a saved game or start a new one. To load a game, click 'Menu' or press 'Escape'", true);
		
	}
	
	public void mission110(){
		
		//TODO: Get Mission Name From Txt File
		missionName = "Mission 1.1.0 - Training Mission";
	}
	
	public void mission11a(){
		
		
		
	}

	public String getMissionName() {
		return missionName;
	}
	
	
	
}
