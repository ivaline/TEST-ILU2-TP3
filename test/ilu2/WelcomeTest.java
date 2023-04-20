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


}
