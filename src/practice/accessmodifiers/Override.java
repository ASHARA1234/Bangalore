package practice.accessmodifiers;

public class Override {

	private static Object ob;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Dhanu ob= new Dhanu();
		ob.Usha();
		ob.Geetha();

	}

}

class Asha{
	public void Usha() {
		System.out.println("this is Override");
	}
	public void Geetha() {
		System.out.println("this is Override");
	}
}
   class Dhanu extends  Asha{
	public void Usha() {
		System.out.println("this is one more class");
	}
}
