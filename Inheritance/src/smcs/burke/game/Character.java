package smcs.burke.game;

import objectdraw.*;
import java.awt.Image;

public class Character extends VisibleImage  {
	
	
	
	String myCharacter = "smiley-face-clip-art-images-sun_smiley_face.png";
	
	Location point;
	
	public Character(java.awt.Image image, Location origin, double width, double height, DrawingCanvas canvas) {
		super(image, origin, width, height, canvas);
		// TODO Auto-generated constructor stub
		
		/*
		Image image = null;
		try {
		    img = ImageIO.read(new File("strawberry.png"));
		} catch (IOException e) {
		}

		*/
		
		image = Image(myCharacter);
	
		//Location point =
		//Location a = double 4, double 4;
		origin = (point);
		
		width = 10;
		height = 10;
		
	}


	
			
			


}
	

