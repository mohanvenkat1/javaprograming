	
	class A {
		A() {
			System.out.println("I am constructor of A");
		}
	}
	class B extends A {
		B() {
			System.out.println("I am constructor of B");
		}
	}
	class C extends B {
		C() {
			System.out.println("I am constructor of C");
		}
	}

	class ConstructorChain {
		public static void main(String args[]) {
			B b = new B();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
