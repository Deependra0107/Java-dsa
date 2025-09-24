import java.util.Scanner;

public class break_stm {
    public static void main(String[] args) {
        /*
        int i=0;
        for(i=1;i<5;i++){
            if (i==3) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("I am out of the loops");*/
        
        // keep entering number till user enter a multiple of 10
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        
        do {
            int n = sc.nextInt();
            if (n%10 ==0) {
                break;
            }
            System.out.println(n);
            
        } while (true);
        
    }
   
}
