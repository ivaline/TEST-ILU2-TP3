package ilu2;

public class Welcome {
	
	public static String welcome(String input) {
		
			 if (input.trim() == "")
				 return "Hello, my friend";
		
			 if(input.toUpperCase() == input) {
				 return "HELLO, "+ input + "!";
			 } 
			 
			 
			 StringBuilder names = new StringBuilder();
			 names.append("Hello");
			 for (String name1 : input.split(",")) {
				 name1 = name1.substring(0, 1).toUpperCase()+name1.substring(1);
		         names.append(", "+name1);
		        }
			 return names.toString();
			 
	}
}
