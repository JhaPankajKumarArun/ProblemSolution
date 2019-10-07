package number;

import java.util.Arrays;

public class ImmediateGraterNumber {
	
	
    public static void main(String[] args) {
          int array[] = {4,5,3,2,8,3,1};
           int pos=-1;

           for(int i=array.length-1 ;i >0 && pos==-1; i--) {
                  int num  = array[i];
                  for(int j = i-1;j>=0 && pos==-1;j--) {
                        if(num > array[j]) {
                               int temp=array[j];

                               array[j]=array[i];

                               array[i]=temp;

                       pos=j+1;

                        }
                  }

           }
           if(pos==-1){
                  System.out.println("Not found");
           }else {
                    Arrays.sort(array, pos, array.length);
                    for(int i : array) {
                           System.out.print(i+"");
             }                         
           }
    }

}