package exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//tribonacci
public class Example3 {
    public static int tribonacci(int n){
        if(n==0){
            return 0;
        }
        else if(n==1 || n==2){
            return 1;
        }else{
            return tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number: ");
        int num = Integer.parseInt(br.readLine());
        System.out.println("The answer : "+ tribonacci(num));
    }
}
