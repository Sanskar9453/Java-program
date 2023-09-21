import java.util.*;
 class allnatural
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value till the Natural numbers to be printed :");
		int n = sc.nextInt();
		int i = 1; 
		System.out.println("Natural number till "+n+ " are :");
		while(i<=n) {
			System.out.println(i);
			i++;
		}
		
	}
}