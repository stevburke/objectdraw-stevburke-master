package smcs.burke.pattern;

import objectdraw.*;

public class Pattern {

		private Location origin;
		private FilledOval[][] p;
	
		public Pattern(int x, int y, DrawingCanvas canvas) {
			origin = new Location (0,0);
			p = new FilledOval [10][10];
			
			
			for(int row = 0; row<10; row++){
				
				
				//int n =row/2;
				//if(n*2 == row)
					
				if(row % 2 ==0) {
				p[row] = new FilledOval [9];
					for(int col=0; col <9; col++){
						p[row][col] = new FilledOval(col*20+10,row*20+10,15,15, canvas);
					}
				}
					else{
						p[row] = new FilledOval[10];
						for(int col=0; col <10; col++){
							p[row][col] = new FilledOval(col*20,row*20+10,15,15, canvas);
						}		
					}
				}
			
			}
			
	
		
		
		
		public void moveTo(Location mov){
			for(int row =0; row <p.length; row++){
				for (int col = 0; col < p[row].length; col++){
					//move that oval
					p[row][col].moveTo(mov.getX(),mov.getY());
					
				}
			}
		}
		
}
