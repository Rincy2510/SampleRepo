package collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<Integer>obj=new LinkedHashSet<Integer>();
{
	obj.add(31);//add new value to the set
	obj.add(21);
	obj.add(41);
	obj.add(11);
	obj.add(61);
	obj.add(51);
	obj.remove(21);
	obj.remove(31);
	System.out.println(obj);
	Set<Integer>obj1=new LinkedHashSet<Integer>();
	{
		obj.add(31);//add new value to the set
		obj.add(21);
		obj.add(41);
	System.out.println(obj);
	System.out.println(obj.contains(41));
	System.out.println(obj.contains(10));
	System.out.println(obj.containsAll(obj1));
	System.out.println(obj.size());
}
	}

}
}
