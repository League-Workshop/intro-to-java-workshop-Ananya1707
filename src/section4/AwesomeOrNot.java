package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
	public static void main(String[] args) {
		
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
		int randomNumber = new Random().nextInt(4);
	// 3. Print out this variable
		System.out.println(randomNumber);
	// 4. Get the user to enter something that they think is awesome
		String awesome = JOptionPane.showInputDialog("What do you think is awesome?");
	// 5. If the random number is 0
		if(randomNumber == 0) {
			// -- tell the user whatever they entered is awesome!
			System.out.println(awesome + " is awesome!");
		}

	// 6. If the random number is 1
		if(randomNumber == 1) {
			// -- tell the user whatever they entered is ok.
			System.out.println(awesome + " is okay");
		}

	// 7. If the random number is 2
		if(randomNumber == 2) {
			// -- tell the user whatever they entered is boring.
			System.out.println(awesome + " is boring");
		}
	// 8. If the random number is 3
		if(randomNumber == 3) {
				// -- write your own answer
				System.out.println(awesome + " is cool");
		}

	}

}


