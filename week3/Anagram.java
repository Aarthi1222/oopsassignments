package week3;

public class Anagram {

	public static void main(String[] args) {
		String word="chance";
		String word1="enhacc";
		
		int length=word.length();
		int length1=word1.length();
System.out.println(length);
System.out.println(length1);

  if(length==length1)
{
	System.out.println("word is same");
}
else {
	System.out.println("word is Mismatch");
}
	char[] charArray = word.toCharArray();
	//System.out.println(charArray);
	for (int i = 0; i < charArray.length; i++) {
		System.out.println(charArray[i]);
	}
	
	char[] chararray=word1.toCharArray();
	for( int i=0;i< chararray.length;i++)
	{
		System.out.println(chararray[i]);
		
	}
	boolean equals = word.equals(word1);
	System.out.println(equals);
	
	if(word.length()==word1.length()) {
		System.out.println("anagram");
	}
	else {
		System.out.println("it is not anagram");
	}
	
	}
	}

