import java.util.Scanner;
public class VisaCalculator 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Visa note: ");
		int visaNote = scanner.nextInt();
		System.out.print("Final note: ");
		int finalNote = scanner.nextInt();
		float average = (visaNote * 0.4f) + (finalNote * 0.6f);
		if(average >= 50 && finalNote >= 50) 
		{
			System.out.println("You passed");
		}
		else 
		{
			System.out.println("You stayed");
		}
	}
}