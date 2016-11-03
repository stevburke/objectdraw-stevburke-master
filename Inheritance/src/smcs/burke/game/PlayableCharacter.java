package smcs.burke.game;

import java.awt.*;
import java.awt.event.*;

import objectdraw.*;

public class PlayableCharacter extends Character implements Runnable{

	protected KeyboardManager key;
	private DrawingCanvas canvas;
	
	public int INCREMENT = 6;
	
	public PlayableCharacter(Image avatar, Location startingOrigin, World world, KeyboardManager key) {
		super(avatar, startingOrigin, world);
		this.key = key;
		
		
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
		
	}
	public void takeAstep() {
		if(key.isPressed(KeyboardManager.UP)){
			move(0, -stride);
		}
		if(key.isPressed(KeyboardManager.DOWN)){
			move(0, stride);
		}
		if(key.isPressed(KeyboardManager.LEFT)){
			move(-stride, 0);
		}
		if(key.isPressed(KeyboardManager.RIGHT)){
			move(stride, 0);
		}
	
	}
	
}


