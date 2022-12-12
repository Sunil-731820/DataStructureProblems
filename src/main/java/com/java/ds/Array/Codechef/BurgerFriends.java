package com.java.ds.Array.Codechef;

import java.util.Scanner;

public class BurgerFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
		    int friends = sc.nextInt();
		    int burger = sc.nextInt();
		    int totalMoney = sc.nextInt();
		    int burgerCost = friends*burger;
		    if(burgerCost<=totalMoney){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}
    }
}
