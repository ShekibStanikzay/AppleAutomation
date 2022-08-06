package string;

public class StringConcepts {

	public static void main(java.lang.String[] args) {
		

		String name="AHMAD";
		String name1="mohammad";
		System.out.println(name);
		System.out.println(name1);
		System.out.println(name.toLowerCase());
		System.out.println(name1.toUpperCase());
		System.out.println(name.concat(name1));
		System.out.println(name.charAt(4));
		System.out.println(name.length());
		System.out.println(name.replace('H', 'A'));/// we can replace one word by this method
		System.out.println(name1.replaceAll("Moa", "K"));
		String name2="ahmad";
		System.out.println(name2.equals(name));// here check if the both names are the same. if both r capital letter it will show true if not it will show fall as boolean
		System.out.println(name.equalsIgnoreCase(name2)); // is show if the the two names or texts r the same, does not matter if it's capital or not
	}

}
