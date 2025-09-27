public class floyd_triangle {
    public static void floydtriangle(int n){
        int counter =1;
        //outer
        for(int i=1;i<=n;i++){
            //inner 
            for(int j=1;j<=i;j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        floydtriangle(5);
    }
}
