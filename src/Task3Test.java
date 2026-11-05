public class Task3Test {
    static void check(double x, double y, String expected) {
        String got = Task3.biggerSmaller(x, y);
        if (got.equals(expected)) {
            System.out.println("OK: " + got);
        } else {
            System.out.println("ОШИБКА: ждали «" + expected + "», получили «" + got + "»");
        }
    }

    public static void main(String[] args) {
        check(3, 1, "Большее 3.0, а меньшее 1.0");
        check(2, 7, "Большее 7.0, а меньшее 2.0");
        check(5, 5, "Большее 5.0, а меньшее 5.0");
        check(-4, -9, "Большее -4.0, а меньшее -9.0");
    }
}
