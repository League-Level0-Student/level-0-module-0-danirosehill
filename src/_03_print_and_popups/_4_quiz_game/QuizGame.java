package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		
		int variable= 0;
		
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
		
		
		
		
		
		String answer= JOptionPane.showInputDialog("Are all squares rectangles?");
				JOptionPane.showMessageDialog(null, answer);
				
				// 3.  Use an if statement to check if their answer is correct
		
		if (answer.equals("yes")) {
			variable +=1;
		} else {
			variable=0;	
		}
		
		String second= JOptionPane.showInputDialog("Are all rectangles squares?");
		JOptionPane.showMessageDialog(null, second);
		
		if (second.equals("no")) {
			variable +=1;
		} else {
		}	
		
		if (variable==0) {
			JOptionPane.showMessageDialog(null, "You have a score of 0%!");
		}
		if (variable==1) {
			JOptionPane.showMessageDialog(null, "You have a score of 50%!");
		}
		if (variable==2) {
			JOptionPane.showMessageDialog(null, "You have a score of 100%!");
		}
	
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		
	}
}
