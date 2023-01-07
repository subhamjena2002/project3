public class Factorial {
	public static void main(String ...args) {
		int number = 5;

		System.out.println("Factorial of " + number + " : " + factorial(number));
	}
	
	public static int factorial(int number) {
		int factorial = 1;
	
		while (number != 0) {
			factorial *= number;
			number--;
		}
		
		return factorial;
	}
}