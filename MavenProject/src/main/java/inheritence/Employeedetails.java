package inheritence;

import java.util.Scanner;

public class Employeedetails {
double basicpay,deduction,bonus;
public void getdetails()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter basic pay:");
	basicpay=sc.nextDouble();
	System.out.println("Enter deduction:");
	deduction=sc.nextDouble();
	System.out.println("Enter bonus:");
	bonus=sc.nextDouble();
}
}
