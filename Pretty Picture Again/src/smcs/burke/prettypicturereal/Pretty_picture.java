package smcs.burke.prettypicturereal;
import java.awt.Color;

import objectdraw.*;

public class Pretty_picture extends WindowController {

	
	
		private FilledOval laser1, laser2;
		private FilledRect base, secondbase, gun, wing1, wing2;
		
		public void begin(){
			laser1 = new FilledOval(0,0,10,10, canvas);
			laser1.setColor(new Color(225,255,0,255));
			laser2 = new FilledOval(15,0,10,10, canvas);
			laser2.setColor(new Color(225,0,255,255));
			base =new FilledRect(10,10,50,50, canvas);
			base.setColor(new Color(0,225,255,255));
			secondbase =new FilledRect(10,10,45,45, canvas);
			secondbase.setColor(new Color(0,0,255,255));
			gun =new FilledRect(10,20,20,100, canvas);
			gun.setColor(new Color(225,0,0,255));
			wing1 =new FilledRect(10,10,50,20, canvas);
			wing1.setColor(new Color(225,0,255,255));
			wing2 =new FilledRect(10,10,50,20, canvas);
			wing2.setColor(new Color(225,255,0,255));
		}
		
		public void onMouseClick(Location point) {
			laser1.moveTo(point.getX()+2.5,point.getY()-36);
			laser2.moveTo(point.getX()+2.5,point.getY()-9);
			
		}
		

		public void onMouseRelease(Location point) {
			base.moveTo(point.getX(),point.getY()+50);
			secondbase.moveTo(point.getX(),point.getY()+85);
			gun.moveTo(point.getX(),point.getY());
			wing1.moveTo(point.getX()-20,point.getY()+100);
			wing2.moveTo(point.getX()+20,point.getY()+100);
		}	
}