import java.util.Scanner;
public class Driver 
{
	public static void main(String[] args) 
	{
		/*
		int number = 10;
		boolean result = number > 0;
		if(result) 
		{
			System.out.println("positive");
			System.out.println("hello");
		}
		else 
		{
			System.out.println("negative");
		}
		System.out.println("Hello World");
		*/
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = scanner.nextInt();
		if(number % 2 == 0) 
		{
			System.out.println("even");
		}
		else 
		{
			System.out.println("odd");
		}
		*/
		/*
		int  number = 10;
		if(number < 100) 
		{
			System.out.println("number < 100");
			if(number > 50) 
			{
				System.out.println("number > 50");
			}
		}
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = scanner.nextInt();
		if(number < 100 && number >= 10) 
		{
			System.out.println("2 digits");
		}
		else if(number < 1000 && number >= 100) 
		{
			System.out.println("3 digits");
		}
		else if(number < 10000 && number >= 1000) 
		{
			System.out.println("4 digits");
		}
		else 
		{
			System.out.println("Not between 10 & 9999");
		}
	}
}