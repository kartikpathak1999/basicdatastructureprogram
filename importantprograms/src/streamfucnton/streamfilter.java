package streamfucnton;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class streamfilter {
	
	public static void main(String[]args) {
		
		ArrayList<Integer> a= new ArrayList<Integer>();
		
		a.add(10);
		
		a.add(20);
		
		a.add(87);
		
		a.add(40);
		
		System.out.println(a);
		
		List<Integer>l1=a.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		System.out.println(l1);
	}

}
