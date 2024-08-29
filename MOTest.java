class A{
	int i, j;
	
	A(int a, int b){
		i=a;
		j=b;
	}
	
	void show(){
		System.out.println("i = " + i);
		System.out.println("j = " + j);
	}
	
	//method overloading of show()
	void show(String s){
		System.out.println("s = " + s);
	}
}

class B extends A {
	int k;
	
	B(int a, int b, int c){
		super(a,b);
		k=c;
	}
	
	//method overriding of show()
	void show(){
		super.show();
		System.out.println("k = " + k);
	}
}

class MOTest{
	public static void main(String args[]){
		B b = new B(1, 2, 3);
		b.show();
		//b.show("Vamsika");
	}
}