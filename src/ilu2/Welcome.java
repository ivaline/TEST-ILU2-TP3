package ilu2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

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
			 List<String> tableauNames = new ArrayList<>();
			 List<Integer> countingNames = new ArrayList<>();
			 for (String name1 : input.split(",")) {
				 name1 = name1.trim();
				 if (tableauNames.contains(name1)) {
					 int i = 0;
					 for(String aName: tableauNames) {
						 if (Objects.equals(name1, aName)) {
							 countingNames.set(i,countingNames.get(i)+1);
							}
						 i++;
					 }
				 }
				 else {
					 tableauNames.add(name1.trim());
					 countingNames.add(1);
				 }
			 }
			int iName = 0;		 
			for (String name2: tableauNames) {
				 if(name2.toUpperCase() == name2) {
					 if (countingNames.get(iName)>1) {
						 name2 = name2+"(x" + countingNames.get(iName)+")";
					 }
					 nameBig.append(", "+name2); 
					 motsBig ++;
					 dernMotBig = name2;
					 }
				else {
					name2 = name2.substring(0, 1).toUpperCase()+name2.substring(1);
					if (countingNames.get(iName)>1) {
						 name2 = name2+"(x" + countingNames.get(iName)+")";
					 }
					nameSmall.append(", "+name2);
					motsSmall++;
					dernMotSmall = name2;
						 }
				 iName++;
					 }
		
			 /*j'ai fait cette ligne de code parce que dans les premieres test il 
			 ne faudrait avoir "AND HELLO"*/
			 if (motsBig == 0) {
				 nameBig.delete(0, nameBig.length());
			 }
			 else {
				 if (motsBig>1) {
					 int index = nameBig.indexOf(dernMotBig);
					 nameBig.replace(index-2, nameBig.length(), " AND " + dernMotBig);
					 //enlever le "," apres HELLO si on a plus que 1 nom
					 nameBig.delete(11, 12); 
				 }
				 int indexYODA = nameBig.indexOf("YODA");
				 if(indexYODA!=-1) {
					 nameBig.delete(5,11);
					 nameBig.append(" HELLO");
					 }
				 nameBig.append(" !");
			 }
			 
			 if (motsSmall>1) {
				 int index = nameSmall.indexOf(dernMotSmall);
				 nameSmall.replace(index-2, nameSmall.length(), " and " + dernMotSmall);
			 }	 
			 int indexYoda = nameSmall.indexOf("Yoda");
			 if(indexYoda!=-1) {
				 nameSmall.delete(0,7);
				 nameSmall.append(", Hello");
			 }
			 
			 return nameSmall.toString() + nameBig.toString();
	}
}
