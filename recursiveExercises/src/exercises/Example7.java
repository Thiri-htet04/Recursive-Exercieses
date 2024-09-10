package exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example7 {
    public static double powerOfANumber(double base, int exponent){
        if(exponent == 0){
            return 1;
        }else if(exponent == 1){
            return base;
        }
        if(exponent >0 ){
            return base * powerOfANumber(base, exponent-1);
        }else {
            return 1/powerOfANumber(base, -exponent);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number for base: ");
        int b = Integer.parseInt(br.readLine());
        System.out.print("Enter a number for exponent: ");
        int e = Integer.parseInt(br.readLine());
        System.out.println("The answer : "+ powerOfANumber(b, e));
    }
}
