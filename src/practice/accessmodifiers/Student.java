package practice.accessmodifiers;

import java.security.PublicKey;

public class Student {
	  public int rollno = 101;
	
	  public Student() {
		 rollno =102;
	 }
	 
	 
	 public void printRollNumber() {
		 System.out.println(rollno);
	 }
		public static void main(String[] args) {
			Student s=new Student();
			s.printRollNumber();
			
		}
		 
	 }

 
	 
		 
	 
  
	 

	
	
	
 
