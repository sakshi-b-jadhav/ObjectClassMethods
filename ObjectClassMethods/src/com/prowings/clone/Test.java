package com.prowings.clone;

public class Test implements Cloneable {
	int i=10;
	int j=20;
	
	public static void main(String[] args)throws CloneNotSupportedException {
		
	  Test t1=new Test();
	  Test t2=(Test)t1.clone();
	  System.out.println(t1.i==t2.i);
	  System.out.println("using a clone method value does not change in original object");
	  
	  t2.i=88;
	  t2.j=90;
	  System.out.println(t1.i+"\n"+t1.j);
	  
//	  System.out.println("without cloning value of t1 becomes change");
//	  Test t1=new Test();
//	  Test t2=t1;
//	  t2.i=11;
//	  System.out.println(t1.i);
		
	}

}

