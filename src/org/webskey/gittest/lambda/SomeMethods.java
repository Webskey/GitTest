package org.webskey.gittest.lambda;

public class SomeMethods {
	
	public void printNumber(NumberInterface test) {
		System.out.println(test.getNumber() + 10);
	}
	
	public void printNumberWithParamentr(NumberWithParametrInterface test, int num) {
		System.out.println(test.getNumber(num));
	}
	public String toString() {
		return "SomeMethods.toString()";
	}
}
