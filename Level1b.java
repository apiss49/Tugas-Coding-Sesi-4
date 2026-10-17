package Belajar.Sesi4.Tugas;
import java.util.Scanner;
public class Level1b {
    public static void main(String[] args) throws Exception {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukan 'N': ");
        int N = inputan.nextInt();
        for (int i=N; i>=1; i--) {
            System.out.print(i + " ");
        }
        inputan.close();
    }
}
