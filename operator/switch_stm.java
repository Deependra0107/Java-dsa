
public class switch_stm {
        /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();

        int a =sc.nextInt();
        int b =sc.nextInt();
        char operator =sc.next().charAt(0);

        switch (operator) {
        case '+':System.err.println(a+b);
                break;
        case '-':System.err.println(a-b);
                break;
        case '*':System.err.println(a*b);
                break;
        case '%':System.err.println(a%b);
                break;
        case '/':System.err.println(a/b);
        
            default:
            System.out.println("wrong number");
                break;
        }
    }*/
    public static void main(String[] args) {
        int num =2;
        switch (num){
                case 1:System.out.println("samosa");
                break;
                case 2:System.out.println("burger");
                break;
                case 3:System.out.println("mango shake");
                break;
                default:
                System.out.println("wake up");
                 break;
        }
    }
   
}