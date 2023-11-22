package com.prowings.hashcode;

public class Test1 {
	int i;

	public Test1(int i) {
		this.i = i;
	}
	
	public String toString() {
		return i + "";
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		return result;
	}
	
	public static void main(String[] args) {
		Test1 t = new Test1(10);
		Test1 t1 = new Test1(100);
		System.out.println(t);
		System.out.println(t1);
	}
}
