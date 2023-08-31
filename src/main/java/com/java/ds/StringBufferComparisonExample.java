package com.java.ds;

public class StringBufferComparisonExample {
    public static void main(String[] args) {
    	
    	
    	
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Hello");

        String emptyString = "";
        
        String stringBufferContents = stringBuffer.toString();
        System.out.println(stringBufferContents);
        if (emptyString.equals(stringBufferContents)) {
            System.out.println("The StringBuffer is empty.");
        } else {
            System.out.println(stringBufferContents);
        }
        
        StringBuffer str1 = new StringBuffer("");
        if(str1.isEmpty()) {
        	System.out.println("Empty");
        }else {
        	System.out.println("Fileed ");
        }
    }
}
