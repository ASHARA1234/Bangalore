package practice.accessmodifiers;

public abstract class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// overloading
		asha(5);
		asha(10);
		asha(30,50);
		asha("bngalore");
	}
	 	
	 	

public static void asha( int a) {
	System.out.println("given number : "+a);
}
public static void asha( int c, int d ) {
	System.out.println("sum of two : "+(c+d));
	}

public static void asha( String name ) {
	System.out.println("name : "+name);
	
}
}

