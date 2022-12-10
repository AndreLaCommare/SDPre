import java.util.Scanner;
public class Objective9Lab3 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int selection;
		while(true){
			printMenu();
			selection = scanner.nextInt();
			if (selection == 1){
				System.out.println("Hello World");
			}
			else if (selection == 2){
				System.out.println("Apples, Bananas, Coconuts");
			}
			else{
				System.out.println("Goodbye");
				break;
			}
		}
		scanner.close();
	}
	public static void printMenu() {
		System.out.println("____Menu____");
		System.out.println("1: Say Hello");
		System.out.println("2: List My Favorite Foods");
		System.out.println("3: Exit");
		System.out.println();
	}
}