package com.iterator;

import java.util.LinkedList;
import java.util.Queue;

public class Iterator {
    // Constructor
    public Iterator(Integer[][] arr) {
        // Store elements of arrays into Queue
        Queue<Integer> nums = new LinkedList<Integer>();
        // Iterate outer arrays
        for (int i = 0; i < arr.length; i++) {
            // Iterate the elements in the outer arrays
            for (int j = 0; j < arr[i].length; j++){
                // Store elements 
                nums.add(arr[i][j]);
            }
        }
    }   // End of constructor
}
