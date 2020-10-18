package com.string.append;

import java.util.Scanner;

public class StringsAppends {
	public static void main(String[] args) {
		String a, b,c,d;	
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first string:");
		   a = s.nextLine();
		  System.out.println(a);
		  
		  System.out.print("Enter second string:");
	        b = s.nextLine();
	        StringsAppends obj = new   StringsAppends();
	        c = obj.concat(a, b);
	        System.out.println("New String:"+c);
        
        while(true) { 
        	
        System.out.print("Enter again string:");
        d = s.nextLine();
        StringsAppends obj1 = new   StringsAppends();
        c = obj.concat(c, d);
        System.out.println(c);
                        
    }
}
    String concat(String x, String y)
    {
		String z;
        z = x + " " + y;
        return z;
    }
}
