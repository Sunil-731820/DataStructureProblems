package com.java.ds.Array.LeetCodeOfArray;

import java.util.Scanner;

public class BestTimeToBuyAndSellStocks {
	
	static int bestTimeToBuyAndSellTheStocks(int size , int[] prices) {
		int buyers = prices[0];
		int maximumProfit = 0;
		for(int i=0;i<size;i++) {
//			CHeckig The Lower Buy
			if(buyers>prices[i]) {
				buyers = prices[i];
			}
//			CHecking The Higher Buy
			else if(prices[i]-buyers >maximumProfit) {
				maximumProfit = prices[i]-buyers;
			}
		}
		
		return maximumProfit;
	}
	public static void main(String[] args) {
		System.out.println("This is The Example Of The Best time To Buy and Sell The Stocks ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of The Array ");
		int size = sc.nextInt();
		int[] prices = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter The Element in The prices Array");
			prices[i] = sc.nextInt();
		}
		System.out.println("The Prices Array is ");
		for(int j=0;j<size;j++) {
			System.out.println(prices[j]);
		}
		
		int maxProfit = bestTimeToBuyAndSellTheStocks(size, prices);
		System.out.println("The Maximum profit is   "+ maxProfit);
	}

}
