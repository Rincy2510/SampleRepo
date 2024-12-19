package collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetMethod_4 {

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
			System.out.println(obj);	
			ArrayList<Integer>obj1=new ArrayList<Integer>();
			{
				obj1.add(31);//add new value to the set
				obj1.add(21);
				obj1.add(41);
				System.out.println(obj1);
				obj.retainAll(obj1);//common elements
				System.out.println(obj);
	}

}
}
}