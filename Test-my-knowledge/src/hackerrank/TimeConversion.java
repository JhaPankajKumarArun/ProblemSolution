package hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TimeConversion {
	 /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        int hour= Integer.valueOf(s.substring(0,2));
         int min= Integer.valueOf(s.substring(3, 5));
         int sec=Integer.valueOf(s.substring(6, 8));
        if(s.endsWith("PM")){
            if(hour!=12){
                hour= (hour+12)==24?00:(hour+12);
            }
        }else{
            hour= (hour==12)?00:hour;                
        }
        return (hour< 10?("0"+hour):hour) + ":" + (min< 10?("0"+min):min) +":"+ (sec< 10?("0"+sec):sec);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
