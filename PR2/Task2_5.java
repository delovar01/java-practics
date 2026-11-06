import java.util.Locale;
import java.util.Scanner;
public class Task2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double b = 1;
        while (b != 0) {
            System.out.println("----Главное меню----\n1-Информация о программе\n2-Информация о разработчике\n3-Выполнить расчет\n0-Выход");
            b = readIn(sc, "Введите действие", 0, 3);
            if (b == 1) {
                System.out.println("Данная программа производит расчет стоимости поездки на машине");
            } else if (b == 2) {
                System.out.println("Программу разрабатывал студент 2 курса УрФУ Прикладного ИИ Павленко Степан Андреевич");

            } else if (b == 3) {
                double rast = readDist(sc, "Расстояние, которое собираетесь приодолеть, км: ");
                double rasx = readRasx(sc, "Введите расход Вашего автомобиля на 100км:");
                double price = readPrice(sc, "Введите актуальную цену литра: ");
                double c = raschet(rast, rasx, price);
                System.out.println("Стоимость Вашей поездки " + c + " руб");

            }
        }

    }

    static double raschet(double a, double b, double c) {
            return c * (b * (a / 100));

    }

    static double readDist(Scanner sc, String promt) {
        while (true) {
            System.out.println(promt);
            if (!sc.hasNextDouble()) {
                System.out.println("Ошибка, нужно вводить число, попробуйте еще раз");
                sc.next();
            } else {
                double x = sc.nextDouble();
                if (x > 0) {
                    return x;
                }
                System.out.println("Ошибка, Вы ввели отрицательное значение, попробуйте еще раз.");
            }
        }
    }

    static double readRasx(Scanner sc, String promt) {
        while (true) {
            System.out.println(promt);
            if (!sc.hasNextDouble()) {
                System.out.println("Ошибка, нужно вводить число, попробуйте еще раз");
                sc.next();
            } else {
                double x = sc.nextDouble();
                if (x > 0) {
                    return x;
                }
                System.out.println("Ошибка, Вы ввели отрицательное значение, попробуйте еще раз.");
            }
        }
    }

    static double readPrice(Scanner sc, String promt) {
        while (true) {
            System.out.println(promt);
            if (!sc.hasNextDouble()) {
                System.out.println("Ошибка, нужно вводить число, попробуйте еще раз");
                sc.next();
            } else {
                double x = sc.nextDouble();
                if (x > 0) {
                    return x;
                }
                System.out.println("Ошибка, Вы ввели отрицательное значение, попробуйте еще раз.");
            }
        }
    }


    static int readIn(Scanner sc, String promt, int min, int max) {

        while (true) {
            System.out.println(promt);
            if (!sc.hasNextInt()) {
                System.out.println("Это не число, попробуй еще раз");
                sc.next();
            } else {
                int x = sc.nextInt();
                if (x >= min && x <= max) {
                    return x;
                }
                System.out.println("Нет такого выбора, еще раз");
            }

        }

    }


}
