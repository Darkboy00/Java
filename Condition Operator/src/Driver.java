import java.util.Scanner;
public class Driver 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Age: ");
		int age = scanner.nextInt();
		System.out.println(age >= 18 ? "You can get license." : "You can't get license");
	}
}