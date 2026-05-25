package collection;

import java.util.ArrayList;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> a1 = new ArrayList<>();
		a1.add("rrrr");
		a1.add("gggg");
		a1.add(1234);
		a1.add(123.4f);
		System.out.println(a1);
		ArrayList<Object> a2 = new ArrayList<>();
		a2.add("good");
		a2.add("yyy");
		a2.add(12);
		System.out.println(a2);
		a2.addAll(a1);
		boolean b = a2.contains("yyy");
		System.out.println(b);
		System.out.println(a2);
		a2.remove(0);
		System.out.println(a2);
		a1.remove(a2);
		System.out.println(a1);
		System.out.println(a1.get(1));
		System.out.println(a1);
		boolean d = a1.isEmpty();
		System.out.println(d);
		System.out.println(a1.size());
		a1.set(0, "Tv");
		System.out.println(a1);
		for(int j=0; j<a1.size(); j++)
		{
			System.out.println(a1.get(j));
		}
		System.out.println(a1);
	}

}
