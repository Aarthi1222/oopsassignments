package week3;

public class oddindextouppercase {

	public static void main(String[] args) {
		String test="changeme";
		char[] chars=test.toCharArray();
		for(int i=chars.length-1;i>=0;i--)
		{
			if(i%2!=0){
				chars[i]=Character.toUpperCase(chars[i]);
			}
			
			System.out.println(chars[i]);
			
			
			
		}
		}

	}


