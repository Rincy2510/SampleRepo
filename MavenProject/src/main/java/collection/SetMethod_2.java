package collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetMethod_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<Integer>obj=new LinkedHashSet<Integer>();
{
	obj.add(31);
	obj.add(21);
	obj.add(41);
	System.out.println(obj);
	ArrayList<Integer>obj1=new ArrayList<Integer>();
	obj1.add(91);
	obj1.add(71);
	obj1.add(81);
	obj.addAll(obj1);
	System.out.println(obj);
}
	}

}
