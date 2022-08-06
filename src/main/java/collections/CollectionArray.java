package collections;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionArray {
	

	public static void main(String[] args) {
		
		List<String> li=new ArrayList <String>();
		li.add ("Ahmad");
		li.add ("Mohammad");
		li.add ("Omar");
		li.add ("Akbar");
		System.out.println(li);
		li.add ("Akbar");
		li.add ("Ahmad");
		
		System.out.println(li);
		System.out.println(li.get(4));
		// we convert Array list to iterator to print any value even if we dont know how many value do we have: SEE Example as bellow.
		Iterator <String> it = li.iterator();
		while (it.hasNext());
	
		
			
		} 
}
