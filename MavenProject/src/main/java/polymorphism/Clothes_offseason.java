package polymorphism;

public class Clothes_offseason extends Clothes_parentclass{
public double discount(double amount)
{
	double discountrate=0.15;
	return amount*discountrate;
}
}
