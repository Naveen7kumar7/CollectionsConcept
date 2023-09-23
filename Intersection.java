package Collections;

import java.util.Arrays;

public class Intersection {

	public static void main(String[] args) {
		
		int[] firstArray= {1,2,4,6,5,2,1};
		int[] secondArray= {10,20,1,2,5,4,8};
		//get Insect Element and Unique Element
		Arrays.stream(firstArray)
		.filter(x-> Arrays.stream(secondArray).anyMatch(s->s==x)).distinct()
		.forEach(System.out::println);
	}

}
