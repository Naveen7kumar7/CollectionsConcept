package Collections;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {
		
		String str="@#$j!a&v*()^a";
		
		String print=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(print);

		//Find 3rd Highest salary
		//SELECT * FROM emp ORDER BY salary DESC LIMIT 2,1;
	}

}
