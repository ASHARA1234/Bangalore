package practice.accessmodifiers;

// given number 153
//1^3+5^3+3^3=
//1*1*1+5*5*5+3*3*3
//1+    125+   27
//153
public class Armstrongnumber {

	public static void main(String[] args) {
		int n=153;
		int temp=n;
		int r,sum=0;
		
		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum= sum+r*r*r;
		}
		
		if (temp==sum)
			System.out.println("Its an Armstrong number");
		else
			System.out.println("Not  an Armstrong number");
	}

}

