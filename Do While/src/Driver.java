import java.util.Scanner;
public class Driver 
{
	public static void main(String[] args) 
	{
		/*
		int i = 0;
		do 
		{
			System.out.println(i++);
		}
		while(i < 10);
		*/
		String password = null;
		Scanner scanner = new Scanner(System.in);
		do 
		{
			System.out.print("Password: ");
			password = scanner.nextLine();
		}
		while(!password.equals("123"));
		System.out.println("Welcome");
	}
}