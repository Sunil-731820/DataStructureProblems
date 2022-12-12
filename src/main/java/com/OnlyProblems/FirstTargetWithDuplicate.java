package com.OnlyProblems;

public class FirstTargetWithDuplicate {

    public static void findFirstAndLast(int arr[],int x){
        int n = arr.length;
        int first = -1;
        int last = -1;
        for(int i=0;i<n;i++){
            if(x !=arr[i]){
                continue;
            }
            if(first==-1){
                first = i;
            }else{
                last = i;
            }
        }

        if(first !=-1){
            System.out.println("The First Occurence ="+ first);
            System.out.println("The Last Occurence is = "+ last);
        }
        else{
            System.out.println("Not Found");
        }
    }

    public static void main(String[] args) {
        System.out.println("Finding the First Target With Duplicate Values");
        int arr[] = {1,2,2,2,2,3,4,7,8};
        int x = 8;
        findFirstAndLast(arr, x);
    }
}
