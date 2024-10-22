package encapsulation;

public class Atm_program_class1 {
private int pin;
public void setpin(int pin)
{
this.pin=pin;
}
public boolean validatepin()
{
	int validpins[]= {1001,1234,1212};
	for(int validpin:validpins)
	{
		if(this.pin==validpin)
		{
			return true;
		}
	}
	return false;

}
public void withdrawAmount(int amount)
{
	if(validatepin())
	{
		System.out.println("Valid pin");
		System.out.println("Withdrawal of Rs."+amount+" "+"successfull");
	}
	else
	{
		System.out.println("Inalid pin Withdrawal Failed");
	}
}
}