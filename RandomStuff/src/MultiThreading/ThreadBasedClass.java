package MultiThreading;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ThreadBasedClass extends Thread implements KeyListener{

	public static void main(String[] args) {
		Thread t1 = new ThreadBasedClass(20, 10, "#", KeyEvent.VK_A);
		Thread t2 = new ThreadBasedClass(5, 3, "*", KeyEvent.VK_D);
		Thread t3 = new ThreadBasedClass(10, 5, "a", KeyEvent.VK_1);
		t1.start();
		t2.start();
		t3.start();
	}

	private int w, h, key;
	private String s;
	
	public ThreadBasedClass(int w, int h, String s, int key) {
		this.w = w;
		this.h = h;
		this.s= s;
		this.key = key;
	}

	@Override
	public void run() {
		while(true) {
			
		}
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("yeet");
		if(e.getKeyCode() == key) {
			System.out.println(s);
		}
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
