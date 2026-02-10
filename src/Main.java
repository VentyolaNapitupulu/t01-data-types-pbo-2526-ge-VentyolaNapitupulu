import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soal = sc.nextInt(); // penentu soal

        if (soal == 1) {
            /* ===== SOAL 1: INTEGER OVERFLOW ===== */
            int a = sc.nextInt();
            int b = sc.nextInt();

            int sum = a + b;

            if ((a > 0 && b > 0 && sum < 0) ||
                (a < 0 && b < 0 && sum > 0)) {
                System.out.println("OVERFLOW");
            } else {
                System.out.println(sum);
            }

        } else if (soal == 2) {
            /* ===== SOAL 2: FLOAT vs DOUBLE ===== */
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            float sumFloat = (float) x + (float) y;
            double sumDouble = x + y;

            double diff = Math.abs(sumDouble - sumFloat);

            System.out.printf("%.6f\n", diff);

        } else if (soal == 3) {
            // TODO: Soal 3

        } else if (soal == 4) {
            // TODO: Soal 4

        } else if (soal == 5) {
            // TODO: Soal 5
        }
    }
}
