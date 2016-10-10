package smcs.burke.game;

import java.awt.Color;
import java.awt.event.*;
import java.util.Vector;

import objectdraw.DrawingCanvas;

public class KeyboardManager implements Runnable, KeyListener{

	
	private Vector<Boolean> keyPressed; 
	
	//TODO warning: be thoughtful about when you actually register your KeyListenr with the canvas
	
	//KeyEvent ev = KeyPressed;
	//KeyEvent jimmy = KeyReleased;
	
	/*private keyPressed left;
	private keyPressed right;
	private keyPressed up;
	private keyPressed down;*/
	
	int keyCode;
	if ev.getkeyCode(VK_UP) {
		keyCode = 1;
	}
	if ev.getkeyCode(VK_DOWN) {
		keyCode = -1;
	}
	if ev.getkeyCode(VK_LEFT) {
		keyCode = 2;
	}
	if ev.getkeyCode(VK_RIGHT) {
		keyCode = -2;
	}
	
	public KeyboardManager(DrawingCanvas canvas) {
		keyPressed = new Vector<Boolean>();
		canvas.addKeyListener(this);
		canvas.requestFocus();
	}
	
	public void resize(int keyCode){
		if (keyCode >= keyPressed.size()){
			keyPressed.setSize(keyCode +1);
			//makes array fit
		}
		if (keyPressed.get(keyCode) == null) {
			keyPressed.set(keyCode, false);
		}  //if no key is pressed
		
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public boolean isPressed(int keyCode) {
		resize(keyCode);
		return keyPressed.get(keyCode);
	}
	
	@Override
	public void keyPressed(KeyEvent ev) {
		// TODO Auto-generated method stub
		
			resize(ev.getKeyCode());
			keyPressed.set(ev.getKeyCode(), true);
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		//returnthekey
		//sleep
		
		//e.getKeyCode() as jimmy;
		resize(e.getKeyCode());
		keyPressed.set(e.getKeyCode(), false);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		
		
		
	}
	
	
	
	//public boolean isKeyPressed(int keyCode) {
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



