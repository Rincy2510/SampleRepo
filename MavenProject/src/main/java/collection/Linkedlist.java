package collection;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> obj=new LinkedList<String>();
		obj.add("Red");
		obj.add("Blue");
		obj.add("White");
		obj.add("Black");
		System.out.println(obj);
		LinkedList<String> obj1=new LinkedList<String>();
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

