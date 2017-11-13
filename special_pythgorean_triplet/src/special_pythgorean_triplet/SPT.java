package special_pythgorean_triplet;

public class SPT {
	public static void main(String args[]){
		for(int i = 0; i < 500; i++){
			for(int j = 0; j < 500; j++){
				for(int k = 0; k < 500; k++){
					if(Math.pow(i, 2) + Math.pow(j,  2) == Math.pow(k, 2)){
						if(i + j + k == 1000){
							System.out.println(i * j * k);
						}
					}
				}
			}
		}
	}
}
