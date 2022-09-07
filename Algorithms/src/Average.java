import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
public class Average 
{
	public static void main(String[] args) 
	{
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many numbers will be produced: ");
		int number = scanner.nextInt();
		int[] numbers = new int[number];
		for(int i = 0; i < numbers.length; i++) 
		{
			numbers[i] = random.nextInt(100);
		}
		System.out.println(Arrays.toString(numbers));
		float total = 0.0f;
		for (int i = 0; i < numbers.length; i++) 
		{
			total += numbers[i];
		}
		System.out.print("Average: ");
		float average = total/number;
		System.out.println(average);
	}
}