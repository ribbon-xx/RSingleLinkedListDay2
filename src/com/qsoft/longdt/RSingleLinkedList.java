package com.qsoft.longdt;

import java.util.LinkedList;

public class RSingleLinkedList {

	private LinkedList<Object> singleLinkedList;

	public RSingleLinkedList() {
		super();
		singleLinkedList = new LinkedList<>();
	}

	public RSingleLinkedList(Object[] objArray) {
		singleLinkedList = new LinkedList<>();
		for (Object object : objArray) {
			singleLinkedList.add(object);
		}
	}

	public Object size() {
		return singleLinkedList.size();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
