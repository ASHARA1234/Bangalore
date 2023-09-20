package practice.accessmodifiers;
import java. util. Scanner;


public class Lastdigit {
	
	
	public int last (int num) {
		int rem=num%10;
		return rem;
	}

	public static void main(String[] args) {
	
   lastdigit l =new Lastdigit();
   int res=l. last(1234);
   System.out.println(res);

	}

}
