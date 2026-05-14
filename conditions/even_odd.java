import java.util.*;

public class even_odd {
    public static void main(String[] args){
        System.out.print("enter your number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String result = (n%2 == 0) ? "even " : "odd ";
        System.out.print(result);
    }
    
}
