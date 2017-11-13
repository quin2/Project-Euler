package largest_prime_factor;

public class LPF {
	public static void main(String args[]){
		/*
		for(double x = 0.0; x < 600851475143.0; x++){
			if(600851475143.0 % x == 0.0) System.out.println(isPrime(x));
		}
		*/
		
		System.out.println(isPrime(5.0));
	}
	
	public static double isPrime(double toEnter){
		for(double i = 0.0; i < Math.sqrt(toEnter); i++){
			if(toEnter % i == 0.0) return 0.0;
		}
		return toEnter; 
	}
}
