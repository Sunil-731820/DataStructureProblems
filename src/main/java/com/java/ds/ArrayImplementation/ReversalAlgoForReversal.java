package com.java.ds.ArrayImplementation;

import java.util.Scanner;

class ArrayRotationTowardsLeft{

    public static void LeftRotationOfArray(){
        Scanner sc = new Scanner(System.in);
        int sizeOfArray = sc.nextInt();
        int[] newArrayStorage = new int[sizeOfArray];
        for(int i=0;i<sizeOfArray;i++){
            newArrayStorage[i] = sc.nextInt();
        }
        System.out.println("The New Array is ");
        for(int i=0;i<sizeOfArray;i++){
            System.out.print(newArrayStorage[i]+" ");
        }
        System.out.println("Enter the counter for the left Rotation ");
        int countLeftRotation = sc.nextInt();
        int[] firstnewArray = new int[countLeftRotation];
        int[] secondNewArray = new int[sizeOfArray-countLeftRotation];
        for(int i=0;i<countLeftRotation;i++){
            firstnewArray[i] = newArrayStorage[i];
        }
        System.out.print("the first new array is ");
        for(int i=0;i<firstnewArray.length;i++){
            System.out.print(firstnewArray[i]+" ");
        }
        for(int i=countLeftRotation;i<sizeOfArray;i++){
            secondNewArray[i] = newArrayStorage[i];
        }
        System.out.println("the second new Array is ");
        for(int i=0;i<secondNewArray.length;i++){
            System.out.print(secondNewArray[i]+" ");
        }




    }
}

public class ReversalAlgoForReversal {
    public static void main(String[] args) {
        System.out.println("This is the example of the  left rotattion of the array A/C to user input");
        ArrayRotationTowardsLeft left1 = new ArrayRotationTowardsLeft();
        left1.LeftRotationOfArray();
    }
}
