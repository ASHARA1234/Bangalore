package practice.accessmodifiers;

public class ParentClass {
	int p_a= 10;
	
	public void parentMethod() {
	System.out.println("Parent Method");
	}
	
   public static void main(String[] args) {
	   GrandChildClass c= new GrandChildClass();
	   System.out.println(c.c_a);
	   c.childMethod();
	  System.out.println( c.p_a);
	  c.parentMethod();
	  c.GrandchildMethod();
	  
	  
	  
	}
   

}



class ChildClass extends ParentClass                        //derived class
{
	//int p_a=10;
	int c_a= 20;
	
	public void childMethod () {
		System.out.println("Child Method");
	}
	
	
}

class GrandChildClass extends  ChildClass{
	public void GrandchildMethod () {
		System.out.println("Grand Child Method");
		
		
		
	}
}