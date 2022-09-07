import java.util.Scanner;
public class Driver 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Number 1: ");
		float x = Float.parseFloat(scanner.nextLine());
		System.out.print("Number 2: ");
		float y = Float.parseFloat(scanner.nextLine());
		System.out.print("Operation: ");
		char operation = scanner.nextLine().charAt(0);
		switch(operation) 
		{
		case '+':
			System.out.println("Result: " + (x + y));
			break;
		case '-':
			System.out.println("Result: " + (x - y));
			break;
		case '*':
			System.out.println("Result: " + (x * y));
			break;
		case '/':
			System.out.println("Result: " + (x / y));
			break;
		default:
			System.out.println("unknown operator");
			break;
		}
	}
}