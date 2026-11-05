import java.util.Locale;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        if (x>y){
            System.out.println("Большее " + x + ", а меньшее " + y);
        } else {
            System.out.println("Большее " + y + ", а меньшее " + x);
        }
    }
}
