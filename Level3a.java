package Belajar.Sesi4.Tugas;
import java.util.Scanner;
public class Level3a {
    public static void main(String[] args) throws Exception {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukan R: ");
        int R = inputan.nextInt();

        System.out.print("Masukan C: ");
        int C = inputan.nextInt();

        for (int i=1; i<=R; i++) {
            for (int j=1; j<=C; j++) {
                System.out.print("*");
            }
            System.out.println( );
        }
        inputan.close();
    }
}
