package smcs.burke.game;



	
	import java.awt.Color;
	import java.awt.event.KeyEvent;
	import java.awt.event.KeyListener;

	import objectdraw.*;

	public class World extends WindowController implements KeyListener {

		private FilledOval cursor;
		public final int INCREMENT = 6; // final means constant(no changing it)

		public void begin() {
			cursor = new FilledOval(100, 100, 600, 10, canvas);
			cursor.setColor(Color.RED);
			canvas.addKeyListener(this);
			canvas.requestFocus();

		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub

			// System.out.println("KeyTyped: " + e.getKeyChar());

		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			// System.out.println("KeyPressed: " + e.getKeyChar()); }

			switch (e.getKeyCode()) {
			case KeyEvent.VK_UP:
				cursor.move(0, -INCREMENT);
				break;
			case KeyEvent.VK_DOWN:
				cursor.move(0, INCREMENT);
				break;
			case KeyEvent.VK_LEFT:
				cursor.move(-INCREMENT, 0);
				break;
			case KeyEvent.VK_RIGHT:
				cursor.move(INCREMENT, 0);
				break;
			case KeyEvent.VK_G:
				cursor.setColor(Color.GREEN);
				break;
			case KeyEvent.VK_R:
			default:
				cursor.setColor(Color.RED);
				break;
			}
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			// System.out.println("KeyReleased: " + e.getKeyChar());
		}

	}
	
	

