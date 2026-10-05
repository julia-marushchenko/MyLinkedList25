/**
 *  Java program to create and use LinkedList instance.
 */

package com.mycollections;

import java.util.LinkedList;
import java.util.List;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating an instance of LinkedList.
        List<Character> linkedList = new LinkedList<>();

        // Adding elements.
        linkedList.add('d');
        linkedList.add('s');
        linkedList.add('w');
        linkedList.add('q');
        linkedList.add('f');
        linkedList.add('n');
        linkedList.add('m');
        linkedList.add('l');

        // Print.
        System.out.println(linkedList); // Output: [d, s, w, q, f, n, m, l]

        // Delete first and last elements.
        linkedList.removeFirst();
        System.out.println(linkedList); // Output: [s, w, q, f, n, m, l]
        linkedList.removeLast();
        System.out.println(linkedList); // Output: [s, w, q, f, n, m]

        // Get first element.
        System.out.println(linkedList.getFirst()); // Output: s

        // Get last element.
        System.out.println(linkedList.getLast()); // Output: m

        // Clear.
        linkedList.clear();
    }
}