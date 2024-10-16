package inheritence;

public class Salary extends Salarycomponents{
public void totalsalary()
{
	double salary=basicpay+bonus+hra-pf-deduction;
	System.out.println("Basic pay:"+basicpay);
	System.out.println("HRA:"+hra);
	System.out.println("PF:"+pf);
	System.out.println("Deduction:"+deduction);
	System.out.println("Bonus:"+bonus);
	System.out.println("Total Salary:"+salary);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salary obj=new Salary();
			obj.getdetails();
			obj.components();
			obj.totalsalary();
				}
	}

