package exceptionhandling;

public class Exception_EX3 {
	public static void main(String args[]) throws VotingException
	{
	int age=11;
	if(age>=18)
	{
		System.out.println("Eligible for voting");
	}
	else
	{
		throw new VotingException("Not eligible for voting");
	}
}
}
