package series;

import java.util.Scanner;

public class Fibonacci
{

	public static void main(String[] args) 
	{
	int num;
	int c;
	Scanner in=new Scanner (System.in);
	System.out.println("Enter a number");
	num=in.nextInt();
	int a=0;
	int b=1;
	System.out.print("THe fibonacci series is ");
	System.out.print(a);
	System.out.print(" "+b);
	for(int i=2;i<num;i++)
	{
	c=	a+b;
	a=b;
	b=c;
	System.out.print(" "+c);
	c=0;
	}
	}
	

	}

