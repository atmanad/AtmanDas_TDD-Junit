package com.atman.task_tdd_junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveCharTest {
	
	RemoveChar removechar;

	@BeforeEach
	void setUp() {
		removechar = new RemoveChar();
	}
	
	@Test
	void testRemove1() {
		assertEquals("CD",removechar.remove("AACD"));
	}
	
	@Test
	void testRemove2() {
		assertEquals("BCD",removechar.remove("BACD"));
	}
	
	@Test
	void testRemove3() {
		assertEquals("",removechar.remove(""));
	}
	@Test
	void testRemove4() {
		assertEquals("BCD",removechar.remove("ABCD"));
	}
	
	@Test
	void testRemove5() {
		assertEquals("",removechar.remove("A"));
	}
	
	@Test
	void testRemove6() {
		assertEquals("B",removechar.remove("B"));
	}
	
	@Test
	void testRemove7() {
		assertEquals("",removechar.remove("AA"));
	}
	
	@Test
	void testRemove8() {
		assertEquals("B",removechar.remove("BA"));
	}
	
	@Test
	void testRemove9() {
		assertEquals("B",removechar.remove("AB"));
	}
	
	@Test
	void testRemove10() {
		assertEquals("BC",removechar.remove("BC"));
	}
	
	@Test
	void testRemove11() {
		assertEquals("BAA",removechar.remove("AABAA"));
	}
	
	@Test
	void testRemove12() {
		assertEquals("BBAA",removechar.remove("BBAA"));
	}
	

}
