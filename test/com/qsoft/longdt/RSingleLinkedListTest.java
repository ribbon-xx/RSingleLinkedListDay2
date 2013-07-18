package com.qsoft.longdt;

import org.junit.Test;

import junit.framework.TestCase;

public class RSingleLinkedListTest extends TestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	@Test
	public void testInitNewEmptySingleLinkedList() {
		RSingleLinkedList rSLL = new RSingleLinkedList();
		assertEquals(0, rSLL.size());
	}
}
