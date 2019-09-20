package jack;

import java.util.Scanner;

public class Average 
{

	public static void main(String[] args) 
	{
		int n;
		int t;
		int sum=0;
		System.out.println("Enter the number of subjects");
		Scanner in=new Scanner (System.in);
		n=in.nextInt();
		int arr[]=new int [n];
		System.out.println("Enter the marks of subjects");
		for(int i=0;i<n;i++)
		{
			t=in.nextInt();
			arr[i]=t;
		}
		for(int i=0;i<n;i++)
		{
			sum=sum+arr[i];
		}
		int avg=sum/n;
		System.out.println("The average is "+avg);

		

	}

}
