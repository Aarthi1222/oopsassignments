package week3;

public class wordtonum {

	public static void main(String[] args) {
		String s="Hello World";
		
		System.out.println(s.length());
		
		String[] split=s.split(" ");
		System.out.println(split[1]);
		
		int length=split[1].length();
		System.out.println(length);
		
		String s1="fly me to the moon";
		System.out.println(s1);
		
		System.out.println(s1.length());
		
		String[] split10=s1.split("the ");
		System.out.println(split10[1]);
		
		int length1=split10[1].length();
		System.out.println(length1);
		
		String    s2="luffy is still joyboy";
System.out.println(s2);
		
		System.out.println(s2.length());
		
		String[] split11=s2.split("still ");
		System.out.println(split11[1]);
		
		int length2=split11[1].length();
		System.out.println(length2);
		
		

		
	}

}
