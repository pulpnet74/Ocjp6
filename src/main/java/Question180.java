public class Question180 {
}

class A {
	void foo() throws Exception { throw new Exception(); } 
} 
class SubB2 extends A { 
	void foo() { System.out.println("B "); } 
} 

class Tester { 
	public static void main(String[] args) { //It shoud throw at least the same exception than foo() method in A class
		A a = new SubB2();
//		a.foo();
	}
	
}