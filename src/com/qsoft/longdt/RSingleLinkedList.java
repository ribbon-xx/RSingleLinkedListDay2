package com.qsoft.longdt;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
		List<Object> tempList1 = new ArrayList<Object>();
		tempList1.addAll(singleLinkedList.subList(0, position + 1));
		List<Object> tempList2 = new ArrayList<Object>();
		tempList2.addAll(singleLinkedList.subList(position + 1, size()));
		tempList1.add(newObj);
		singleLinkedList.clear();
		singleLinkedList.addAll(tempList1);
		singleLinkedList.addAll(tempList2);
	}

	public Object get(int i) {
		return singleLinkedList.get(i);
	}

	public void delete(Object nodeToDel) {
		singleLinkedList.remove(nodeToDel);
	}

}
