import java.util.*;
class Mul 
{
	void mul(int a , int b)
	{
	    System.out.println("Multiplication  is" +(a*b));
	}
	void mul(int a, int b, int c)
	{
	    System.out.println("Multiplication is" +(a*b*c));
	}
	public static void main(String args[])
	{
	    Mul m = new Mul();
	    m.mul(2,5);
	    m.mul(2,5,6);
	}
}
