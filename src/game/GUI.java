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

public class GUI extends JPanel implements KeyListener, MouseListener, MouseMotionListener{

	Main main;
	Paint paint;
	JFrame f = new JFrame("Operation Lapis");
	Timer draw = new Timer();
	
	public GUI(Main main){
		this.main = main;
		paint = new Paint(main);
		
	}
	
	public void drawGUI(){
		
		draw.schedule(drawTask, 16, 16);
		f.setSize(800, 600);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);
		
		f.addKeyListener(this);
		f.addMouseListener(this);
		f.addMouseMotionListener(this); 
		f.add(paint);
		
	}
	
	TimerTask drawTask = new TimerTask() {
		public void run() {
			
			f.repaint();
		}
	};

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {

		int key = e.getKeyCode();
		
		if (key == KeyEvent.VK_ESCAPE){
			if (main.menu = false){
				main.menu = true;
			}else{
				main.menu = false;
			}
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseMoved(MouseEvent e ) {
		
		main.mX = e.getX();
		main.mY = e.getY();
		
	}
	
}
