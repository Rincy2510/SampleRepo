package exceptionhandling;

public class Exception_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
int b=0;
try //exception line of code written inside try block
{
int div=a/b;
System.out.println(div);	
}
catch(ArithmeticException x) //to overcome the exception handling,we use catch block
{
	int c=10;
	int d=2;
	int sum=c+d;
	System.out.println(sum);
	System.out.println(x);
	
	}
/*finally
{
	System.out.println("execution of code completed"); //must execute line of code is written inside the finally
}*/
}
}
