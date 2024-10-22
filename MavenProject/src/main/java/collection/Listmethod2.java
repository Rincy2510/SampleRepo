package collection;

import java.util.ArrayList;
import java.util.List;

public class Listmethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> obj=new ArrayList<String>();
obj.add("Green");
obj.add("Red");
obj.add("White");
obj.add("Black");
obj.add("Red");
System.out.println(obj);
obj.set(2,"Blue"); //index starts from 0,index2 will change
System.out.println(obj);
int a=obj.indexOf("Red");//find indexnumber
System.out.println(a);
int b=obj.lastIndexOf("Red");
System.out.println(b);
obj.remove("Blue");
System.out.println(obj);
System.out.println(obj.get(2));
System.out.println(obj.contains("Red"));
	}

}
