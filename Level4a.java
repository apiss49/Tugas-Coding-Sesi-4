package Belajar.Sesi4.Tugas;
import java.util.Scanner;
public class Level4a {
    public static void main(String[] args) throws Exception {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Input N: ");
        int n = inputan.nextInt();

        System.out.print(" Output: ");
        for (int i=2; i<=n; i++) {
            boolean statusPrima = true;

            for (int j=2; j*j<=i; j++) {
                if (i%j == 0) {
                    statusPrima = false;
                    break;
                }
            }
            if (statusPrima) {
                System.out.print(i + " ");
            }
        }
        inputan.close();
    }
}