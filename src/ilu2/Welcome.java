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
			 String dernMotSmall = null;//String pour le Hello jusqu'a AND HELLO
			 int motsSmall = 0;//combien des noms sont pour le Hello
			 int motsBig = 0;//combien des noms sont pour le HELLO
			 String dernMotBig = null;// String a partir de AND HELLO
			 for (String name1 : input.split(",")) {
				 name1 = name1.trim();
				 if(name1.toUpperCase() == name1) {
					 nameBig.append(", "+name1.trim()); 
					 motsBig ++;
					 dernMotBig = name1;
				 }
				 else {
				 name1 = name1.substring(0, 1).toUpperCase()+name1.substring(1);
				 nameSmall.append(", "+name1.trim());
				 motsSmall++;
				 dernMotSmall = name1;
				 }
		       }
			 if (motsBig == 0) {
				 nameBig.delete(0, nameBig.length());
			 }
			 else {
				 if (motsBig>1) {
					 int index = nameBig.indexOf(dernMotBig);
					 nameBig.replace(index-2, nameBig.length(), " AND " + dernMotBig);
					 //enlever le "," apres HELLO
					 nameBig.delete(11, 12);
				 }
				 nameBig.append(" !");
			 }
			 
			 if (motsSmall>1) {
				 int index = nameSmall.indexOf(dernMotSmall);
				 nameSmall.replace(index-2, nameSmall.length(), " and " + dernMotSmall);
			 }	 
			 
			 return nameSmall.toString() + nameBig.toString();
	}
}
