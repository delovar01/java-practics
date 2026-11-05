import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double x = sc.nextDouble();
        double y = Math.pow(Math.sin(x), 2)-Math.cos(x * 2)+ Math.tan(x);
        System.out.println(y);


    }
}
