package smcs.burke.game;

import java.awt.*;

import objectdraw.*;

public abstract class Character {
	
	private VisibleImage avatar;
	protected World world;
	
	protected double stride = 3.0; /* pixels */
	
	public Character(Image avatar, Location startingOrigin, World world) {
		this.world = world;
		world.addCharacter(this);
		this.avatar = new VisibleImage(avatar, startingOrigin, world.getCanvas());
		this.avatar.move(this.avatar.getWidth() / -2.0, this.avatar.getHeight() / -2.0);
	}
	
	/**
	 * @return The center of the avatar image
	 */
	public Location getLocation() {
		return new Location(
			avatar.getX() + avatar.getWidth() / 2.0,
			avatar.getY() + avatar.getHeight() / 2.0
		);
	}
	
	/**
	 * @return X-coordinate of the avatar origin
	 */
	public double getX() {
		return getLocation().getX();
	}
	
	/**
	 * @return Y-coordinate of the avatar origin
	 */
	public double getY() {
		return getLocation().getY();
	}
	
	/**
	 * Move the avatar
	 * @param dx Number of pixels to move in the X-direction
	 * @param dy Bumber of pixels to move in the Y-direction
	 */
	public void move(double dx, double dy) {
		this.avatar.move(dx, dy);
		for(Character c: world.getCharacters()){
			if (c != this && c.overlap(this)) {
				move(-dx, -dy);
			}
		}
	}
	
	public boolean overlap(Character other) {
		// TODO placeholder -- figure this out!
		
		//checks to see if this character overlaps another character
		//true if overlap, false if not
		return avatar.overlaps(other.avatar);
	}
	public abstract void takeAstep();
	// do something with subclass
	
	}

	

