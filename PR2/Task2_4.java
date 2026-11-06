import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class Task2_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Введите x1,y1,x2,y2 через enter");
        double x1 = sc.nextInt();
        double y1 = sc.nextInt();
        double x2 = sc.nextInt();
        double y2 = sc.nextInt();
        double s1 = cord(x1, y1, x2, y2);

        System.out.println( s1);
    }

    static double cord(double a, double b, double c, double d) {
        return Math.sqrt(Math.pow(c-a, 2)+Math.pow(d - b, 2));
    }



}