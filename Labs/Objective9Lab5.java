import java.util.Scanner;

public class Objective9Lab5 {
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		double num1;
		double num2;
		boolean keepGoing = true;
		double answer = 0.0;
		System.out.println("Please enter a number: ");
		num1 = kb.nextDouble();
		System.out.println("Please enter another number: ");
		num2 = kb.nextDouble();

		while(keepGoing) {
			printMenu();
			System.out.println("Which would you like to do?");
			int choice = kb.nextInt();

			switch(choice){
			case 1:
				double sum = findSum(num1, num2);
				System.out.println (num1 + " + " + num2 + " = " + sum);
				break;
            case 2:
            	double average = findAverage(num1, num2);
            	System.out.println("The average of " + num1 + " and " + num2 + " is: " + average);
            	break;
            case 3:
            	double tax = calcTax(num1, num2);
            	System.out.println("The amount in tax to be collected from a purchase of " + num1 + " and " + num2 + " is: " + tax);
            	break;
            case 4:
            	System.out.println("You've chosen to quit.");
            	keepGoing = false;
            	break;
            default:
            	System.out.println("Invalid option. Please choose again: ");
            }

			
			
		}
		kb.close();
    }
		public static void printMenu() {
			System.out.println();
			System.out.println("========= MENU =========");
		    System.out.println("|                      |");
		    System.out.println("|   1. Add Numbers     |");
		    System.out.println("|   2. Find Average    |");
		    System.out.println("|   3. Calculate Tax   |");
		    System.out.println("|   4. Exit            |");
		    System.out.println("|                      |");
		    System.out.println("========================");
		    System.out.println();
		}
		public static double findSum(double x, double y) {
			double sum = x + y;
			return sum;
		}
		public static double findAverage(double x, double y){
			double sum = x + y;
			double average = sum/2;
			return average;
		}
		public static double calcTax(double x, double y) {
			double sum = x + y;
			double tax = sum * .0831;
			return tax;

		}
	
}