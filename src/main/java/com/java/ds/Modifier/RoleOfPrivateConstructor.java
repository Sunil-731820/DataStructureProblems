package com.java.ds.Modifier;

class B {
	private B() {
		System.out.println("Calling The private Constructor Here ");
	}
	
	void getMessage() {
		System.out.println("calling the getMessage() From CLass B");
	}
}
public class RoleOfPrivateConstructor {
	
	public static void main(String[] args) {
		System.out.println("This is The Example Of The private Constructor ");
		B b = new B();
		
	}

}
