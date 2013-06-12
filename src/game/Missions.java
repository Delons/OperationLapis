package game;

public class Missions {

	private static Missions missions;

	public static Missions getInstance() {
		if (missions == null) {
			missions = new Missions();
		}
		return missions;
	}
	
	String missionName;
	
	public void standBy(){
		
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
