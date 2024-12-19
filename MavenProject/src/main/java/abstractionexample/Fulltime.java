package abstractionexample;

public class Fulltime extends Employee{
public Fulltime(String name,double payment)
{
	super(name,payment);
}
public double calculatesalary()
{
	int workinghours=8;
	return payment+workinghours;
}
}
