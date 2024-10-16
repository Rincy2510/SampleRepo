package polymorphism;

public class Childclass extends Parentclass{
public void display()
{
	int a=20;
	int b=10;
	int sub=20-10;
	System.out.println(sub);
	super.display();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childclass obj=new Childclass();
		obj.display();
	}

}
