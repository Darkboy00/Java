import java.util.Iterator;
import java.util.Scanner;
public class Driver 
{
	public static void main(String[] args) 
	{
		/*
		for(int i = 0; i < 10; i++) 
		{
			System.out.println(i);
		}
		for(int i = 9; i >= 0; i--) 
		{
			System.out.println(i);
		}
		*/
		/*int[] numbers = {2,4,6,8,10,12};
		for(int i = 0; i < numbers.length; i++) 
		{
			System.out.println(numbers[i]);
		}*/
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.print("Number 1:");
		int x = scanner.nextInt();
		System.out.print("Number 2:");
		int y = scanner.nextInt();
		for(int i = x; i <= y; i++) 
		{
			if(i % 2 == 0) 
			{
				System.out.println(i);
			}
		}
		*/
		String[] names;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Number of people: ");
		names = new String[Integer.parseInt(scanner.nextLine())];
		for (int i = 0; i < names.length; i++) 
		{
			System.out.print((i + 1) + ". People:");
			names[i] = scanner.nextLine();
		}
		for (int i = 0; i < names.length; i++) 
		{
			System.out.print(names[i] + ", ");
		}
	}
}