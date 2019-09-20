package vehicle;

import java.util.Scanner;

public class Fare 
{

	public static void main(String[] args)
	{
		int a;
		int t;
		int heavy=0;
		int light=0;
		System.out.println("Enter the number of vehicles");
		Scanner in=new Scanner (System.in);
		a=in.nextInt();
		System.out.println("Enter the fare collected for each vehicles");
		int arr[]=new int [a];
		for(int i=0;i<a;i++)
		{
			t=in.nextInt();
			arr[i]=t;
		}
		for(int i=0;i<a;i++)
		{
			if(arr[i]>50)
			{
				++heavy;
			}
			if(arr[i]<50&&arr[i]>0)
			{
				++light;
			}
			
		}
		System.out.println("Number of heavy vehicles "+heavy+" and the number of light weight vehicles is "+light);
		

	}

}
