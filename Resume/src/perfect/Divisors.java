package perfect;

import java.util.Scanner;

public class Divisors
{

	public static void main(String[] args)
	{
		int n;
		int sum=0;
		System.out.println("Enter a number");
		Scanner in=new Scanner (System.in);
		n=in.nextInt();
		System.out.println("The divisors of the numbers are ");
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				System.out.print(" "+i);
				sum=sum+i;
			}
		}
		if(n==sum)
		{
			System.out.println("\nIt is a perfect number");
		}
		else
		{
			System.out.println("\nIt is not a perfect number");
		}

	}

}
