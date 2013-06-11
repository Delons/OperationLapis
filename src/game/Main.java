package game;

public class Main {
	
	public static void main(String[] args){
		new Main().startGame();
	}
	
	public void startGame(){
		
		GUI.getInstance().drawGUI();

	}
}
