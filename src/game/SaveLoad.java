package game;

public class SaveLoad {

	private GUI gui = GUI.getInstance();
	
	private static SaveLoad saveLoad;
	private static Functions functions;
	
	public static SaveLoad getInstance(){
		if (saveLoad == null){
			saveLoad = new SaveLoad();
		}
		return saveLoad;
	}
	
	public void saveGame(){
		
		//TODO: Make it save game
		
		functions.write("Game sucessfully saved!", false);
		
		try {
			//TODO: Make Sleep
			} catch (Exception e) {
			
		}
		
	}
	
	public void loadGame(){
		gui.setMenu(false);
		
		functions.write("Please choose the location on your save file.", false);
		
	}
	
	public void newGame(){
		
		gui.setMenu(false);
		
		functions.write("Please choose a name for your character.", false);
		
		
		
	}
	
}
