package Collections;

public class Optional {

	public static void main(String[] args) {
		
		String str=null;
		
		java.util.Optional<String> optional=java.util.Optional.ofNullable(str);
		System.out.println("Optional is present"+ optional.orElse("DataException"));
		
		if(optional.isPresent()) {
			System.out.println("Optional is present"+ optional.get());
		}else {
			System.out.println("Optional is not present");
		}

	}

}