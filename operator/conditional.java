public class conditional {
    public static void main(String[] args) {
        int age =16;
        if(age>=18){
            System.out.println("drive, vote");
        }
        else if (age>13 && age<18 ){
            System.out.println("teenager");
        }
        else{
            System.out.println("not adult");
        }
    }
    
}
