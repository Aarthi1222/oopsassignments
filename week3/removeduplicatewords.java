package week3;

import java.util.Arrays;

public class removeduplicatewords {

	public static void main(String[] args) {
		String text="we learn java basics as part of java sessions in java week1";
		int count=0;
				String[] words=text.split(" ");
				System.out.println(words[0]);
				System.out.println(words[1]);
				System.out.println(words[2]);
				System.out.println(words[3]);
				System.out.println(words[4]);
				System.out.println(words[5]);
				System.out.println(words[6]);
				System.out.println(words[7]);
				System.out.println(words[8]);
				System.out.println(words[9]);
				System.out.println(words[10]);
				System.out.println(words[11]);
		
		for(int i=0;i<words.length;i++) {
			if(!words[i].equals(" ")) {
			for(int j=0;j<words.length;j++){
				if(words[i].equals(words[j])) {
			
		
					words[7]=" ";
					
					words[10]=" ";
               
			}
				
				count++;
			}
			}
		}
	 if (count > 0) {
         System.out.println("Modified words array: " + Arrays.toString(words));
     } else {
         System.out.println("No duplicate words found.");
     }

	}
}


