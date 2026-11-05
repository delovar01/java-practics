import java.util.Locale;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Данная программа производит расчет стоимости поездки на машине");

        System.out.println("Введите расстояние, которое собираетесь проехать:");
        if (!sc.hasNextDouble()){
            System.out.println("Ошибка: нужно вводить число, попробуйте еще раз");
            return;}
        double r = sc.nextDouble();
        if (r < 0){
            System.out.println("Ошибка: нужно вводить положительное значение");
            return;}
        System.out.println("Введите Ваш расход на 100км:");
        if (!sc.hasNextDouble()){
            System.out.println("Ошибка: нужно вводить число, попробуйте еще раз");
            return;}
        double ras = sc.nextDouble();
        if (ras < 0 ){
            System.out.println("Ошибка: нужно вводить корректное значение");
            return;}
        System.out.println("Введите актуальную цену литра, руб:");
        if (!sc.hasNextDouble()){
            System.out.println("Ошибка: нужно вводить число, попробуйте еще раз");
            return;}
        double price = sc.nextDouble();
        if (price < 0){
            System.out.println("Ошибка: нужно вводить корректное значение");
            return;}
        double p = price * (ras * (r / 100));
        System.out.println("Стоимость вашей поездки составляет: " + p + " руб");




    }

}
