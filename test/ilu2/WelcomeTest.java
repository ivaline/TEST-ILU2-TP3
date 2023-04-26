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

}
