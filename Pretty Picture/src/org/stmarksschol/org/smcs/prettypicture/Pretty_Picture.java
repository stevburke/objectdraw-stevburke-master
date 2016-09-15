package org.stmarksschol.org.smcs.prettypicture;
import objectdraw.*;
import java.awt.Color;
//import java.awt.Graphics;


public class Pretty_Picture extends WindowController {

	
	
	
	
	private Text myText;
	private Text myText1;
	private Text myText2;
	private Text myText3;
	private Text myText4;
	private Text myText5;
	private Color myColor;
	private Color otherColor;
	public void begin(){
		
		
		
		myText = new Text ("***", 10, 10, canvas);
		
		myColor = new Color (200,5,200,5);
		otherColor = new Color (50, 200,5,200);
		
		myText1 = new Text ("***", 10, 10, canvas);
		for(int c = 1; c <200; ++c){
		myText2 = new Text ("||", c, c, canvas);
		}
		myText3 = new Text ("ouyy", 10, 10, canvas);
	
	
		myText4 = new Text ("***", 10, 10, canvas);
		
		
		for(int c = 200; c <200; --c){
			myText5 = new Text ("||", 100, c, canvas);
			}
		
	}
	
	
	   

	public void onMouseMove(Location point) {
		myText3.moveTo(point);
		
		
	}
	

	  
	public void onMouseClick(Location point){
		myText.moveTo(point);
		
		
		
		
	}
	
	public void onMousePress(Location point){
		myText2.moveTo(point);
		
		

		
	}
	public void onMouseRelease(Location point){
		for(int c = 1; c <200; ++c){
		myText4.moveTo(point);
		}
		
		
		
	}
	
	//public void addToCanvas
}
