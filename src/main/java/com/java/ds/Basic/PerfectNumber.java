package com.java.ds.Basic;

import java.util.Scanner;

public class PerfectNumber {

    public static void getNumber(){
        // Scanner sc = new Scanner(System.in);
        // int range  = sc.nextInt();
        int i =1;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the valid Number");
            int givenNumber1 = sc.nextInt();
            int sum1 = 0;
            // int k=1;
            if(givenNumber1>10 && givenNumber1<100){
                for (i = 1; i < givenNumber1; i++) {
                    if (givenNumber1 % i == 0) {
                        sum1 = sum1 + i;
                    }
                }
                if (sum1 == givenNumber1) {
                    System.out.format("\n% d is a Perfect Number", givenNumber1);
                    System.out.println("The Given Number By the USer is Perfect okay");
                    break;
                } else {
                    System.out.format("\n% d is NOT a Perfect Number", givenNumber1);
                    System.out.println("Entered Number by  the USer is not perfect Number");
                }
            }
        } while (i!=0);
    }

    public static void getOtherPerfectNumber() {
        int range;
        System.out.println("Enter the Raneg of the Number here");
        Scanner sc = new Scanner(System.in);
        range = sc.nextInt();
        // int saveNumber = range;
        do {
            System.out.println("Enter the valid number between 10 and 100");
            int givenNumber = sc.nextInt();
            int saveNumber2 = givenNumber;
            int j = 1;
            int sum1 = 0;
            while (givenNumber != 0) {
                if (givenNumber % j == 0) {
                    sum1 += j;
                }
                givenNumber = givenNumber / j;
                j++;
            }
            if (saveNumber2 == sum1) {
                System.out.println("The Number is Perfect Number");
            } else {
                System.out.println("The Given Number is not perfects");
            }

        } while (range > 10 && range < 100);

    }
    public static void main(String[] args) {
        getNumber();
        // getOtherPerfectNumber();
        // int num1 = 6;
        // int i =1;
        // int saveNum1 = num1;
        // int sum = 0;
        // while(num1!=0){
        //     if(num1%i==0){
        //         sum = sum+i;
        //     }
        //     num1 = num1/i;
        //     i++;
        // }
        // if(saveNum1==sum){
        //     System.out.println("perfect Number");
        // }else{
        //     System.out.println("not");
        // }
    }
}
