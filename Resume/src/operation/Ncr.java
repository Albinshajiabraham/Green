package operation;

import java.util.Scanner;

public class Ncr 
{

	public static void main(String[] args) 
	{
		long a;
		long b;
        long sum=1;
		long num=1;
		long skm=1;
		long r;
		System.out.println("Enter the value of n");
		Scanner in=new Scanner (System.in);
		a=in.nextInt();
		System.out.println("Enter the value of r");
		b=in.nextInt();
		long v=a-b;
		
		for(int i=1;i<=a;i++)
		{
			sum=sum*i;
		}
		for(int i=1;i<=b;i++)
		{
			num=num*i;
		}
		for(int i=1;i<=v;i++)
		{
			skm=skm*i;
		}
		
		long c=num*skm;
		r=sum/c;
		System.out.println("The NCR factor for given values is "+r);
	

	}

}
