import java.util.Scanner;
public class Addition 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int total = 0;
		int input = 0;
		do 
		{
			System.out.print("Enter the number: ");
			input = scanner.nextInt();
			total += input;
		}
		while(input != 0);
		System.out.println("Total: " + total);
	}
}