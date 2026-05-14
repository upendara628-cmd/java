import java.util.*;

public class bbig3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if(a>b && a>c){
            System.out.print("your number is :"+a);
        }
            else if(b>a && b>c){
                System.out.print("your number is :"+b);
        }
            else{
                System.out.print("your nuber is :"+c);
        }




    }
}