package com.test.march14;

class Parent{
	public void show() {
		System.out.println("jaf");
	}
}
class Child extends Parent{
	@Override
	public void show() {
		System.out.println("vinay");
	}
}

public class A {

	public static void main(String[] args) {
	Parent c = new Parent();
	c.show();
	System.out.println(c);

	}

}
