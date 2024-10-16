package inheritence;

public class Inheritence2 extends Inheritence1{ //childclass inherit the properties of parent class
	public void display1()
	{
		System.out.println("child class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritence2 obj=new Inheritence2();
		obj.display();
		obj.display1();
	}
}
