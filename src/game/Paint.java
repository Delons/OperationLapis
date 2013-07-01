package game;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Paint extends JPanel {

	private static Paint paint;
	private GUI gui = GUI.getInstance();
	private Character character = Character.getInstance();
	private Missions missions = Missions.getInstance();
	private Functions functions = Functions.getInstance();
	private Messages messages = Messages.getInstance();
	private SaveLoad saveLoad = SaveLoad.getInstance();

	public static Paint getInstance() {
		if (paint == null) {
			paint = new Paint();
		}
		return paint;
	}

	private int lastTime2, currentTime, fps;
	private int lastTime = 0;

	public void paintComponent(Graphics g) {

		lastTime2 = currentTime;
		currentTime = (int) System.currentTimeMillis();
		
		
		if (currentTime - lastTime > 500) {
			lastTime = currentTime;
			fps = 1000 / (currentTime - lastTime2);
		}

		super.paintComponent(g);

		// DRAW MENU BUTTONS

		for (int x = 0; x < 840; x += 120) {

			g.setColor(Color.black);

			g.drawRect(x, 20, 120, 30);

			g.setColor(Color.lightGray);

			if (gui.getmY() < 76 && gui.getmY() > 47 && gui.getmX() > x + 3
					&& gui.getmX() < x + 123 && gui.isMenu() == false) {
				g.setColor(Color.gray);

				if (gui.isClicked() == true) {

					if (x < 120) {
						gui.setKeyText(true);
					} else if (x < 240) {
						gui.setGrammatica(true);
					} else if (x < 360) {
						gui.setVerba(true);
					} else if (x < 480) {
						gui.setCulturalia(true);
					} else if (x < 600) {
						gui.setAttunement(true);
					} else if (x < 720) {
						gui.setNavigation(true);
					} else if (x < 840) {
						gui.setMenu(true);
					}

				}

			}

			g.fillRect(x + 1, 21, 119, 29);

		}

		// DRAW MENU BUTTON TEXT
		g.setColor(Color.BLACK);
		g.drawString("Key Text", 25, 40);
		g.drawString("Grammatica", 125, 40);
		g.drawString("Verba", 245, 40);
		g.drawString("Culturalia", 365, 40);
		g.drawString("Attunement", 485, 40);
		g.drawString("Navigation", 605, 40);
		g.drawString("Menu", 725, 40);

		// DRAW TOP MENU TEXT
		g.setColor(Color.BLACK);
		g.drawString(
				"Name: " + character.getName() + "          Hints: "
						+ character.getHints() + "          Points: "
						+ character.getPoints() + "          Level: "
						+ "          " + missions.getMissionName()
						+ "                    FPS: " + fps, 5, 15);

		// DRAW MAIN WINDOW
		g.setColor(Color.BLACK);
		g.fillRect(0, 50, 795, 495);

		g.setColor(Color.GREEN);
		g.drawString(functions.getOut(), 5, 65);

		// DRAW BOTTOM INPUT

		// g.setColor(Color.black);
		// g.drawString(gui.getInput(), 5, 555);

		// DRAW MENU
		if (gui.isMenu() == true) {
			g.setColor(Color.darkGray);
			g.drawRect(300, 122, 200, 310);
			g.setColor(Color.lightGray);
			g.fillRect(301, 123, 199, 309);

			for (int y = 140; y < 420; y += 40) {

				g.setColor(Color.black);
				g.drawRect(330, y, 140, 30);

				if (gui.getmY() < y + 30 && gui.getmY() > y && gui.getmX() > 330 && gui.getmX() < 330 + 140) {
					g.setColor(Color.gray);
				} else {
					g.setColor(Color.lightGray);
				}

				g.fillRect(331, y + 1, 139, 29);

				if (gui.isClicked() == true){
					if(y > 40 && y < 170){
						gui.setSettings(true);
					} else if (y > 180 && y < 210){
						saveLoad.loadGame();
					} else if (y > 190 && y < 250){
						saveLoad.newGame();
					} 
				}
				
			}

			g.setColor(Color.black);
			g.drawString("Settings", 360, 160);
			g.drawString("Load Game", 360, 200);
			g.drawString("Save Game", 360, 240);
			g.drawString("New Game", 360, 280);
			g.drawString("Help", 360, 320);
			g.drawString("Exit", 360, 360);
			g.drawString("Back to Game", 360, 400);

		}

		if (messages.isShowMessage() == true) {

			BufferedImage logo = null;

			try {
				logo = ImageIO.read(new File("src/resource/demiurge.png"));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "lol");
			}

			g.setColor(Color.darkGray);
			g.drawRect(240, 200, 350, 180);
			g.setColor(Color.lightGray);
			g.fillRect(241, 201, 349, 179);
			g.setColor(Color.black);
			g.drawString(messages.getMessageText(), 310, 210);

			g.drawImage(logo, 250, 210, 100, 100, this);

		}

		if (gui.isKeyText() == true) {

		}

		if (gui.isAttunement() == true) {

		}
		
		if (gui.isCulturalia() == true){
			
		}
		
		if (gui.isVerba() == true){
			
		}
		
		if (gui.isGrammatica() == true) {
			
		}
		
		if (gui.isNavigation() == true){
			
		}
		
		if (gui.isSettings() == true){
			
			gui.setMenu(false);
			
			
			
		}
		
		if (gui.isMenu() == true || gui.isSettings() == true){
			functions.setPaused(true);
		} else {
			functions.setPaused(false);
		}

		gui.f.setTitle("Operation Lapis - " + missions.getMissionName());
		
		if (gui.isDevScreen() == true){
			
			gui.f.setSize(800, 700);
			g.setColor(Color.black);
			g.drawString("Developer Menu/Settings:", 5, 560);
			g.drawString("Key Text Menu: " + gui.isKeyText(), 5, 575);
			g.drawString("Attunement Menu: " + gui.isAttunement(), 5, 590);
			g.drawString("Culturalia Menu: " + gui.isCulturalia(), 5, 605);
			g.drawString("Verba Menu: " + gui.isVerba(), 5, 620);
			g.drawString("Grammatica Menu: " + gui.isGrammatica(), 5, 635);
			g.drawString("Navigation Menu: " + gui.isNavigation(), 5, 650);
			g.drawString("Settings Menu: " + gui.isSettings(), 5, 665);
			
			g.drawString("Paused: " + functions.isPaused(), 200, 575);
			g.drawString("Sleep: " + functions.getSleep(), 200, 590);
			g.drawString("Clicked: " + gui.isClicked(), 200, 605);
			
			g.drawString("Mission Name: " + missions.missionName, 395, 575);
			
			g.drawString("Last Time: " + lastTime, 590, 575);
			g.drawString("Last Time 2: " + lastTime2, 590, 590);
			g.drawString("Curent Time: " + currentTime, 590, 605);
			g.drawString("FPS: " + fps, 590, 620);
			g.drawString("Mouse X: " + gui.getmX(), 590, 635);
			g.drawString("Mouse Y: " + gui.getmY(), 590, 650);
			g.drawString("Key: " + gui.getKeyPressed(), 590, 665);
			
			//TODO: Add level and calculations
		}
		
	}

}
