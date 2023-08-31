package com.java.ds;

public class Application
{

	public static void main( String[] args )
	{
		String[] str = {};
		String str11[] = {};
		if(str.equals(str11)) {
			System.out.println("Same Array");
		}else {
			System.out.println("different Array ");
		}
		StringBuffer str1 = new StringBuffer("");
		StringBuffer str2 = null;
		System.out.println("str1 is :"+str1);
		System.out.println("str2 is :"+str2);
		if(str1==str2) {
			System.out.println("Same");
		}else {
			System.out.println("Different");
		}
		String str21 ="";
		str21 =" sunil";
		System.out.println(str21);
		System.out.println("hello");
	}
}