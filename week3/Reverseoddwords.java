package week3;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Reverseoddwords {

	public static void main(String[] args) {
		String string = "i am a software tester";
		
		String[] split = string.split(" ");
		System.out.println(split[0]);
		System.out.println(split[1]);
		System.out.println(split[2]);
		System.out.println(split[3]);
		System.out.println(split[4]);
		
		char[] charArray = string.toCharArray();
		
		 System.out.println(charArray[0]);
		 for(int i=0;i<string.length()-21;i++)
		 {
		 
		 System.out.println(charArray[i]);
		System.out.println(string.replaceAll("software", "ostwfare"));
		 }
		 
		for(int i=0;i<string.length();i++)
		{
			System.out.println(charArray[i]);
			if(i%2==0) {
				System.out.println("it is even index"+charArray[i]);
				System.out.println(" ");
			}
			else
			{
				System.out.println("it is odd index" +charArray[i]);
				System.out.println(" ");
			}
			}
		
		}
		
	}

	


