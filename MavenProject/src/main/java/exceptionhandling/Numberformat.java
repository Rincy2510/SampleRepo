package exceptionhandling;

public class Numberformat {
private static final String s="432.12";
	public static void main(String[] args) {

		try
		{
			int a=Integer.parseInt(s);		
		}
catch(NumberFormatException x)
{
	System.out.println("invalid string in argument");
}
}
}

