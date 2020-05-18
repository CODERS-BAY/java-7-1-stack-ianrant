package com.codersbay;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws StackTooSmallException {

        MyStack firstStack = new MyStack();

        // NOTES TO SELF:
        // MyStack automatically scales up, indexing from 0, new element is added on top and is the new index 0

        // STACK FUNCTIONS:
        // PUSH() or ADD() adds a new element on top of the stack (new index 0, uppermost position)
        // POP() returns AND removes the last/uppermost element
        // PEEK() returns the value of the last/uppermost element
        // SIZE() returns the number of elements in the stack
        // EMPTY() determines if there are any elements in the stack, returns true/false
        // GET(index) gets the value of the index in the parameter
        // SET(index, "value") sets the index in the parameter with the value
        // SEARCH(param) searches the stack for the value in the parameter; returns index of value OR "-1"
        // CONTAINS(param) determines if the value in the parameter is in the stack, returns true/false

        firstStack.myFillList();

        System.out.println(Arrays.toString(firstStack.myListPrint()));
        System.out.println();

        System.out.println(firstStack.getNumbers());
        System.out.println();

        System.out.println(firstStack.mySize());
        System.out.println();

        firstStack.myAdd(3);
        System.out.println(firstStack.mySize());
        System.out.println(firstStack.getNumbers());
        System.out.println();

        firstStack.myPop();
        System.out.println(firstStack.mySize());
        System.out.println(firstStack.getNumbers());
        System.out.println();

        firstStack.myAdd(7);
        System.out.println(firstStack.mySize());
        System.out.println(firstStack.getNumbers());
        System.out.println();

        firstStack.myAdd(7);
        System.out.println(firstStack.mySize());
        System.out.println(firstStack.getNumbers());
        System.out.println();

        firstStack.myPeek();
        System.out.println(firstStack.mySize());
        System.out.println(firstStack.getNumbers());
        System.out.println();

        try {
            firstStack.myMultiplePop(50);
        } catch (StackTooSmallException e) {
            e.printStackTrace();
        }

        System.out.println(firstStack.mySize());
        System.out.println(firstStack.getNumbers());
        System.out.println();

        firstStack.myPeek();
        System.out.println(firstStack.mySize());
        System.out.println(firstStack.getNumbers());
        System.out.println();







        /*for (int k: firstStack.myListPrint()){
            System.out.println(k+" ");
        }/*



         */

        /*

        System.out.println(firstStack.mySize());
        firstStack.myAdd(3);
        System.out.println(firstStack.myListPrint());

        System.out.println(firstStack.myListPrint());

        System.out.println(firstStack.myListPrint());

        System.out.println(firstStack.myListPrint());
        */


        /*for (int i = 0; i <30; i++){
            numbers.push(i);
        }

        for (int value:numbers){
            System.out.printf("%02d ", value);
        }
        System.out.println();
        System.out.println();

        System.out.println(numbers);
        System.out.println(numbers.pop());

        System.out.println(numbers);
        System.out.println(numbers.push());*/



    /*
        //testing an idea
        int size1 = numbers.size(); // allocating the size of the stack to a variable
        int size2 = numbers.size();

        /*for (int i = 0; i < size1; i++){ // for loop to iterate "size" times
            int temp = numbers.peek(); // allocating the value returned by peek() to a variable
            System.out.println(temp); // printing the value
            numbers.pop(); // removing the previously returned/printed value from the stack
        }
        System.out.println();

        //int size2 = numbers.size(); // allocating the size of the stack to a variable
        for (int i = 0; i < size2; i++){ // for loop to iterate "size" times
            System.out.println(numbers.pop()); // printing the value
            ; // removing the previously returned/printed value from the stack
        }*/

    }
}
