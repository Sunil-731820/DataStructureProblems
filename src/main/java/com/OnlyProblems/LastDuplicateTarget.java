package com.OnlyProblems;

public class LastDuplicateTarget {

    public static void lastTargetDuplicate(int arr[], int x){
        int n = arr.length;
        int lastTarget = -1;
        for(int i=0;i<n;i++){
            if(x!=arr[i]){
                continue;
            }
            if(lastTarget==-1){
                lastTarget = i;
            }
            lastTarget = i;
        }

        if(lastTarget !=-1){
            System.out.println("the Last Occurence Of The Duplicate is "+ lastTarget);
        }
        else{
            System.out.println("Not Found");
        }

    }
    public static void main(String[] args) {
        System.out.println("this is the Example Of the Last target Duplicate Element");
        int arr[] = {1,2,2,2,2,3,4,7};
        int x = 8;
        lastTargetDuplicate(arr, x);
    }
}
