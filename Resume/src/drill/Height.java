package drill;

import java.util.Scanner;

public class Height
{

	public static void main(String[] args)
	{
	int n;
	double t;
	double c;
	System.out.println("Enter the number of students");
	Scanner in=new Scanner (System.in);
	n=in.nextInt();
	double arr[]=new double [n];
	System.out.println("Enter the heights of the students");
	for(int i=0;i<n;i++)
	{
		t=in.nextDouble();
		arr[i]=t;
	}
	System.out.println(" The heights in the order");
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
		System.out.println(arr[i]);
	}
    
	}

}
