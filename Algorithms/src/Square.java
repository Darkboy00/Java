import java.util.Scanner;
public class Square 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a length: ");
		int x = scanner.nextInt();
		// area = x2
		// perimeter = 4x
		
		int area = (int)Math.pow(x, 2);
		int perimeter = 4 * x;
		System.out.println(area);
		System.out.println(perimeter);
	}
}