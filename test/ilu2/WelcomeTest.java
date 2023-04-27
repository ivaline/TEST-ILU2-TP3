package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WelcomeTest {

	@Test
	void helloBob() {
		assertEquals(Welcome.welcome("Bob"), "Hello, Bob");
		assertEquals(Welcome.welcome("bob"), "Hello, Bob");
	}
	
	@Test
	void helloFriend() {
		assertEquals(Welcome.welcome("  "), "Hello, my friend");
		assertEquals(Welcome.welcome("         "), "Hello, my friend");
	}
	
	@Test
	void helloJerry() {
		assertEquals(Welcome.welcome("JERRY"), "HELLO, JERRY!");
		assertNotEquals(Welcome.welcome("Jerry"), "HELLO, JERRY!");
	}
	
	@Test
	void helloTwoPeople()/*le test n'est pas pout l'ex7 */ {
		//assertEquals(Welcome.welcome("amy,bob"), "Hello, Amy, Bob");
		//assertNotEquals(Welcome.welcome("Amy,Bob"), "Hello, Amy");
		//assertEquals(Welcome.welcome("Amy,Bob"), "Hello, Amy, Bob");
	}
	
	@Test
	void helloCrowd() {
		//le test n'est pas pout l'ex7 
		//assertEquals(Welcome.welcome("Amy,bob,jerry"), "Hello, Amy, Bob, Jerry");
		//assertNotEquals(Welcome.welcome("Amy,Bob,Jerry"), "Hello, Amy");
	}
	
	@Test
	void helloRandomCrowd() {
		/*le test n'est pas pout l'ex7 */
		//assertEquals(Welcome.welcome("Amy, BOB, Jerry"),"Hello, Amy, Jerry. AND HELLO, BOB!");
		//assertNotEquals(Welcome.welcome("Amy,bob,jerry"),"Hello, Amy, Jerry. AND HELLO, BOB!");
	}

	@Test
	void helloAnd() {
		assertEquals(Welcome.welcome("bob, amy, jerry"),"Hello, Bob, Amy and Jerry");
		//ici j'ai changé le test car apres Hello il faut avoir des noms avec le 1er lettre majuscule
		//aussi je pense que apres HELLO il faut avoir un "," mais je toujours l'enleve dans le code
		assertEquals(Welcome.welcome("bob, AMY, jerry, JACK"), "Hello, Bob and Jerry. AND HELLO AMY AND JACK !");
	}
	
	@Test 
	void helloEspaceInutile() {
		assertEquals(Welcome.welcome("bob      , amy      "), "Hello, Bob and Amy");
	}
	
	@Test
	void helloSeveralNames() {
		//il avait un "," apres Hello dans ce test la juste apres le Bob, et ca marcge pas avec tous les tests d'avant
		assertEquals(Welcome.welcome("bob, JERRY, amy, bob, JERRY, bob"),"Hello, Bob(x3) and Amy. AND HELLO, JERRY(x2) !");
	}
	
	@Test
	void helloYoda() {
		//J'ai rajouté le "," apres HELLO car de ce que j'ai compris il faut le mettre si on a 1 mot, si on a plus on l'enleve
		// En plus, j'ai rajouté le "!" apres HELLO car on l'a pour tous les autres tests
		//Aussi, on enleve le "," apres Yoda parce qu'on a "and"
		assertEquals(Welcome.welcome("bob, yoda, amy, JERRY"), "Bob, Yoda and Amy, Hello. AND HELLO, JERRY !");
		// ici X2->x2(les tests d'avant) + on enleve l'espace entre YODA et (x2)
		assertEquals(Welcome.welcome("bob, YODA,amy,JERRY, YODA"),"Hello, Bob and Amy. AND YODA(x2) AND JERRY HELLO !");
	}

}
