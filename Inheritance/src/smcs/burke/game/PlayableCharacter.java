package smcs.burke.game;

import java.awt.*;
import java.awt.event.*;

import objectdraw.*;

public class PlayableCharacter extends Character implements Runnable{

	private KeyboardManager keyboardManager;
	private DrawingCanvas canvas;
	
	public int INCREMENT = 6;
	
	public PlayableCharacter(Image avatar, Location startingOrigin, World world, KeyboardManager keyboardManager) {
		super(avatar, startingOrigin, world);
		
		
		
	}


	
	public double getX() {
		return getLocation().getX();
	}

	public double getY() {
		return getLocation().getY();
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	while (true) {
		//
	
		if (keyboardManager.isPressed(1) {
			PlayableCharater.move(0, -INCREMENT);
			//up
		}
		if (keyboardManager.isPressed(-1) {
			PlayableCharater.move(0, INCREMENT);
			//down
		}
		if (keyboardManager.isPressed(2) {
			PlayableCharater.move(-INCREMENT, 0);\
			//left
		}
		if (keyboardManager.isPressed(-2) {
			PlayableCharater.move(INCREMENT, 0);
			//right
		}
		
		
	}
	}
}


