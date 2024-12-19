package abstractionexample;

public class Contractor extends Employee{
private int workinghours;
public Contractor(String name,int payment,int workinghours)
{
	super(name,payment);
	this.workinghours=workinghours;
}
public double calculatesalary()
{
	return payment+workinghours;
}

}
