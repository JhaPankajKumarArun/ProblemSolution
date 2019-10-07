package number;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Dem {

	static void plusMinus(int[] arr) {
        double positiveCnt=0;
        double negativeCnt=0;
        double zeroCnt=0;
        int length = arr.length;
        for(int i=0;i<length;i++){
            if(arr[i]>0){
                positiveCnt++;
            }else if(arr[i]<0){
                negativeCnt++;
            }else{
                zeroCnt++;
            }
        }
        System.out.println( BigDecimal.valueOf(positiveCnt/length).setScale(6,RoundingMode.HALF_EVEN));
        System.out.println( BigDecimal.valueOf(negativeCnt/length).setScale(6,RoundingMode.HALF_EVEN));
        System.out.println( BigDecimal.valueOf(zeroCnt/length).setScale(6,RoundingMode.HALF_EVEN));
    }
	
	public static void main(String[] args) {
		int arr[]={-4 ,3, -9, 0, 4, 1};	
		plusMinus(arr);

	}

}
