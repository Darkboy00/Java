import java.util.Scanner;
public class Circle 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the radius:");
		int radius = scanner.nextInt();
		
		// area = pi * r2
		// perimeter = 2pir
		
		float area = (float)(Math.PI * Math.pow(radius, 2));
		float perimeter = (float)(2 * Math.PI * radius);
		System.out.println(area);
		System.out.println(perimeter);
	}
}