package inheritence;

public class Hierarchicalex2 extends Hierarchicalex1{
public void display1()
{
	System.out.println("ChildClass 1");
	}
public static void main(String args[])
{
	Hierarchicalex2 obj1=new Hierarchicalex2();
	obj1.display();
	obj1.display1();
}
}
