package game;

import javax.swing.*;
import java.awt.*;

public class Paint extends JPanel {

	Main main;

	public Paint(Main main) {
		this.main = main;
	}

	public void paintComponent(Graphics g) {

		main.lastTime = main.currentTime;
		main.currentTime = (int) System.currentTimeMillis();
		main.fps = 1000 / (main.currentTime - main.lastTime);

		super.paintComponent(g);

		// FILL BUTTONS

		for (int x = 0; x < 840; x += 120) {

			g.setColor(Color.lightGray);

			if (main.mY < 76 && main.mY > 47 && main.mX > x + 3
					&& main.mX < x + 123) {
				g.setColor(Color.gray);
			}

			g.fillRect(x + 1, 21, 119, 29);

		}

		// DRAW BUTTONS
		g.setColor(Color.black);
		g.drawRect(0, 20, 120, 30);
		g.drawRect(120, 20, 120, 30);
		g.drawRect(240, 20, 120, 30);
		g.drawRect(360, 20, 120, 30);
		g.drawRect(480, 20, 120, 30);
		g.drawRect(600, 20, 120, 30);
		g.drawRect(720, 20, 73, 30);

		// DRAW TOP MENU TEXT
		g.setColor(Color.BLACK);
		g.drawString("Name: ", 5, 15);
		g.drawString("FPS: " + main.fps, 730, 15);

		// DRAW TOP BUTTON TEXT
		g.drawString("Key Text", 25, 40);
		g.drawString("Attunement", 125, 40);
		g.drawString("Cultralia", 245, 40);
		g.drawString("Navigation", 365, 40);
		g.drawString("Verba", 485, 40);
		g.drawString("Missions", 605, 40);
		g.drawString("Menu", 725, 40);

		// DRAW MAIN WINDOW
		g.setColor(Color.BLACK);
		g.fillRect(0, 50, 795, 495);

	}

}
