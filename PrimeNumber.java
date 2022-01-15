///PrimeNumber or Not
import java.util.Scanner;
public class PrimeNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int count=0;
		System.out.println("Enter number:");
		num = sc.nextInt();
		for(int i=0;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("Number is Prime");
		}
		else
		{
			System.out.println("number is not Prime");
		}
	}
}