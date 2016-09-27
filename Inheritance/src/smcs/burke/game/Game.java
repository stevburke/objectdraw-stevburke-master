package smcs.burke.game;

import objectdraw.*;

public class Game extends WindowController {

	private World world;
	private Character protagonist, antagonist;
	
	public void begin() {
		//this.setSize(500, 500);
		world = new World(
			getImage(""),
			canvas
		);
		protagonist = new PlayableCharacter(
			getImage("http://vignette1.wikia.nocookie.net/sonic/images/4/44/Classic_Sonic_-_Running.png/revision/latest?cb=20111028121959"),
			new Location(100, 450),
			world
		);
		antagonist = new ChaseCharacter(
				getImage("http://pngimg.com/upload/horse_PNG2556.png"),
				new Location(100, 450),
				world
			);
		canvas.requestFocus();
	}
}
