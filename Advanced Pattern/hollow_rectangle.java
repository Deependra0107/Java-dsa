public class hollow_rectangle {
    public static void Hollow_rectangle(int totalrow ,int totalcol){
        //outer loop
        for(int i=1;i<=totalrow; i++){
            for(int j=1;j<=totalcol;j++){
                // cell -(i,j)
                if (i==1||i==totalrow||j==1||j==totalcol) {
                    // boundry cell
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Hollow_rectangle(5, 7);
    }
}
