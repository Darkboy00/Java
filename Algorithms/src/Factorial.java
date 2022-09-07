import java.util.Scanner;
public class Factorial 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = scanner.nextInt();
		
		// 5! = 5 * 4 * 3 * 2 * 1;
		 
		int result = n;
		for (int i = n - 1; i > 0; i--) 
		{
			result = result * i;
		}
		System.out.println(result);
	}
}