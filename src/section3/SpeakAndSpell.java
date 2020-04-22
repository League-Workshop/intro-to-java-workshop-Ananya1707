package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		speak("mandlebrot");
		// 2. Catch the user's answer in a String
		String userSentence = JOptionPane.showInputDialog("Spell the word");
		// 3. If the user spelled the word correctly, speak "correct"
		if (userSentence.equals("mandlebrot")) {
			System.out.println("Correct!");
		}
		// 4. Otherwise say "wrong"
		else {
			System.out.println("Wrong");
		}
		
		// 5. repeat the process for other words
		
	}

	static void speak(String words) {
		try {
			System.out.println( "say " + words);
			//Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}


