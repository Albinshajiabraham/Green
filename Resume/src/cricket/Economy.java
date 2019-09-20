package cricket;

import java.util.Scanner;

public class Economy {

	public static void main(String[] args)
	{
		int n;
		int t;
		double c;
		int sum=0;
		double num=0;
		int count=0;
		System.out.println("Enter the number of bowlers");
		Scanner in=new Scanner (System.in);
		n=in.nextInt();
		int arr[]=new int [n];
		System.out.println("Enter the runs conceded by the bowlers");
		for(int i=0;i<n;i++)
		{
			t=in.nextInt();
			arr[i]=t;
			sum=sum+arr[i];
		}
		int crr[]=new int[n];
		System.out.println("Enter the number of balls for each bowler");
		for(int i=0;i<n;i++)
		{
			t=in.nextInt();
			crr[i]=t;
		}
		double brr[]=new double [n];
		for(int i=0;i<n;i++)
		{
			brr[i]=crr[i];
			brr[i]=brr[i]/6.0;
			num=num+brr[i];
		}
		double drr[]=new double[n];
		System.out.println("Economy of the bowler is");
		for(int i=0;i<n;i++)
		{
			drr[i]=arr[i]/brr[i];
			System.out.printf("%.1f \n",drr[i]);
		}
		
		System.out.println("The overall economy of the team is");
		c=sum/num;
		System.out.printf("%.1f \n",c);
		System.out.println("The number of bowlers eligible are");
		for(int i=0;i<n;i++)
		{
			if(c>drr[i])
			{
				++count;
			}
		}
		System.out.println(count);
		}
		
		
		

	}



