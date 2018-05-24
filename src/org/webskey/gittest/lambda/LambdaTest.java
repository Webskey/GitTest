package org.webskey.gittest.lambda;

import java.util.function.Supplier;

public class LambdaTest{
	public static void main(String[] args) {
		SomeMethods sm = new SomeMethods();
		
		sm.printNumber(() -> 10); 
		
		sm.printNumberWithParamentr((e) -> e, 10);
		sm.printNumberWithParamentr((e) -> e * 2, 5);
		sm.printNumberWithParamentr((e) -> 10, 0);
		
		Supplier<String> a = sm::toString;
		System.out.println(a.get());
	}
}
