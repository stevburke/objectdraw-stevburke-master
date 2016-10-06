package smcs.burke.game;

import java.awt.*;
import java.awt.event.*;

import objectdraw.*;

public class PlayableCharacter extends Character implements KeyListener {

	public PlayableCharacter(Image avatar, Location startingOrigin, World world) {
		super(avatar, startingOrigin, world);
		world.getCanvas().addKeyListener(this);
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
			case KeyEvent.VK_UP:
				move(0, -stride);
				break;
			case KeyEvent.VK_DOWN:
				move(0, stride);
				break;
			case KeyEvent.VK_LEFT:
				move(-stride, 0);
				break;
			case KeyEvent.VK_RIGHT:
				move(stride, 0);
				break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}
	
	public double getX() {
		return getLocation().getX();
	}

	public double getY() {
		return getLocation().getY();
	}
	
}
public method move()
if ev = KeyEvent.VK_UP { 
	cursor.move(0, -stride);
	if jimmy = ev {
		break;	
}}
if ev = KeyEvent.VK_DOWN { 
	cursor.move(0, stride);
	if jimmy = ev {
		break;	
}}
if ev = KeyEvent.VK_RIGHT { 
	cursor.move(-stride, 0);
	if jimmy = ev {
		break;	
}}
if ev = KeyEvent.VK_LEFT { 
	cursor.move(stride, 0);
	if jimmy = ev {
		break;	
}}
}
