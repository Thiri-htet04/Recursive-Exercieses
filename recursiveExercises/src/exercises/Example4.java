package exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//summ of natural numbers
public class Example4 {
    public static int sum(int n){
        if (n==1){
            return 1;
        }else{
            return n + sum(n-1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number: ");
        int num = Integer.parseInt(br.readLine());
        System.out.println("The answer : "+ sum(num));
    }
}
