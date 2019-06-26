package com.covalense.javaapp.example;

public class MyArrayClass {

	private Object[] myArray;
	private Object[] myArray1;
	private int index;

	public MyArrayClass() {
		myArray = new Object[10];
	}

	public MyArrayClass(int size) {
		if (size <= 0) {
			throw new ArrayIndexOutOfBoundsException("size should be greater then zero ");
		}
		myArray = new Object[size];
		index = 0;
	}

	public void add(Object val) {
		if (index >= myArray.length) {
			Object[] myArray1 = new Object[myArray.length * 2];

			System.arraycopy(myArray, 0, myArray1, 0, myArray.length);
			myArray = myArray1;
		}
		myArray[index] = val;
		index++;
	}

	public int size() {
		return index - 1;
	}

	public Object get(int index) {
		return myArray[index];
	}

	public void remove(int index) {

		if (index >= myArray.length) {
			throw new ArrayIndexOutOfBoundsException("array out of bound ");
		} else {
			System.arraycopy(myArray, index + 1, myArray, index, (myArray.length - 1) - index);
			myArray[myArray.length - 1] = null;
		}
	}
}

//myArray[position]=null;