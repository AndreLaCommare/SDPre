import java.util.Scanner;
public class Objective5Lab4 {
	public static void main(String[] args){
		Scanner number = new Scanner(System.in);
		int userNum;
		System.out.println("Please enter a whole number:");
		userNum = number.nextInt();
		if (userNum % 2 == 0){
			System.out.println("The number is even.");
		}
		else {
			System.out.println("The number is odd.");
		}
		number.close();
	}
}