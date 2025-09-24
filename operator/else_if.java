import java.util.Scanner;

public class else_if {
    public static void main(String[] args) {
        /*
        int age = 13;
        if (age>=18) {
            System.out.println("Adult");
        }
        else if (age>=13 && age<18) {
            System.out.println("Tenager");
        }
        else{
            System.out.println("child");
        } */

        // income tax calculator 
        /* 
        System.out.println("Enter Your salary");
        Scanner sc = new Scanner(System.in);
       
        int income =sc.nextInt();
        int tax;
        if (income<500000) {
            tax =0;
        }
        else if (income >=500000 && income<100000){
            tax =(int)(income*0.2);
        }
        else{
            tax = (int)(income*0.3);
        }
        System.out.println("Your tax is :" + tax);*/
        

        // Print the largest of 3
        
        int a=1, b=3,c=6;
        if ((a>=b )&& (a>=c)) {
            System.err.println("largest is a");
        }
        else if (b>=c) {
            System.err.println("largest is b");
            
        }
        else{
            System.err.println("largest is c");
        }
    }
}
