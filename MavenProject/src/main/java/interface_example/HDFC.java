package interface_example;

public class HDFC implements RBI{
	public double rd(double amount,int duration)
	{
		double monthlyinterest=(interestrate/100)/12;
		double maturityamount=amount+((Math.pow(1+monthlyinterest,duration)-1)/monthlyinterest);
		return maturityamount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HDFC obj=new HDFC();
double amount=5000;
int duration=24;
double maturityamount=obj.rd(amount, duration);
System.out.printf("Maturity amount after %d months for a deposit of INR %2f is INR %.2f%n",duration,amount,maturityamount);

	}

}
