package inclass;

public class CH2B_1 {
	final int THING1 = 0;
	final static int THING2 = 0;
	
	public static void main(String[] args) {
		
		int THING1 = 0;
		
		 System.out.println("the number " + THING1);
		 int num = 1;
		 
		 int ANSWER1 = THING1 + num;
		 
		 System.out.println("the answer is " + ANSWER1);
		 
		 // CHANGNING VARIABLE OF THING 2\\
		 
		 int ANSWER2 = THING2 + num; 
		 System.out.println(ANSWER2);
		 
		{
			int THING2 = 0;
			System.out.println(THING2);
		}
		
	}

}
