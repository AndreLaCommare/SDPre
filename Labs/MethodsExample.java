public class MethodsExample {
	public static void main(String[] args){
		printRectangle();
	}
	public static void printSquare(){
		String xLine = "XXXXXXXXXXXXXXXXXXXX";
		for (int i = 0; i < 10; i ++){
			System.out.println(xLine);
		}
	}

	public static void printRectangle(){
		printSquare();
		printSquare();
	}
}