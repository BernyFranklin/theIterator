package com.iterator;

/**
 * Implement a 2d iterator class. It will be initialized with
 * an array of arrays, and should implement the following methods:
 * 
 * next():  returns the next element in the array of arrays. 
 *          If there are no more elements, raise an exception
 * hasNext():   returns whether or not the iterator still has elements left
 * 
 * for example, given the input [[1, 2], [3], [], [4, 5, 6]], calling next() 
 * repeatedly output 1, 2, 3, 4, 5, 6
 * 
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Declare a 2d array
        Integer[][] arr = {{1,2}, {3}, {}, {4, 5, 6}};
        // Declare Iterator object
        Iterator list = new Iterator(arr);
        
        while (list.hasNext() == true){
            list.next();
        }
        
        System.out.println( "Hello World!" );
    }
}
