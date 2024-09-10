package exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//sum of digits
public class Example5 {
    public static int sumOfDigits(int n){
        if (n<10){
            return n;
        }
        int lastDig = n % 10;
        int frontDig = n/10;
        return lastDig + sumOfDigits(frontDig);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number: ");
        int num = Integer.parseInt(br.readLine());
        System.out.println("The answer : "+ sumOfDigits(num));
    }
}
