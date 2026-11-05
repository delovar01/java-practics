public class Task2Test {
    static void check(double x, double expected) {
        double got = Task2.calc(x);
        if (Math.abs(got - expected) < 1e-9) {
            System.out.println("OK: x = " + x + ", y = " + got);
        } else {
            System.out.println("ОШИБКА: x = " + x + ", ждали " + expected + ", получили " + got);
        }
    }

    public static void main(String[] args) {
        check(1.5, 16.086408692072386);
        check(0, -1);
        check(Math.PI / 4, 1.5);
    }
}
