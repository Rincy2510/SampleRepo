package interface_example;

public class MultipleInheritence_EX3 implements MultipleInheritence_EX1,MultipleInheritence_EX2 {
		// TODO Auto-generated method stub
		public void display()
		{
			System.out.println("Hello");
		}
		public void add()
		{
			int a=10;
			int b=12;
			int sum=a+b;
			System.out.println(sum);
		}
		public static void main(String args[])
		{
			MultipleInheritence_EX3 obj=new MultipleInheritence_EX3();
			obj.display();
			obj.add();
	}

}
