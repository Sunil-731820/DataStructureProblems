package com.java.ds.Modifier.ProtectedModifierPack;
import com.java.ds.Modifier.ProtectedModifierMypack.A;

/*\r\n"
+ " * \r\n"
+ " * The protected access modifier is accessible within package and outside the package\r\n"
+ " *  but through inheritance only.\r\n"
+ "The protected access modifier can be applied on the data member, method and constructor. \r\n"
+ "It can't be applied on the class.\r\n"
+ "It provides more accessibility than the default modifier.\r\n"
+ " */
public class B extends A {
	public static void main(String[] args) {
		System.out.println("This is The Example Of The protected Modifier in java ");
		B b = new B();
		b.getMessage();
	}
	

}
