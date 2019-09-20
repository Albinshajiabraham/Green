package Resume;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Details 
{
String name;
String age;
String degree;
String branch;
String contactNo;
public Details(String name,String age,String degree,String branch,String contactNo)
{
this.name=name;
this.age=age;
this.degree=degree;
this.branch=branch;
this.contactNo=contactNo;
}
public void items(String name,String age,String degree,String branch,String contactNo)
{
	System.out.println("Name      :"+name);
	System.out.println("Age       :"+age);
	System.out.println("Degree    :"+degree);
	System.out.println("Branch    :"+branch);
	System.out.println("contact   :"+contactNo);
}
	public static void main(String[] args) throws IOException
	{
		String name;
		String age;
		String degree;
		String branch;
		String contactNo;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name");
		name=in.readLine();
		System.out.println("Enter your Age");
		age=in.readLine();
		System.out.println("Enter your Degree");
		degree=in.readLine();
		System.out.println("Enter your Branch");
		branch=in.readLine();
		System.out.println("Enter your Contact Number");
		contactNo=in.readLine();
		Details m=new Details(name,age,degree,branch,contactNo);
		m.items(name, age, degree, branch, contactNo);
	}

}