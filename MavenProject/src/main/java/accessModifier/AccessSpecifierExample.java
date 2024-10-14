package accessModifier;

public class AccessSpecifierExample {
public void display()
{
	System.out.println("Public Access Modifier");
}
private void display1()
{
	System.out.println("Private Access Modifier");
}
protected void display2()
{
	System.out.println("Protected Access Modifier");
}
void display3()
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

