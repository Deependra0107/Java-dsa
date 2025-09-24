import java.util.Scanner;

public class continue_stm {
    //Display all number enterd bu user except multiple of java
    public static void main(String[] args) {
        /*  Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter your number");
            int n =sc.nextInt();
            if (n%10==0) {
                continue;
            }
            System.out.println("Number was :" +n);
        } while (true);*/
         
        // check if a number is prime or not 
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        if (n==2) {
            System.out.println("n is Prime");
        }else{
            boolean isPrime =true;
            for(int i=2;i<=n/2;i++){
                if (n%i ==0) {
                    isPrime = false;
                }
            }
            if (isPrime==true) {
                System.out.println("n is Prime");
            } else{
                System.out.println("n is not prime");
            }
        }


       
    }
}
