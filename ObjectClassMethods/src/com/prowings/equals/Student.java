package com.prowings.equals;

import java.util.Objects;

public class Student {
	 String name;
	 int rollNo;
    Student(String name,int rollNo)
	
	{
		this.name=name;
		this.rollNo=rollNo;
	
	}
    
    
    public static void main(String[] args) {
		Student s1=new Student("sakshi",101);
		Student s2=new Student("sanket",102);
		Student s3=new Student("sakshi",101);
		Student s4=s1;
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(null));
		
		
	}
    
    public boolean equals(Object obj)
    {
    	if(obj==this)
    		return true;
    	if(obj instanceof Student)
    	{
    		Student s=(Student)obj;
    		if(name.equals(s.name)&&rollNo==s.rollNo)
    		{
    			return true;	
    		}
    	}
		return false;
    }

//public boolean equals(Object obj)
//{
//	Student s=(Student)obj;
//	boolean res=false;
//	
//	if(this.name.equals(s.name)&&this.rollNo==s.rollNo)
//	
//		res = true;
//	
//		return res;
//	
//}
}

//	@Override
//	public int hashCode() {
//		return Objects.hash(name, rollNo);
//	}
//
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		return Objects.equals(name, other.name) && rollNo == other.rollNo;
//	}
//	
//}

