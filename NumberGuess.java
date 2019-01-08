import java.util.Scanner;
import java.util.Random;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Canvas;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class NumberGuess extends JFrame {
	public NumberGuess() {
		getContentPane().setBackground(new Color(204, 0, 255));
	}

	public static void main(String[] args) {
		
		/* Instantiates scanner and sets i to user input */
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		/* Instantiates and sets guess equal to random number between 1 and 1000 */
		int guess = (int) (Math.random()*1000);
		
		/* Prompts "guessing" questions with user input from random number being the guessed number */
		System.out.println("Guess the number! Choose a number between 1 and 1000.");
		System.out.println();
		
		/* Instances for responses to guessed number. */
		if (i == guess) {
			System.out.println("Congratulations! You've guessed correctly.");
		}
		else if (i < guess) {
			System.out.println("Guess Higher.");
		}
		else if (i > guess) {
			System.out.println("Guess Lower.");
		}
		
		if (i > guess || i < guess) {
			System.out.println
		}
		/* Ends use of scanner. */
scanner.close();}

}


