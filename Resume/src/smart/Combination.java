package smart;

import java.util.Scanner;

public class Combination
{

	public static void main(String[] args) 
	{
		int n;
		int sum=1;
		Scanner in=new Scanner (System.in);
		System.out.println("Enter the number of alphabets in your name");
		n=in.nextInt();
		for(int i=1;i<=n;i++)
		{
			sum=sum*i;
		}
		System.out.println("The number of combination is "+sum);

	}

}
