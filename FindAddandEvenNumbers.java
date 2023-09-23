package Collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindAddandEvenNumbers {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8);
		list.stream().filter(x->x%2==0).forEach(System.out::print);
		list.stream().filter(x->x%2==1).forEach(System.out::println);
	}

}
