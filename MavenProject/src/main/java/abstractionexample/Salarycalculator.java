package abstractionexample;

public class Salarycalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contractor obj=new Contractor("Rincy",500,10);
		System.out.println("contractors salary: Rs.+"+obj.calculatesalary());
		Fulltime obj1=new Fulltime("Renu",400);
		System.out.println("fulltime employee salary: Rs.+"+obj1.calculatesalary());

	}

}
