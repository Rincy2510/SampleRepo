package collection;

import java.util.ArrayList;
import java.util.List;

public class ColourList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> obj=new ArrayList<String>();
obj.add("Red");
obj.add("Blue");
obj.add("Yellow");
obj.add("Purple");
System.out.println(obj);
for(String x:obj)
{
	System.out.println(x);
}
System.out.println(obj.get(2));
obj.remove(1);
System.out.println(obj);
System.out.println(obj.contains("Red"));

	}

}
