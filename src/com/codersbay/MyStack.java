package com.codersbay;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
    private final List<Integer> numbers = new ArrayList<>();

    public void myFillList() {
        for (int i = 0; i < 40; i++) {
            numbers.add(i + 1); // List does not fill like an array; this syntax is required
        }
    }

    public Integer[] myListPrint() {
        /*int [] temp = new int[numbers.size()-1];
        for (int i = 0; i < temp.length; i++){
            temp[i] = numbers.get(i);
        }*/ //==> does the same thing as below
        return numbers.toArray(new Integer[0]); // data type of method must be equal to data type of List
    }

    public int mySize() {
        // return the number of elements in the stack
        return numbers.size();
    }

    public void myAdd(int element) {
        // add a new element to the stack
        numbers.add(element);
        //numbers.set(numbers.size()-1, element);
    }

    public int myPop() throws StackTooSmallException {
        // return and remove the uppermost element

        if (numbers.isEmpty()) {
            throw new StackTooSmallException("Stack Too Small - Cannot perform POP");
        } else {
            return numbers.remove(numbers.size() - 1);
        }
    }

    public int myPeek() throws StackTooSmallException {
        // return the uppermost element
        if (numbers.isEmpty()) {
            throw new StackTooSmallException("Stack Too Small - Cannot perform PEEK");
        } else {
            return numbers.get(numbers.size() - 1);
        }
    }

    public int[] myMultiplePop(int param) throws StackTooSmallException {
        int[] temp = new int[param - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = myPop();
        }
        return temp;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }


}
