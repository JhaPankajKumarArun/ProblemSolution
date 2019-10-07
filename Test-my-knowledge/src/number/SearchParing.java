package number;

import java.util.Arrays;

public class SearchParing {

	public static int sockMerchant(int n, int[] ar) {
		Arrays.sort(ar);
		int numberOfPair=0;
		int counter=0;
		while(counter<ar.length-1){
			if(ar[counter]==ar[counter+1]){
				numberOfPair++;
				counter++;
			}
			counter++;
		}
        return numberOfPair;
    }
	
	public static void main(String ar[]){	
		int []socksPile={10, 20, 20, 10, 10, 30, 50, 10, 20,50};
		int pair= SearchParing.sockMerchant(10, socksPile);
		System.out.println(pair);
	}
	
}
