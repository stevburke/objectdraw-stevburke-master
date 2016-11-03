package smcs.burke.animals;

import java.io.File;
import java.util.Scanner;

public class Animals {

	private static Scanner in;
	private static boolean YES = true, NO = false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
		//String question = new String(System.in);
				
				
		Node finger, decisionTree = new Node("Is it bigger than a breadbox");
		try {
			decisionTree.setYes(new Node("Elephant"));
			decisionTree.setNo(new Node("mouse"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			File file = new File("decision_tree");
		
		
		do{
			
			
		
		System.out.println("Thnk of an animal?");
		do {
			System.out.println("Are you ready?");
		}while (userInputYesOrNo() == false);
		
		
		finger = decisionTree;
	
		while (finger.hasChildren()) {
		System.out.println(finger.getValue());
	
		if (userInputYesOrNo()){
			finger = finger.getYes();
			} else {
				finger = finger.getNo();
			}

		}
		
		//guess the animal
	
		//get some input
		//while (finger.hasChildren() == false) {
			System.out.println("Is it a(n) " + finger.getValue() + "?");
			if (userInputYesOrNo() == YES){
				//finger = finger.getYes();
				System.out.println("woot");
				} else {
					//creates new node containing finger animal
					//creates new node with new animal
					System.out.println("What animal was it?");
					
					Node oldAnimal = new Node(finger.getValue());
					Node newAnimal = new Node(in.nextLine().toLowerCase());
					
					System.out.println("What question can differentiate between the two animals?");
					String input;
					if (in == null) {
						in = new Scanner(System.in);
						input = in.nextLine().toLowerCase();
						finger = new Node(input);
					}
					System.out.println("While thinking about the new animal is the answer to the question yes or no?");
					
					try {
					if (userInputYesOrNo()){
						
						
							decisionTree.setYes(newAnimal);
						
						decisionTree.setNo(oldAnimal);
						} else {
						finger = finger.getYes();
						decisionTree.setNo(oldAnimal);
						decisionTree.setYes(newAnimal);
					}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					//finger.setValue(question);
					
					//finger = finger.getNo(); --why is this here?
					//decisionTree.setYes(new Node (question.charAt(0)));
					
					
				}

			
		
		System.out.println("Do you want to play again?");
		}while (userInputYesOrNo() == true);
			
			
		}
	
	/*
	 * Extract a Yes or no answer from the useer
	 * @return true if user yes, false if user answers no
	 * 
	 */
	
	private static boolean userInputYesOrNo(){
		String input;
		if (in == null) {
			in = new Scanner(System.in);
		}
		do{
		input = in.nextLine().toLowerCase();
		}while (input.charAt(0) != 'y' && input.charAt(0) != 'n');
		return (input.charAt(0) == 'y');
	}
	//need to be static to be called this time
	
	
	}



