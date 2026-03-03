import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String soal = sc.next();   // Soal1 / Soal2 / Soal3 / Soal4 / Soal5

        // =========================
        // SOAL 1
        // =========================
        if (soal.equals("Soal1")) {

            int a = sc.nextInt();
            int b = sc.nextInt();

            int result = a + b;

            // Deteksi overflow TANPA long
            if ((a > 0 && b > 0 && result < 0) ||
                (a < 0 && b < 0 && result > 0)) {
                System.out.println("OVERFLOW");
            } else {
                System.out.println(result);
            }
        }

        // =========================
        // SOAL 2
        // =========================
        else if (soal.equals("Soal2")) {

            float xFloat = sc.nextFloat();
            float yFloat = sc.nextFloat();

            float sumFloat = xFloat + yFloat;

            double xDouble = (double) xFloat;
            double yDouble = (double) yFloat;

            double sumDouble = xDouble + yDouble;

            double selisih = Math.abs(sumDouble - sumFloat);

            System.out.printf("%.6f\n", selisih);
        }

        // =========================
        // SOAL 3
        // =========================
        else if (soal.equals("Soal3")) {

            int N = sc.nextInt();

            Integer a = N; // Langkah 1: Autoboxing N ke objek a
            Integer b = a; // Langkah 2: b merujuk ke objek yang sama dengan a

            a = a + 1; // Langkah 3: a sekarang merujuk ke objek BARU (N + 1)

            System.out.println("==: " + (a == b));
            System.out.println("equals: " + a.equals(b));
        }

        // =========================
        // SOAL 4
        // =========================
        else if (soal.equals("Soal4")) {

            String S = sc.next();

            String a = S;
            String b = new String(S);

            a = a + "X";

            System.out.println("==: " + (a == b));
            System.out.println("equals: " + a.equals(b));
        }

        // =========================
        // SOAL 5
        // =========================
        else if (soal.equals("Soal5")) {

            int integerValue = Integer.parseInt(sc.next());
            double doubleValue = Double.parseDouble(sc.next());
            boolean boolValue = Boolean.parseBoolean(sc.next());

            double hasil = integerValue * doubleValue;

            if (boolValue == false) {
                hasil = hasil * -1;
            }

            System.out.printf("%.2f\n", hasil);
        }

        sc.close();
    }
}
