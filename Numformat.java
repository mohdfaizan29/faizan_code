import java.text.NumberFormat;

public class Numformat {
    public static void main(String[] args){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(892367.098);
        System.out.println(result);
    }
}
