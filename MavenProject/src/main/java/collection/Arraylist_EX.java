package collection;

import java.util.ArrayList;

public class Arraylist_EX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> obj=new ArrayList<String>();
obj.add("Red");
obj.add("Blue");
obj.add("White");
obj.add("Black");
System.out.println(obj);
ArrayList<String> obj1=new ArrayList<String>();
obj1.add("Pink");
obj1.add("Yellow");
System.out.println(obj1);{
obj.addAll(obj1);
System.out.println(obj);
System.out.println(obj.contains("Blue"));
System.out.println(obj.get(3));
System.out.println(obj.isEmpty());
obj.remove(2); 
System.out.println(obj);
System.out.println(obj.size());
}
	}

}
