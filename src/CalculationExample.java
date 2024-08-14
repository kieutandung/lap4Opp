import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hãy nhập x: ");
        int x = scanner.nextInt();

        System.out.println("Hãy nhập y: ");
        int y = scanner.nextInt();

        CalculationExample calc = new CalculationExample();
        calc.calculate(x, y);

        scanner.close();
    }

    private void calculate(int x, int y) {
        try {
            if (y == 0) {
                throw new ArithmeticException("Không thể chia cho 0.");
            }
            if (x == 0 && y == 0) {
                throw new ArithmeticException("Cả hai số không thể bằng 0.");
            }

            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;

            System.out.println("Tổng x + y = " + a);
            System.out.println("Hiệu x - y = " + b);
            System.out.println("Tích x * y = " + c);
            System.out.println("Thương x / y = " + d);
        } catch (ArithmeticException e) {
            System.err.println("Xảy ra ngoại lệ: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Xảy ra ngoại lệ: " + e.getMessage());
        }
    }
}
