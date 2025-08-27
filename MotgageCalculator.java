import java.util.*;
public class MotgageCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of P :");
        double P = sc.nextDouble();
        System.out.println("Enter the value of r :");
        double r = sc.nextDouble();
        System.out.println("Enter the value of n :");
        double n = sc.nextDouble();
        double M = P*(r*Math.pow(1+r,n))/(Math.pow(1+r,n)-1);
        System.out.println("M = "+M);




    }
}
