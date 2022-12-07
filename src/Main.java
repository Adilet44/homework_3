import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] aspire = {12.1, -5.61, 45.4, -74.8, 42.5, -6.6, 2.3, -9.09, 1.17, -24.9, 26.6, -4.35, 7.5, -6.4, 6.9};
        double resultOfAspire = 0.0;
        for (double aspare : aspire) {
            if (aspare < 0) {
                continue;
            }
            resultOfAspire += aspare;
        }
        System.out.println(resultOfAspire);
       
    }



}









