package com.java.ds.Modifier;

class D{
	protected void getMsg() {
		System.out.println("calling The protected getMSg() from The CLass A is ");
	}
}

public class JavaAccessModifiersWithMethodOverriding extends D {
	  void getMsg() {
		System.out.println("Inside The  JavaAccessModifiersWithMethodOverriding ");
		
	}
	public static void main(String[] args) {
		System.out.println("This is The Example Of The Java Access Modifiers with Method Overriding");
//		D a = new D();
//		a.getMsg();
		JavaAccessModifiersWithMethodOverriding accessModifiersWithMethodOverriding = new JavaAccessModifiersWithMethodOverriding();
		accessModifiersWithMethodOverriding.getMsg();
		
	}

}
