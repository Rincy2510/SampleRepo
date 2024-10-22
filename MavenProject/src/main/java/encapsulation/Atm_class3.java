package encapsulation;

public class Atm_class3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Atm_program_class1 obj1=new Atm_program_class1();
		Atm_program_class2 obj2=new Atm_program_class2();
int pin=obj2.getpin();
obj1.setpin(pin);
obj1.withdrawAmount(1000);
	}

}
