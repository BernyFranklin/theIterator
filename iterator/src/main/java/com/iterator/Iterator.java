package com.iterator;

import java.util.LinkedList;
import java.util.Queue;

public class Iterator {
    Queue<Integer> nums = new LinkedList<Integer>();
    // Constructor
    public Iterator(Integer[][] arr) {
        // Iterate outer arrays
        for (int i = 0; i < arr.length; i++) {
            // Iterate the elements in the outer arrays
            for (int j = 0; j < arr[i].length; j++){
                // Store elements 
                nums.add(arr[i][j]);
            }
        }
    }   // End of constructor

    // Print function
    public void printObject() {
        System.out.printf("\nElements to be output: ");
        for (int elem: nums) {
            System.out.printf("\t%d", elem);
        }
        System.out.println();
    }

    // Next function from prompt
    public void next() {
        if (!hasNext()) {
            System.out.printf("\nThere are no more elements in the list");
        }
        else {
            System.out.printf("\n%d", nums.peek());
            nums.remove();
        }
    }

    // hasNext function from prompt
    public Boolean hasNext(){
        Boolean hasNext = true;
        if (nums.peek() == null) {
            hasNext = false;
        }
        return hasNext;
    }
}
