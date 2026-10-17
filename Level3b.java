package Belajar.Sesi4.Tugas;
import java.util.Scanner;
public class Level3b {
    public static void main(String[] args) throws Exception {
       Scanner inputan = new Scanner(System.in);
       System.out.print("Masukan N: ");
       int n = inputan.nextInt();

       for (int i=1; i<=n; i++) {
        for (int j=1; j<=i; j++) {
            System.out.print("*");
        }
        System.out.println();
       }
       inputan.close();
    }
}
