package largest_pal_product;

public class LPP {
	
    public static void main(String args[]){
    	
    	for(double i = 100.0; i <= 999.0 ; i++){
    		for(double j = 100.0; j <= 999.0; j++){
    		if(checkPal(i * j)){
    			System.out.println(i * j);
    		}
    		}
    	}
    	
    }
    
	public static boolean checkPal(double x){
		int length = Double.toString(x).length() - 2;
		int[] toStr = new int[length];
		
		for(int i = toStr.length - 1; i >= 0; i--){
			toStr[i] =(int)(x % 10.0);
			x /= 10.0;
		}
		
		for(int i = toStr.length - 1; i >= 0; i--){
			if(toStr[i] != toStr[(toStr.length - 1) - i]) return false;
			
		}
		
		return true;
		
	}
	
}


