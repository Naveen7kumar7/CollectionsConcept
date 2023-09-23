package Collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindNumbersStartsWith1 {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(10,20,13,48,22,2,19,15,50,11,10);
		//Get Numbers Starts with 1
		List<String> Findfirst=list.stream().map(s->s+"")
				.filter(x->x.startsWith("1"))
		        .collect(Collectors.toList());
		System.out.println("Find Numbers starts with 1="+Findfirst);
		
		
		
	}

}
