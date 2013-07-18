package com.qsoft.longdt;

import org.junit.Test;

import junit.framework.TestCase;

public class RSingleLinkedListTest extends TestCase {

	private String[] strArray;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		strArray = new String[5];
		for (int i = 0; i < 5; i++) {
			strArray[i] = "String " + i;
		}
	}

	@Test
	public void testInitNewEmptySingleLinkedList() {
		RSingleLinkedList rSLL = new RSingleLinkedList();
		assertEquals(0, rSLL.size());
	}

	@Test
	public void testInitNewSingleLinkedListWithObjectArray() {
		RSingleLinkedList rSLL = new RSingleLinkedList(strArray);
		assertEquals(5, rSLL.size());
	}
}
