package com.java.ds.ArrayImplementation;

import java.util.Arrays;
import java.util.Scanner;

class AdditionOfElement{

    public static void addElementAtBeginingOfTheArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int sizeOfArray = sc.nextInt();
        int[] oldArraYForStorage = new int[sizeOfArray];
        for(int i=0;i<sizeOfArray;i++){
            System.out.println("Enter the size of the array ");
            oldArraYForStorage[i] = sc.nextInt();
        }
        System.out.println("The Array of the Data is ");
        for(int i=0;i<sizeOfArray;i++){
            System.out.print(oldArraYForStorage[i]+" ");
        }
        System.out.println("I am going to add Element at the Begining of the array");
        int temp = oldArraYForStorage[0];
        System.out.println("The zeroes Position Element is ");
        System.out.println(temp);
        int[] newArrayForStorage = new int[sizeOfArray+1];

        for(int i=1;i<=sizeOfArray;i++){
            newArrayForStorage[i] = oldArraYForStorage[i];
        }
        
        newArrayForStorage[0] = temp;
        System.out.println("After isertion the array is ");
        for(int i=0;i<=sizeOfArray;i++){
            System.out.print(newArrayForStorage[i]+" ");
        }
    }

    public static int[] insertElementAnywhereInTheArray(int sizeOfArray , int[] oldArrayStorage , int InsertionPosition , int dataToBeInserted){
        int i;
        int[] newArrayForStorage = new int[sizeOfArray+1];
        for (i = 0; i < sizeOfArray + 1; i++) {
            if (i < InsertionPosition - 1)
                newArrayForStorage[i] = oldArrayStorage[i];
            else if (i == InsertionPosition - 1)
                newArrayForStorage[i] = dataToBeInserted;
            else
                newArrayForStorage[i] = oldArrayStorage[i - 1];
        }
        return newArrayForStorage;
        
    }

   

    public static void addElementAtTheInArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int sizeOfArray = sc.nextInt();
        int[] newArray = new int[sizeOfArray];
        for(int i=0;i<sizeOfArray;i++){
            System.out.println("Enter the Element of the array ");
            newArray[i] = sc.nextInt();
        }
        System.out.println("the Element of the Array is ");
        for(int i=0;i<sizeOfArray+1;i++){
            System.out.print(newArray[i]+" ");
        }
    }
}


public class AddingElementInArrayAtBegEndAndMiddle {
    public static void main(String[] args) {
       int sizeOfArray = 10;
       int i;
       int oldArrayStorage[] = {
        1,2,3,4,5,6,7,8,9,10
       };
       System.out.println(Arrays.toString(oldArrayStorage));

       int dataToBeInserted = 5000;
       int InsertionPosition = 2;
       AdditionOfElement add = new AdditionOfElement();
    //    oldArrayStorage = add.insertElementAnywhereInTheArray(sizeOfArray, oldArrayStorage, InsertionPosition, dataToBeInserted);
    //    System.out.println(Arrays.toString(oldArrayStorage));
    add.addElementAtBeginingOfTheArray();

    }
}
