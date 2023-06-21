package com.java.ds.Modifier;

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
