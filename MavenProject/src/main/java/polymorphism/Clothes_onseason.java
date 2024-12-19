package polymorphism;

public class Clothes_onseason extends Clothes_parentclass  {
public double discount(double amount)
{
	double discountrate=0.40;
	return amount*discountrate;
}
}
