package conditions;
import java.util.*;

public class even_odd {
    public static void main(String[] args){
        System.out.print("enter your number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0){
            System.out.print("your number is even");
        }
            else if(n<0){
                System.out.print("enter valid number");
        }
            else{
                System.out.print("your number is odd ");
            }

    }
    
}
