import java.util.Scanner;

public class for_loop {
    public static void main(String[] args) {
        /* int i=1;
        for( i=1;i<=10;i++){
            System.out.println("Hello World");
        }*/
        
        //#Q2 (square pattern)
        /* int line =1;
       for(line=1; line<=4;line++){
        System.out.println("* * * *");
       }*/
        
       //using while loop
       /* 
       int line =1;
       while (line<=4) {
        System.out.println("* * * *");
        line++;
        
       }*/
      //print reverse of a number 
      /*int n=1089;
      while (n>0) {
        int lastdigit = n%10;
        System.out.print(lastdigit + " ");
        n=n/10;
      } */
      // reverse a given number
      System.out.println("Enter Number");
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int rev =0;
      sc.close();

      while (n>0) {
        int lastdigit=n%10;
        rev = (rev*10)+lastdigit;
        n =n/10;}
        System.out.println(rev);
    }
    

}
