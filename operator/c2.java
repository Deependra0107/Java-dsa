import java.util.Scanner;

public class c2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.println("enter the number");
        int number = sc.nextInt(); 
        sc.close();
                   

        if (number % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}

