package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Timer;
import java.util.TimerTask;

public class GUI extends JPanel implements KeyListener, MouseListener,
		MouseMotionListener {

	int mX, mY;
	boolean menu, keyText, attunement, culturalia, verba, grammatica,
			navigation, help, clicked, settings, devScreen;
	String input;
	String keyPressed;
	
	private Messages messages = Messages.getInstance();
	private Functions functions = Functions.getInstance();

	private static GUI instance;

	JFrame f = new JFrame("Operation Lapis");
	Timer draw = new Timer();

	public static GUI getInstance() {
		if (instance == null) {
			instance = new GUI();
		}
		return instance;
	}

	public void drawGUI() {

		draw.schedule(drawTask, 16, 16);
		f.setSize(800, 600);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);

		f.addKeyListener(this);
		f.addMouseListener(this);
		f.addMouseMotionListener(this);
		f.add(Paint.getInstance());

	}

	TimerTask drawTask = new TimerTask() {
		public void run() {
			f.repaint();
		}
	};

	public void mouseClicked(MouseEvent e) {


	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {

		if (e.getButton() == MouseEvent.BUTTON1) {
			clicked = true;
		}

	}

	@Override
	public void mouseReleased(MouseEvent e) {

		clicked = false;

	}

	@Override
	public void keyPressed(KeyEvent e) {

		int key = e.getKeyCode();

		keyPressed = e.getKeyText(key);
		
		if (key == KeyEvent.VK_ESCAPE) {
			if (menu == false) {
				menu = true;
			} else {
				menu = false;
			}

			if (help == true) {
				help = false;
				menu = true;
			}

			if (settings == true) {
				settings = false;
				menu = true;
			}

			keyText = false;
			grammatica = false;
			verba = false;
			culturalia = false;
			attunement = false;
			navigation = false;

		} else if (key == KeyEvent.VK_ENTER) {
			if (messages.isShowMessage() == true) {
				messages.setShowMessage(false);
			}

			if (functions.getSleep() == 50) {
				functions.setSleep(5);
			}

		} else if (key == KeyEvent.VK_F1){
			if (devScreen == false){
				devScreen = true;
			} else {
				devScreen = false;
				f.setSize(800, 600);
			}
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {

		keyPressed = null;

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void mouseMoved(MouseEvent e) {

		mX = e.getX();
		mY = e.getY();

	}

	public int getmX() {
		return mX;
	}

	public void setmX(int mX) {
		this.mX = mX;
	}

	public int getmY() {
		return mY;
	}

	public void setmY(int mY) {
		this.mY = mY;
	}

	public boolean isMenu() {
		return menu;
	}

	public void setMenu(boolean menu) {
		this.menu = menu;
	}

	public String getInput() {
		return input;
	}

	public boolean isClicked() {
		return clicked;
	}

	public void setClicked(boolean clicked) {
		this.clicked = clicked;
	}

	public boolean isKeyText() {
		return keyText;
	}

	public void setKeyText(boolean keyText) {
		this.keyText = keyText;
	}

	public boolean isAttunement() {
		return attunement;
	}

	public void setAttunement(boolean attunement) {
		this.attunement = attunement;
	}

	public boolean isCulturalia() {
		return culturalia;
	}

	public void setCulturalia(boolean culturalia) {
		this.culturalia = culturalia;
	}

	public boolean isVerba() {
		return verba;
	}

	public void setVerba(boolean verba) {
		this.verba = verba;
	}

	public boolean isGrammatica() {
		return grammatica;
	}

	public void setGrammatica(boolean gramatica) {
		this.grammatica = gramatica;
	}

	public boolean isHelp() {
		return help;
	}

	public void setHelp(boolean help) {
		this.help = help;
	}

	public boolean isNavigation() {
		return navigation;
	}

	public void setNavigation(boolean navigation) {
		this.navigation = navigation;
	}

	public boolean isSettings() {
		return settings;
	}

	public void setSettings(boolean settings) {
		this.settings = settings;
	}

	public boolean isDevScreen() {
		return devScreen;
	}

	public void setDevScreen(boolean devScreen) {
		this.devScreen = devScreen;
	}

	public String getKeyPressed() {
		return keyPressed;
	}

	public void setKeyPressed(String keyPressed) {
		this.keyPressed = keyPressed;
	}

}
