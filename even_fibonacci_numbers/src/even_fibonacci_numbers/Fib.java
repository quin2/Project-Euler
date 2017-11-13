package even_fibonacci_numbers;

public class Fib {
	public static void main(String args[])
	{
		//do everything in here, don't do fib recursivly 
	}
	
	public static double foo(double x)
	{
		if(x == 1.0) return 1.0;
		if(x == 0.0) return 0.0;
		
		double temp = foo(x - 1) + foo(x - 2);
		
		if(temp % 2.0 == 0.0) return foo(x - 1) + foo(x - 2);

		else return 0;
	}
}
