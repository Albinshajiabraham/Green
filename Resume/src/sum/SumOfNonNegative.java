package sum;

import java.util.Scanner;

public class SumOfNonNegative
{

	public static void main(String[] args)
	{
		int num;
		int sum=0;
			do
			{
		System.out.println("Enter a number");
		Scanner in=new Scanner (System.in);
		num=in.nextInt();
			}while(num<0);
		for(int i=1;i<=num;i++)
		{
		sum=sum+i;
		}
		System.out.println("the sum is "+sum);
	}
}
	
