package com.java.ds.Modifier;

/*
 * So If You are Declaring The Any private Variable Without getter and Setter values In A Seprate Class Then
 * You can Not access Across That Entire CLass For THis You have To Create The getter and Setter values of The 
 * Given private variable SO that You can Access Across The Entire CLass But You Are Calling Any method Here From The Given Seprate CLass Like A Then After 
 * Creation of The object of That particular Class Then You can Not Called That Above Given private Method in java   
 */
class A {
	private int data = 40;
	
	private void getMessage() {
		System.out.println("I am Calling the getMessage() from Class A ");
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
}
public class UseOfPrivateModifier {
	
	public static void main(String[] args) {
		System.out.println("This is tHe Exmaple of The private ");
		A a = new A();
		System.out.println("The Data is  : "+ a.getData());
		a.getMessage();
	}

}
