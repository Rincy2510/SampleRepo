package superkeyword;

public class Childclass1 extends Parentclass1{
public void sub()
{
	int a=20;
	int b=10;
	int subt=a-b;
	System.out.println(subt);
	super.add(); //to refer the immediate parentclass instance method
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childclass1 obj1=new Childclass1();
		obj1.sub();
	}

}
