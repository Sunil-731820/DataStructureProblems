package com.OnlyProblems;

public class FindFirstAndLastTarget {

    public static void findFirstAndLastTarget(int[] nums,int x){
        int n = nums.length;
        int firstTarget = -1;
        int lastTarget = -1;

        for(int i=0;i<n;i++){
            if(x!=nums[i]){
                continue;
            }
            if(firstTarget==-1){
                firstTarget = i;
            }
            else{
                lastTarget = i;
            }
        }

        if(firstTarget!=-1){
            System.out.println("The First Occurence = "+ firstTarget);
            System.out.println("The Last target is = "+ lastTarget);
        }else{
            System.out.println("Not Found in the Array Of The Nums");
        }
        

    }
    public static void main(String[] args) {
        System.out.println("The First & Last target Element is");
        int nums[] = { 1, 2, 2, 2, 2, 3, 4, 7, 8, 8};
        int x = 8;
        findFirstAndLastTarget(nums, 0);
    }
}
