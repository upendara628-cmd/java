public class age_chekkar{
    static void check(int a){
        if(a>=18){
            System.out.print("you can access the web");
        }
        else{
            System.out.print("you cant");
        }
    }
    public static void main(String[] args){
        check(20);
    }
}