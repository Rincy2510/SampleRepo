package exceptionhandling;

public class Stringoutofbound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="welcome";
try
{
String substring=s.substring(2,8);
	}
catch(StringIndexOutOfBoundsException x)
{
	System.out.println("String index is out of bounds:"+x.getMessage());
}
}
}
