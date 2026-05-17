import java.util.*;

public class sum_arr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array number ");
        int n = sc.nextInt();
        int[] student = new int[n];
        System.out.print("enter student marks :");
        int sum = 0;
        int max = 0;
        
        for(int i= 0;i<n;i++){
            student[i] = sc.nextInt();
             sum += student[i];
             max = student[0];
             if(student[1]>max){
                max = student[i];
             }

        }       
        
        System.out.println("this is student marks :"+sum);

        // average marks 
        int avg = sum/n;
        System.out.println("avg marks of the student "+avg);

        // max marks 
        System.out.println("max marks of the student "+max);




    }

    
}
