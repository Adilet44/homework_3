import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] aspire = {12.1, -5.61, 45.4, -74.8, 42.5, -6.6, 2.3, -9.09, 1.17, -24.9, 26.6, -4.35, 7.5, -6.4, 6.9};
        double skrin = 0;
        int snik = 0;
        boolean asir = false;
        for (double go : aspire) {
            if (go < 0) {
                asir = true;
            } else if (go > 0 && asir) {
                skrin = go;
                snik++;
                System.out.println(go);


            }
        }
        System.out.println("среднее орифматическое число: " + skrin / snik);
    }

}













