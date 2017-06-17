package TestAndTry;

import java.util.HashSet;

class Student {
	private String name;
	private int age;
	
	Student(String myName, int myAge){
		name=myName;
		age=myAge;
	}
	@Override
	public int hashCode(){
		return age;
		
	}
	
	public boolean equals(){
		return false;
		
	}
}

public class Test{
	static public void main(String[] args){
		Student s1=new Student("Mayur", 1);
		Student s2=new Student("Mayur", 1);
		
		HashSet<Student> mySet=new HashSet<Student>();
		
		mySet.add(s1);
		mySet.add(s2);
		
		System.out.println(mySet.size());
	}
}