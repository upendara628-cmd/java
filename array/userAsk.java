import java.util.*;
public class userAsk{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your array size ");
        int n = sc.nextInt();
        String[] number = new String[n];
        for(int i=0;i<n;i++){
            number[i] = sc.next();
        }
        for(int i=0;i<number.length;i++){
             System.out.print(number[i]+" ");
        }
                
    }
}