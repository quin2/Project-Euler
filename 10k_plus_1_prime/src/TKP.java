public class TKP {
	public static void main(String args[]){
		int primeCount = 0;
		double primeTest = 0.0;
		
		while(primeCount < 10001){
			if(primeCheck(primeTest)){
				System.out.println(primeTest);
				primeCount++;
			}
			
			primeTest++;
		}
	}
	
	public static boolean primeCheck(double x){
		if (x % 2 == 0) return false;
		
		for(int i = 3; i * i <= x; i++)
		{
			if(x % i == 0) return false;
		}
		
		return true;
	}
}
