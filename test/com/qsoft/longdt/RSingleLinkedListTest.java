package com.qsoft.longdt;

import org.junit.Test;

import junit.framework.TestCase;

public class RSingleLinkedListTest extends TestCase {

	private String[] strArray;

	private String newStr;
	
	private String nodeToDel;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		strArray = new String[5];
		for (int i = 0; i < 5; i++) {
			strArray[i] = "String " + i;
		}
		newStr = "New Strings With Random Position Per Test";
		
		nodeToDel = "String 1";
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

	@Test
	public void testInsertNewObjectAfterNodeN() {
		RSingleLinkedList rSLL = new RSingleLinkedList(strArray);
		rSLL.insertAfter(2, newStr);
		assertEquals(6, rSLL.size());
		assertEquals(newStr, rSLL.get(3));
	}

}
