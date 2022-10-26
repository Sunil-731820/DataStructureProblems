package com.java.ds.StreamInJava.Stream25.TerminalOperations;

import java.util.Arrays;
import java.util.stream.Stream;

public class UseOfToArray {
    public static void main(String[] args) {
        /*
         * Stream toArray() returns an array containing the elements of this stream. It
         * is a terminal operation i.e, it may traverse the stream to produce a result
         * or a side-effect. After the terminal operation is performed, the stream
         * pipeline is considered consumed, and can no longer be used.
         */

         Stream<Integer> stream = Stream.of(1,2,3,4,5,6);
        System.out.println("The Stream is");
        System.out.println(stream.toString());
        //  Convert this Stream to Array Object
        Object[] arr = stream.toArray();
        System.out.println("The Array Object is ");
        System.out.println(Arrays.toString(arr));
        


    }
    
}
