import java.util.Scanner;
public class Driver 
{
	public static void main(String[] args) 
	{
		/*
		int x;
		x = 10;
		x++;
		x = x + 1;
		System.out.println(x++);
		System.out.println(x);
		System.out.println(--x);
		System.out.println(5%2);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int a = scanner.nextInt();
		System.out.println(a % 2 == 0 ? "even number" : "odd number");
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the password: ");
		String password = scanner.nextLine();
		boolean isOk = password.equals("1234");
		System.out.println(isOk ? "password is correct" : "password is wrong");
		
	}
}