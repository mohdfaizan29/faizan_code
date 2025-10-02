public class Example1 {
    public static void main(String[] args){
        long hoursWorked = 50;
        double payRate = 40;
        double taxRate = 0.10;
        System.out.println("Hours Worked :"+hoursWorked);
        System.out.println("Payment Amount :"+(hoursWorked*taxRate));
        System.out.println("Tax Payment :"+(payRate*hoursWorked));
        }
    }
