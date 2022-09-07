import java.util.Scanner;
public class Password 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		String password = "";
		do 
		{
			System.out.print("Password: ");
			password = scanner.nextLine();
		}
		while(!password.equals("1234")); 
		{
			System.out.println("Welcome");
		}
	}
}