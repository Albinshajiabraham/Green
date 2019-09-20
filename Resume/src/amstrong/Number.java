package amstrong;

import java.util.Scanner;

public class Number 
{

	public static void main(String[] args) 
	{
		int number;
		int rev=1;
		int rem;
		int count=0;
		int c;
		int sum=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number");
		number=in.nextInt();
		c=number;
		while(number>0)
		{
			number=number/10;
			++count;
		}
		number=c;
		for(int i=0;i<count;i++)
		{
			rem=number%10;
			rev=1;
			for(int j=0;j<count;j++)
			{
				rev=rev*rem;
				
			}
			sum=sum+rev;
			number=number/10;
		}
		//System.out.println(sum);
		//System.out.println(c);
		if(c==sum)
		{
			System.out.println("The given number is amstrong");
		}
		else
		{
			System.out.println("The given number is not amstrong");
		}
				
	
	
	}
	}


