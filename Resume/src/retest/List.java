package retest;

import java.util.Scanner;

public class List
{

	public static void main(String[] args)
	{
	int n;
	int t;
	int count=0;
	Scanner in=new Scanner (System.in);
	System.out.println("Enter the number of students");
	n=in.nextInt();
	int arr[]=new int[n];
	System.out.println("enter the number of students");
	for(int i=0;i<n;i++)
	{
		t=in.nextInt();
		arr[i]=t;
	}
	for(int i=0;i<n;i++)
	{
	if(arr[i]<50)
	{
		++count;
	}
	}
	System.out.println("Number of students appearing for the retest is "+count);

	}

}
