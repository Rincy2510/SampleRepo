package interface_example;

public class Interface_Ex2 implements Interface_Ex1{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
	}
	public void add()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface_Ex2 obj=new Interface_Ex2();
		obj.display();
		obj.add();
	}
}
