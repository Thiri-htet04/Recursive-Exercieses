package exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example8 {
    public static int stringToInteger(String str){
        if(str.isEmpty()){
            return 0;
        }else{
            return Integer.parseInt(str.substring(0, 1)) * (int) Math.pow(10, str.length() - 1) + stringToInteger(str.substring(1));
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a string: ");
        String str = br.readLine();
        System.out.println("The answer : "+ stringToInteger(str));
    }
}
