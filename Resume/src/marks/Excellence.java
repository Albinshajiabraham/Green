package marks;

import java.util.Scanner;

public class Excellence 
{

	public static void main(String[] args)
	{
		int n;
		int t;
		int c;
		System.out.println("Enter the number of students");
		Scanner in=new Scanner (System.in);
		n=in.nextInt();
		int arr[]=new int [n];
		System.out.println("Enter the marks of students");
		for(int i=0;i<n;i++)
		{
			t=in.nextInt();
			arr[i]=t;
		}
		System.out.println(" The priority of marks is");
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
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	    
		}

	}


