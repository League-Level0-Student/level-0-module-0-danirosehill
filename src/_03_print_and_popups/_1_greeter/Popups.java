package _03_print_and_popups._1_greeter;

import javax.swing.JOptionPane;

public class Popups {
public static void main(String[] args) {
	
	String input = JOptionPane.showInputDialog("username");
	JOptionPane.showMessageDialog(null, input + " is my username");
	
}
}
