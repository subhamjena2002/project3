public class Swap { 
	public static void main(String ...args) {
		swap(10,12);
	}
	
	public static void swap(int number1, int number2) { 
		int temp = number1;
		number1 = number2;
		number2 = temp;
		
		System.out.println("After swap : "+number1+" "+number2);
	}
}