import java.util.Scanner;
public class Driver 
{
	public static void main(String[] args) 
	{
		boolean result = 9 != 9;
		System.out.println(result);
		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.nextLine();
		String str2 = scanner.nextLine();
		System.out.println(str1.equals(str2));
	}
}