import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class Task2_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int n = sc.nextInt();
        String b = "";
        while (n>0){
            b+= (n%10+"");
            n/=10;


        }
        System.out.println(b);
    }
}