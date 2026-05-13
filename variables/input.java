package variables;

import java.util.Scanner;

public class input {
    public static void main(String[] args){
        System.out.println("adding two numbers by talsking input");
        Scanner sc = new Scanner(System.in);
        System.out.print("take the input a==");
        int a = sc.nextInt();
        System.out.print("take the input b=");
        int b = sc.nextInt();
        System.out.print(a+b);

    }
    
}
