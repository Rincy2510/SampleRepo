package superkeyword;

public class Childclass extends Parentclass {
String c="Rincy"; //instance variable
public void display()
{
	System.out.println(c);
	System.out.println(super.c); //refer the immediate parent class instance variable
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childclass obj=new Childclass();
		obj.display();
	}
}
