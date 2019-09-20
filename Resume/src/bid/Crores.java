package bid;

import java.util.Scanner;

public class Crores 
{

	public static void main(String[] args)
	{
	int n;
	int t;
	int c=0;
	System.out.println("Enter the number of applications");
	Scanner in=new Scanner (System.in);
	n=in.nextInt();
	int arr[]=new int [n];
	System.out.println("Enter the amount (in crores)");
	for(int i=0;i<n;i++)
	{
		t=in.nextInt();
		arr[i]=t;
	}
	for(int i=0;i<n;i++)
	{
		for(int j=0;i<n;i++)
		{
			if(arr[i]>arr[j])
			{
				c=arr[i];
				arr[i]=arr[j];
				arr[j]=c;
			}
		}
	}
	System.out.println("The winning bid is " + arr[0] +" crores");
	
	
	}
}


