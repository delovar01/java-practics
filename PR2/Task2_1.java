import java.util.Locale;
import java.util.Scanner;

public class Task2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 2; i<=n; i++){
            sum+=(1.0 /((i*i)-1));
        }
        System.out.println(sum);
    }
}
