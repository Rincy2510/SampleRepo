package abstractionexample;

public abstract class Employee {
public String name;
public double payment;
public Employee(String name,double payment)
{
	this.name=name;
	this.payment=payment;
}
public abstract double calculatesalary();
}
