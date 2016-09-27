package smcs.burke.game;

import java.awt.Image;

import objectdraw.Location;

public class ChaseCharacter extends Character implements Runnable {



public ChaseCharacter(Image avatar, Location startingOrigin, World world) {
		super(avatar, startingOrigin, world);
		new Thread(this).start();
		}

public double getX(Character PlayableCharacter) {
	return PlayableCharacter.getLocation().getX();
}

public double getY(Character PlayableCharacter) {
	return PlayableCharacter.getLocation().getY();
}

@Override
public void run() {
	while (getY() > 0) {
		move(0, -stride);
		try {
			Thread.sleep(250);
		} catch (InterruptedException e){
			
		
		}
		
		
		
	}
	
}
public void runny() {
	while (getY() < 0) {
		move(0, stride);
		try {
			Thread.sleep(250);
		} catch (InterruptedException e){
			
		
		}
		
		
		
	}
	
}
public void runXUp() {
	while (getX() > 0) {
		move(-stride, 0);
		try {
			Thread.sleep(250);
		} catch (InterruptedException e){
			
		
		}
		
		
		
	}
	
}
public void runXDown() {
	while (getX() < 0) {
		move(stride, 0);
		try {
			Thread.sleep(250);
		} catch (InterruptedException e){
			
		
		}
		
		
		
	}
	
}





}
