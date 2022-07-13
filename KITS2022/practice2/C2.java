package practice2;


public class C2 {
	
	public static void main(String[] args) {
		C1 c1 = new C1();
		System.out.println("Value from C1 x = " + c1.x);
		System.out.println("Value from C1 y = " + c1.y);
		System.out.println("Value from C1 z = " + c1.z);
		System.out.println("Value from C1 u = " + c1.getU());
		c1.m();
	}
	
	public void m() {
		System.out.println('L');
	}
}
