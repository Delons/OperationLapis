package game;

public class Main {
	
	int fps, lastTime, currentTime, mX, mY;
	boolean menu;
	
	public static void main(String[] args){
		Main main = new Main();
		main.startGame();
	}
	
	public void startGame(){
		
		GUI gui = new GUI(this);
		
		gui.drawGUI();
		
	}
}
