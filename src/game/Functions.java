package game;

import javax.swing.JOptionPane;

public class Functions {

	public static Functions functions;
	public static GUI gui;

	public static Functions getInstance() {
		if (functions == null) {
			functions = new Functions();
		}
		return functions;
	}

	boolean paused;
	String out = "";
	int sleep = 50;

	public void write(String text, boolean keep) {

		sleep = 50;
		
		if (keep == false) {
			out = "";
		}

		for (int x = 0; x < text.length() - 1; x++) {
			if (paused == false) {
				out += text.substring(x, x + 1);
				try {
					Thread.sleep(sleep);
				} catch (Exception e) {
				}
			} else {
				x -= 1;
			}
		}
		
		sleep = 50;

	}
	
	public String read(){
		
		
		
		return gui.getInput();
	}

	public String getOut() {
		return out;
	}

	public void setOut(String out) {
		this.out = out;
	}

	public boolean isPaused() {
		return paused;
	}

	public void setPaused(boolean paused) {
		this.paused = paused;
	}

	public int getSleep() {
		return sleep;
	}

	public void setSleep(int sleep) {
		this.sleep = sleep;
	}
	
}
