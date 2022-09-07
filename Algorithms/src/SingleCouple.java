import java.util.Arrays;
import java.util.Scanner;
public class SingleCouple 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many numbers: ");
		int numberOfNumbers = scanner.nextInt();
		int[] numbers = new int[numberOfNumbers];
		for (int i = 0; i < numbers.length; i++) 
		{
			System.out.print("Number: ");
			numbers[i] = scanner.nextInt();
		}
		System.out.println(Arrays.toString(numbers));
		for (int i = 0; i < numbers.length; i++) 
		{
			if(numbers[i] % 2 == 0) 
			{
				System.out.println(numbers[i] + " even numbers");
			}
			else 
			{
				System.out.println(numbers[i] + " odd number");
			}
		}
	}
}