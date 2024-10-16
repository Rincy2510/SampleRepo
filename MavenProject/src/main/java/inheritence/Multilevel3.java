package inheritence;

public class Multilevel3 extends Multilevel2 {
	public void display2()
	{
		System.out.println("Child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multilevel3 obj=new Multilevel3();
		obj.display();
		obj.display1();
		obj.display2();
	}

}
