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

	public int size() {
		return singleLinkedList.size();
	}

	public void insertAfter(int position, Object newObj) {
		
	}

	public String get(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
