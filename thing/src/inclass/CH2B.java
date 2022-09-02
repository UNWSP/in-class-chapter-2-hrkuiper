package inclass;
import javax.swing.JOptionPane;

public class CH2B {
	public static void main(String[] args) {
		
		final int TICKET = 75; 
		final int PROCESSING_FEE = 20;
		final double SALES_TAX = .07;
		
		String input;
		int answer;
		
		input = JOptionPane.showInputDialog(null, "How many tickets did you buy?"); 
		
		answer = Integer.parseInt(input);
		
		Integer.valueOf(input); 
		
		double ANSWER = TICKET * answer + PROCESSING_FEE * SALES_TAX; 
		
		System.out.println(ANSWER);
		
		
	}
	

}
