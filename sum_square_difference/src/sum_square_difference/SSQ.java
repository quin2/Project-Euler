package sum_square_difference;

public class SSQ {
	public static void main(String args[]){
		double sum = 0;
		double sum2 = 0;
		
		for(int i = 1; i <= 100; i++){
			sum += i * i;
			sum2 += i;
		}
		
		sum2 = sum2 * sum2;
		
		System.out.println(sum2 - sum);
	}
}
