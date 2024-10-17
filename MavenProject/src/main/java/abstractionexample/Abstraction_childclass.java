package abstractionexample;

public class Abstraction_childclass extends Abstraction_Ex1{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int a=10;
		int b=10;
		int sum=a+b;
		System.out.println(sum);
	}
	public void sub()
	{
		int a=20;
		int b=10;
		int sub=a-b;
		System.out.println(sub);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstraction_childclass obj=new Abstraction_childclass();
		obj.add();
		obj.sub();
		obj.display();
	}
}
