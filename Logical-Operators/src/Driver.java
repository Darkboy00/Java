public class Driver 
{
	public static boolean test() 
	{
		System.out.println("Test Run");
		return false;
	}
	public static void main(String[] args) 
	{
		boolean b = true;
		System.out.println(b);
		System.out.println(!b);
		System.out.println(b & true);
		
		// false & false = false
		// false & true = false
		// true & false = false
		// true & true = true
		
		// false | false = false 
		// false | true = true
		// true | false = true
		// true | true = true
		System.out.println(b | false);
		System.out.println(b || test());
	}
}