package com.revature.app.stream;

public class FuctionalInterfaceDemoClass {
	public static void main(String[] args) {
		
	
	FunctionalInterfaceDemo demo = (n1 ,n2) -> {
			return n1>n2;
		};
	System.out.println(demo.compare(20,10));
}
}