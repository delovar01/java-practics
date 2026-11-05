import java.util.Locale;
import java.util.Scanner;
public class Task3 {
    static String biggerSmaller(double x, double y) {
        if (x > y) {
            return "Большее " + x + ", а меньшее " + y;
        } else {
            return "Большее " + y + ", а меньшее " + x;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        System.out.println(biggerSmaller(x, y));
    }
}
