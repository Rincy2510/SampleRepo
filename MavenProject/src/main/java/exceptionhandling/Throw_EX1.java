package exceptionhandling;

public class Throw_EX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age=11;
if(age>=18)
{
	System.out.println("Eligible for voting");
}
else
{
	throw new ArithmeticException("Not eligible for voting");
}
	}

}
