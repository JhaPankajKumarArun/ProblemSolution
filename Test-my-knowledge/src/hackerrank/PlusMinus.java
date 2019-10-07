package hackerrank;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class PlusMinus {
    // Complete the plusMinus function below.
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

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
    	
    	//Input Format
    	//The first line contains an integer, , denoting the size of the array.
    	//The second line contains  space-separated integers describing an array of numbers .
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}

