package accessModifier;

public class AccessSpecifierExample {
public void display() //most visibility
{
	System.out.println("Public Access Modifier");
}
private void display1()  //least visibility,within the class
{
	System.out.println("Private Access Modifier");
}
protected void display2()  //within the package
{
	System.out.println("Protected Access Modifier");
}
void display3() //within the package
{
	System.out.println("Default Access Modifier");
}
public static void main(String args[])
{
	AccessSpecifierExample obj=new AccessSpecifierExample();
			obj.display();
	AccessSpecifierExample obj1=new AccessSpecifierExample();
			obj1.display1();
	AccessSpecifierExample obj2=new AccessSpecifierExample();
			obj2.display2();
	AccessSpecifierExample obj3=new AccessSpecifierExample();
			obj3.display3();
}
	}

