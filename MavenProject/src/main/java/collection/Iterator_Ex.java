package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> obj=new ArrayList<String>();
		obj.add("Red");
		obj.add("Blue");
		obj.add("White");
		obj.add("Black");
		Iterator ref=obj.iterator();
		while(ref.hasNext())
		{
			System.out.println(ref.next()); //fetch the element
		}
		ref.remove(); //remove last element
		System.out.println(obj);
	}

}
