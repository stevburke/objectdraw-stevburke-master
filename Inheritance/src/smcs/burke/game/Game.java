package smcs.burke.game;

import objectdraw.*;

public class Game extends WindowController {

	private World world;
	private Character protagonist, antagonist;
	private KeyboardManager key;
	
	public void begin() {
		//this.setSize(500, 500);
		key= new KeyboardManager();
		
		world = new World(
			getImage(""),
			canvas,
			key
		);
		
		protagonist = new PlayableCharacter(
			getImage("https://raw.githubusercontent.com/2016-2017-smcs-adv-topics/objectdraw-in-class/5bcc435a77bb78406e5f786502b16f805777cdb9/05.%20Game%20(in%20class)/src/smcs/battis/game/stick-figure.png"),
			new Location(150, 500),
			world
		);
		antagonist = new ChaseCharacter(
				getImage("http://pngimg.com/upload/horse_PNG2556.png"),
				new Location(100, 450),
				world,
				protagonist
			);
		canvas.requestFocus();
	}
}
