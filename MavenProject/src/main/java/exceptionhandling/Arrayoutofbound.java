package exceptionhandling;

public class Arrayoutofbound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s[]=new String[10];
try
{
	System.out.println(s[10]);
}
catch(ArrayIndexOutOfBoundsException x)
{
	System.out.println("caught an ArrayIndexOutOfBoundsException:"+x.getMessage());
}
}
}