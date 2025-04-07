package test1;

public class tests{
	
	static int x=30;
	public void m2() {
		int x=20;
		System.out.println("m2 is running"+x);
		System.out.println("m2 is running"+x);
	}


	public static void main(String[] args) {
		
		tests t=new tests();
		t.m2();
		System.out.println("hello");
		
	}
}
