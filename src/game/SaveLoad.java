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
		
	}
	
	public void loadGame(){
		gui.setMenu(false);
		
		functions.write("Please choose the location on your save file.", false);
		
	}
	
	public void newGame(){
		
	}
	
}
