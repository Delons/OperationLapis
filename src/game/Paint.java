package game;

import javax.swing.*;
import java.awt.*;

public class Paint extends JPanel {

	private static Paint paint;
	private GUI gui = GUI.getInstance();
	private Character character = Character.getInstance();
	private Missions missions = Missions.getInstance();
	private Functions functions = Functions.getInstance();

	public static Paint getInstance() {
		if (paint == null) {
			paint = new Paint();
		}
		return paint;
	}

	private int lastTime, currentTime, fps;

	public void paintComponent(Graphics g) {

		lastTime = currentTime;
		currentTime = (int) System.currentTimeMillis();
		fps = 1000 / (currentTime - lastTime);

		super.paintComponent(g);

		// DRAW MENU BUTTONS

		for (int x = 0; x < 840; x += 120) {

			g.setColor(Color.black);

			g.drawRect(x, 20, 120, 30);

			g.setColor(Color.lightGray);

			if (gui.getmY() < 76 && gui.getmY() > 47 && gui.getmX() > x + 3
					&& gui.getmX() < x + 123 && gui.isMenu() == false) {
				g.setColor(Color.gray);
			}

			g.fillRect(x + 1, 21, 119, 29);

		}

		// DRAW MENU BUTTON TEXT
		g.setColor(Color.BLACK);
		g.drawString("Key Text", 25, 40);
		g.drawString("Attunement", 125, 40);
		g.drawString("Cultralia", 245, 40);
		g.drawString("Navigation", 365, 40);
		g.drawString("Verba", 485, 40);
		g.drawString("Gramattica", 605, 40);
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

				if (gui.getmY() > y + 30 && gui.getmY() < y
						&& gui.getmX() > 330 && gui.getmX() < 330 + 140) {
					g.setColor(Color.gray);
				} else {
					g.setColor(Color.lightGray);
				}

				g.fillRect(331, y + 1, 139, 29);

			}
		}

	}

}
