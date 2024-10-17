package interface_example;

public class MultipleInheritence_child implements MultipleInheritence_Parent,MultipleInheritence_Parent2 {

	public void sub()
	{
		int a=20;
		int b=10;
		int sub=a-b;
		System.out.println(sub);
	}
	public void display()
	{
		System.out.println("Hello");
	}
	public void add()
	{
		int a=22;
		int b=11;
		int sum=a+b;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritence_child obj=new MultipleInheritence_child();
		obj.add();
		obj.display();
		obj.sub();
	}

}
