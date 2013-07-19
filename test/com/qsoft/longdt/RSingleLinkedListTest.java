package com.qsoft.longdt;

import org.junit.Test;

import junit.framework.TestCase;

public class RSingleLinkedListTest extends TestCase {

	private String[] strArray;

	private String newStr;

	private String nodeToDel;

	private String nodeFirst;

	private String nodeLast;

	private String nodeAnchor;

	private String nodeBeforeAnchor;

	private String nodeAfterAnchor;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		strArray = new String[5];
		for (int i = 0; i < 5; i++) {
			strArray[i] = "String " + i;
		}
		newStr = "New Strings With Random Position Per Test";

		nodeToDel = "String 1";

		nodeFirst = "String 0";

		nodeLast = "String 4";

		nodeAnchor = "String 2";

		nodeBeforeAnchor = "String 1";

		nodeAfterAnchor = "String 3";
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

	@Test
	public void testDeleteANodeInList() {
		RSingleLinkedList rSLL = new RSingleLinkedList(strArray);
		rSLL.delete(nodeToDel);
		assertEquals(4, rSLL.size());
	}

	@Test
	public void testGetFirstObjectFromList() {
		RSingleLinkedList rSLL = new RSingleLinkedList(strArray);
		Object firstElement = rSLL.first();
		assertEquals(nodeFirst, firstElement);
	}

	@Test
	public void testGetLastObjectFromList() {
		RSingleLinkedList rSLL = new RSingleLinkedList(strArray);
		Object lastElement = rSLL.last();
		assertEquals(nodeLast, lastElement);
	}

	@Test
	public void testGetObjectBeforeAnother() {
		RSingleLinkedList rSLL = new RSingleLinkedList(strArray);
		Object elementBeforeNodeAnchor = rSLL.before(nodeAnchor);
		assertEquals(nodeBeforeAnchor, elementBeforeNodeAnchor);
	}

	@Test
	public void testGetObjectAfterAnother() {
		RSingleLinkedList rSLL = new RSingleLinkedList(strArray);
		Object elementAfterNodeAnchor = rSLL.after(nodeAnchor);
		assertEquals(nodeAfterAnchor, elementAfterNodeAnchor);
	}

}
