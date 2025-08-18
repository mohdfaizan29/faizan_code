public class Discount10 {
    public static void main(String[] args){
        int a = 50;
        int b = 50;
        int total = a+b;
        if(total>=200){
            System.out.println("you will get discount of 10% ");
        }
        if(total>100&&total<200){

        
            System.out.println("you will get discount of 5% ");
        }
        if(total<=100){
            System.out.println("you will not get discount ");
        }
    }
}
