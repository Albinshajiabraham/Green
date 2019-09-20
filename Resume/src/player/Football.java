package player;

import java.util.Scanner;

public class Football
{

	public static void main(String[] args)
	{
		int n;
		int t;
		int c=0;
		int count=0;
		System.out.println("Enter the number of players");
		Scanner in=new Scanner (System.in);
		n=in.nextInt();
		int arr[]=new int [n];
		int brr[]=new int [n];
		System.out.println("Enter the number of fouls made by each player");
		for(int i=0;i<n;i++)
		{
			t=in.nextInt();
			arr[i]=t;
		}
		for(int i=0;i<n;i++)
		{
		brr[i]=arr[i];	
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;i<n;i++)
			{
				if(arr[i]<arr[j])
				{
					c=arr[i];
					arr[i]=arr[j];
					arr[j]=c;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]==brr[i])
			{
				++count;
				}
			}
		System.out.println("The eligibility player is player no: "+count+" ("+arr[0]+"fouls )");
		

	}

}
