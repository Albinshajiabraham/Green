package sculptorist;

import java.util.Scanner;

public class Idol 
{

	public static void main(String[] args) 
	{
		int num;
		System.out.println("Enter the kgs of gold");
		Scanner in=new Scanner (System.in);
		num=in.nextInt();
	    int c=(num/5);
	    int v=c/5;
	    int x=v+num+c;
	    System.out.println("Number of sculptors can be made is "+x);
	

	}

}
