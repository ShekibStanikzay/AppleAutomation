package increament;

public class StringRev {

	public static void main(String[] args) {
	
	
	
	
	
	
	String name= "Afghanistan";
	char []reverse = new char [name.length()];
	int length = name.length()-1;
	for ( int i=0;i<=length;i++)
		reverse [i]=name.charAt(length-i);
	System.out.println(String.valueOf(reverse));
	
	/*String sr="Tekschool";
	int len=sr.length();
	String rev="";
	for (  int i=len-1;i>=0;i--);

	rev=rev+sr.charAt('i');
	System.out.println(rev);
	*/

	String input="Afghanistan";
	String output="";
	for (int i=input.length()-1; i>=0; i--)
		output=output+ input.charAt(i);
	System.out.println(output);
}
}