package game;

public class SaveLoad {

	private GUI gui = GUI.getInstance();
	
	private static SaveLoad saveLoad;
	
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
	}
	
	public void newGame(){
		
	}
	
}
