package Collections;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class MergingTwoLists {

	public static void main(String[] args) {
		
		List<Integer> list1=Arrays.asList(1,10,30,2,4,5,20,10);
		List<Integer> list2=Arrays.asList(20,1,3,4,5,6,10,20,30);
		//Merging list1 and list2
		List<Integer> Mergelist=Stream.concat(list1.stream(), list2.stream())
				.collect(Collectors.toList());
		System.out.println("Merging Two Lists = "+Mergelist);
		
		
		// get Unique Elements Both Lists
		//using distinct() Method
		List<Integer> Unique=Mergelist.stream().distinct()
				.collect(Collectors.toList());
		System.out.println("Get Unique Elements Both Lists = "+Unique);
		
		// get Unique Elements Both Lists
		//using Set Interface
		
		Set<Integer> UniqueElements=Mergelist.stream()
				.collect(Collectors.toSet());
		System.out.println("get Unique Elements using Set"+UniqueElements);
		
	}

}
