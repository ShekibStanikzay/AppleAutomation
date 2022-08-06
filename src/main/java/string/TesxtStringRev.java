package string;

public class TesxtStringRev {

	public static void main(String[] args) {
	String name="Hello i am Khan";
	String [] words=name.split(" ");
	String wordsrev="";
	System.out.println(words.length);
	for ( int j=0;j<words.length;j++)
	{
		String word=words[j];
		String rev="";
		for (int i=word.length()-1;i>=0;i--)
		{
		rev=rev+word.charAt(i);
		}
	wordsrev=wordsrev+rev+" ";
	}
	System.out.println(wordsrev);

}
	

	}


