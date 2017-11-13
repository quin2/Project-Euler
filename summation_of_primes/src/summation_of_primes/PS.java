package summation_of_primes;

public class PS {
	public static void main(String args[]){
		double sum = 0.0;
		for(double i = 0.0; i < 2 * Math.pow(10,6); i++){
			if(primeCheck(i)) sum += i;
		}
		
		System.out.printf("%f\n", sum);
	}
	
	public static boolean primeCheck(double x){
		if(x % 2 == 0) return false;
		
		for(double i = 3.0; i < Math.sqrt(x); i += 2.0){
			if(x % i == 0) return false;
		}
		
		return true;
	}
}
