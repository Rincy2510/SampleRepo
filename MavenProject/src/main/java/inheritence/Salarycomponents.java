package inheritence;

public class Salarycomponents extends Employeedetails{
double hra,pf;
public void components()
{
	hra=0.05*basicpay;
	pf=0.20*basicpay;
}
}
