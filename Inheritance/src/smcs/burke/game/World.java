package smcs.burke.game;

import java.awt.*;
import java.util.*;

import objectdraw.*;

public class World implements Runnable {
	private Vector<Character> everybody;
	private KeyboardManager keey;
	private DrawingCanvas canvas;
	
	
	public World(Image background, DrawingCanvas canvas, KeyboardManager key) {
		this.canvas = canvas;
		keey  = key;
		new VisibleImage(background, -500, -250, canvas);
		everybody = new Vector<Character>();
		//
	}

	public DrawingCanvas getCanvas() {
		return canvas;
	}
	
	public void addCharacter(Character c) {
		everybody.add(c);
	}
	
	public Vector<Character> getCharacters() {
		return everybody;
	}

	@Override
	public void run() {
		// TODO manage character movement
	//	overlaps(Drawable2DInterface playableCharacter)
		while(true) {
			
			//tell everyone to move
			for (int i = 0; i <everybody.size(); ++i){
				everybody.get(i).takeAstep();
			}
			//pause before doing it again
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			for (Character c: everybody){
				double dx = 0, dy = 0; 
			}
		}
		
	}
	public void start(){
		new Thread(this).start();
	}
}
	

