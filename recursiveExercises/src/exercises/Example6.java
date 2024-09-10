package exercises;

//reverse a string

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example6 {
    public static String reverseAString(String str){
        if(str.length() <= 1){
            return str;
        }else{
            return str.charAt(str.length()-1) + reverseAString(str.substring(0, str.length()-1));
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a string: ");
        String str = br.readLine();
        System.out.println("The answer : "+ reverseAString(str));
    }
}
