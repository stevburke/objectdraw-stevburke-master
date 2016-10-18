package smcs.burke.animals;

import java.util.Scanner;

public class Animals {

	private static Scanner in;
	private static boolean i = true;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		do{
	
		String question = new String(System.in);
				
				
		Node finger, decisionTree = new Node("Is it bigger than a breadbox");
		try {
			decisionTree.setYes(new Node("Elephant"));
			decisionTree.setNo(new Node("mouse"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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
		while (finger.hasChildren() == false) {
			System.out.println("Is it a(n) " + finger.getValue() + "?");
			if (userInputYesOrNo()){
				finger = finger.getYes();
				System.out.println("woot");
				} else {
					//creates new node containing finger animal
					//creates new node with new animal
					System.out.println("What animal was it?");
					
					Node fingery = new Node(finger.getValue());
					Node newanimal = new Node(question);
					
					System.out.println("What question can differentiate between the two animals?");
					String input;
					if (in == null) {
						in = new Scanner(System.in);
						input = in.nextLine().toLowerCase();
						finger = new Node(input);
					}
					System.out.println("While thinking about the new animal is the answer tothe question yes or no?");
					if (userInputYesOrNo()){
						//finger = finger.getYes();
						decisionTree.setYes(new Node(input));
						decisionTree.setNo(new Node(question));
					} else {
						//finger = finger.getYes();
						decisionTree.setNo(new Node(input));
						decisionTree.setYes(new Node(question));
					}
					//finger.setValue(question);
					
					//finger = finger.getNo(); --why is this here?
					//decisionTree.setYes(new Node (question.charAt(0)));
					
					
				}

			}
		}while (i = true);
			
			
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



