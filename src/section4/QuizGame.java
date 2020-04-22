package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int userScore = 0;
		// 2.  Ask the user a question 
		String daysInYear= JOptionPane.showInputDialog("How many days are in a year?");
		// 3.  Use an if statement to check if their answer is correct
		if(daysInYear.equals("365")){
			System.out.println("You are correct. One point will be added to your score");
			// 4.  if the user's answer was correct, add one to their score
			userScore = userScore + 1;
		}
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String statesInUSA =  JOptionPane.showInputDialog("How many states are in USA?");
		if(statesInUSA.contentEquals("50")) {
			System.out.println("You are correct. One point will be added to your score");
			userScore = userScore + 1;
		}
		
		String whatIsH2O = JOptionPane.showInputDialog("H2O is the chemical formula for what?");
		if(whatIsH2O.equals("water")) {
			System.out.println("You are correct. One point will be added to your score");
			userScore = userScore + 1;
		}
		
		String firstPresidentOfUSA = JOptionPane.showInputDialog("Who was the first president of the USA?");
		if(firstPresidentOfUSA.equals("George Washington")) {
			System.out.println("You are correct. One point will be added to your score");
			userScore = userScore + 1;
		}
		// 6.  After all the questions have been asked, print the user's score
		System.out.println(userScore);
		
	}
}
