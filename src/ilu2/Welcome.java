package ilu2;

public class Welcome {
	
	public static String welcome(String input) {
		
			 if (input.trim() == "")
				 return "Hello, my friend";
		
			 if(input.toUpperCase() == input) {
				 return "HELLO, "+ input + "!";
			 } 
			 
			 
			 StringBuilder nameSmall = new StringBuilder();
			 StringBuilder nameBig = new StringBuilder();
			 nameSmall.append("Hello");
			 nameBig.append(". AND HELLO");
			 for (String name1 : input.split(",")) {
				 if(name1.toUpperCase() == name1) {
					 nameBig.append(", "+name1.trim());
				 }
				 else {
				 name1 = name1.substring(0, 1).toUpperCase()+name1.substring(1);
				 nameSmall.append(", "+name1.trim());
				 }
		       }
			 if (nameBig.toString().equals(". AND HELLO")) {
				 nameBig.delete(0, nameBig.length());
			 }
			 else
				 nameBig.append("!");
			 
			 return nameSmall.toString() + nameBig.toString();
			 
	}
}
