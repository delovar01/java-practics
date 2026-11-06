import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class Task2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double x = sc.nextInt();
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += (Math.pow(-1, i) * ((Math.pow(x, 2 * i + 1)) / (2 * i + 1)));
        }
        System.out.println(sum);


    }}