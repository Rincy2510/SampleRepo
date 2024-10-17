package aggrigation;

public class AggrigationEx2 {
String city;
int pin;
AggrigationEx1 ref; //aggrigation
public AggrigationEx2(String city,int pin,AggrigationEx1 ref) //constructor
{
	this.city=city;
	this.pin=pin;
	this.ref=ref;
}
public void display()
{
	System.out.println(ref.name+" "+ref.rollno);
	System.out.println(city+" "+pin);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AggrigationEx1 obj=new AggrigationEx1("Rincy",12);
		AggrigationEx2 obj1=new AggrigationEx2("kollam",691602,obj); //calling by using reference variable
		obj1.display();
	}

}
