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
	void helloTwoPeople() {
		assertEquals(Welcome.welcome("amy,bob"), "Hello, Amy, Bob");
		assertNotEquals(Welcome.welcome("Amy,Bob"), "Hello, Amy");
		assertEquals(Welcome.welcome("Amy,Bob"), "Hello, Amy, Bob");
	}
	
	@Test
	void helloCrowd() {
		assertEquals(Welcome.welcome("Amy,bob,jerry"), "Hello, Amy, Bob, Jerry");
		assertNotEquals(Welcome.welcome("Amy,Bob,Jerry"), "Hello, Amy");
	}
	
	@Test
	void helloRandomCrowd() {
		assertEquals(Welcome.welcome("Amy, BOB, Jerry"),"Hello, Amy, Jerry. AND HELLO, BOB!");
		assertNotEquals(Welcome.welcome("Amy,bob,jerry"),"Hello, Amy, Jerry. AND HELLO, BOB!");
	}


}
