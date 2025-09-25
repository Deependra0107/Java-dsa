import java.util.Scanner;

public class basic {
    /*public static void printhelloworld(){
        System.out.println("Hello World");
    }
    public static void main(String[] args) {
        printhelloworld();
    } */
    
    // syntex with non-parameter 
    /* 
    public static void calculatesum(){
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("sum is : " + sum);
    }
    public static void main(String[] args) {
        calculatesum();
    }*/

    // syntex with parameter
    /*
    public static int calculatesum(int num1,int num2){
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        int sum = calculatesum(a, b);
        System.out.println("sum is :" +sum);
    } */

    //Q1
    //find product of of a and b
    /* public static int multiply(int a,int b){
        int product =a*b;
        return product;
    }
    public static void main(String[] args) {
        int a=5;
        int b=6;
        int prod = multiply(a, b);
        System.out.println("a*b is :" +prod);
        prod =multiply(10, 15);
        System.out.println("a*b = " + prod);
    }*/
    //factorial
    /* 
    public static int factorial (int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
    */
    //binomial
    /*
    public static int factorial (int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static int bc(int n,int r){
        int fact_n = factorial(n);
        int fact_r =factorial(r);
        int fact_nmr=factorial(n-r);
        int bc = fact_n/(fact_r*fact_nmr);
        return bc;
    }
    public static void main(String[] args) {
        System.out.println(bc(5, 2));
    } */
   // function overloading
    //- using parameters
    /*
   public static int sum(int a,int b){
    return a+b;
   }
   public static int sum(int a,int b,int c){
    return a+b+c;
   }
   public static void main(String[] args) {
    System.out.println(sum(3, 4));
    System.out.println(sum(3, 5, 9));
   } */

   //using data types
   /*
    public static  int sum(int a,int b){
        return a+b;
    }
    public static float sum(float a, float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(3, 6));
        System.out.println(sum(2.4f, 2.5f));
    } */
   /*
   public static boolean isprime(int n){
    if(n==2){
        return true;
    }
    boolean isprime = true;
    for(int i=2;i<=n-1;i++){
        if (n%i ==0) {
            isprime =false;
        }
    }
      return isprime;
   }
   public static void main(String[] args) {
    System.out.println(isprime(5));
   } */

   // print prime number is a given range
   /*
    public static boolean isprime(int n){
    if(n==2){
        return true;
    }
    boolean isprime = true;
    for(int i=2;i<=n-1;i++){
        if (n%i ==0) {
            isprime =false;
        }
    }
      return isprime;
   }
    public static void primeprint(int n){
        for(int i=2; i<=n;i++){
            if (isprime(i)) {
                System.out.println(i+"");
            }
        }
        System.out.println();
       
    }
    public static void main(String[] args) {
       primeprint(20);
    } */

    //convert from binary to decimal
    /*
    public static void bintodec(int biNum){
        int mynumber = biNum;
        int pow =0;
        int decnumber =0;
         
        while (biNum>0) {
            int lastdigit = biNum%10;
            decnumber += (lastdigit*(int)Math.pow(2, pow));
            pow++;
            biNum =biNum/10;
        }
        System.out.println("decimal of " +mynumber + "=" + decnumber);
    }
    public static void main(String[] args) {
        bintodec(11);
    }
    */

    // convert decimal to Binary 
    /* 
    public static void dectobin(int n){
       int mynumber=n;
        int pow =0;
        int binNum =0;

        while (n>0) {
            int rem =n%2;
            binNum = binNum+(rem*(int)Math.pow(10,pow));
            pow ++;
            n=n/2;
        }
        System.out.println("Binary form of "+mynumber + "=" + binNum);
        binNum++;
    }
    public static void main(String[] args) {
        dectobin(12);
    }
*/

}
