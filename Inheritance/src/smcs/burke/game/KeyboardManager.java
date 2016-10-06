package smcs.burke.game;

import java.awt.Color;
import java.awt.event.*;

public class KeyboardManager implements Runnable, KeyListener{

	private boolean[] keyPressed;
	ChaseCharacter CC;
	int stride = 6;
	//TODO warning: be thoughtful about when you actually register your KeyListenr with the canvas
	KeyEvent ev = KeyPressed;
	KeyEvent jimmy = KeyReleased;
	/*private keyPressed left;
	private keyPressed right;
	private keyPressed up;
	private keyPressed down;*/
	//right

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent ev) {
		// TODO Auto-generated method stub
		//cut code
		
		ev.getKeyCode() as ev;
		break;
		ev.getKeyCode();
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		//returnthekey
		//sleep
		
		e.getKeyCode() as jimmy;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	
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
	public boolean isKeyPressed(int keyCode) {
		//return false;
	//	if(jimmy != KeyEvent.VK_UP{
			//
		
		//	isKeypressed= false;
		//}
/*		if jimmy = ev {
			return  int 0 as released;	
		} else {
			return null;
		}
		*/
	}
	
	//public void move(KeyEvent e){
		
		
	//}
	
	//if(e.getKeyCode() = KeyEvent.VK_UP){
		//CC.move(0, -stride);
	//if(e.getKeyCode() = KeyEvent.VK_DOWN){
			//CC.move(0, -stride);
	//if(e.getKeyCode() = KeyEvent.VK_RIGHT){
			//CC.move(0, -stride);
	//if(e.getKeyCode() = KeyEvent.VK_LEFT){
			//CC.move(0, -stride);	
	
	
	
	
}



