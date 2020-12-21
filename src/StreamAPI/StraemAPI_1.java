package StreamAPI;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StraemAPI_1 {
	public static void main(String[] args) {

		List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5, 6);
		for (int i = 0; i < l1.size(); i++) {
			System.out.println(l1.get(i));
		}
		System.out.println("*******************************************************");

		Iterator<Integer> obj = l1.iterator();
		while (obj.hasNext()) {
			System.out.println(obj.next());
		}

		System.out.println("*******************************************************");

		for (Integer j : l1) {
			System.out.println(j);
		}
		
		System.out.println("*******************************************************");
		
//Internal iteration 
		l1.forEach(i -> System.out.println(i));
		

	}
}
