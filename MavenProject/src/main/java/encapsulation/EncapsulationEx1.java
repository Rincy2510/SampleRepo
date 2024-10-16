package encapsulation;

public class EncapsulationEx1 {
private String name;
private int rollno;
public void setdetail(String name,int rollno)
{
	this.name=name;
	this.rollno=rollno;
}
public void getdetail()
{
	System.out.println(name);
	System.out.println(rollno);
}
}
