package Belajar.Sesi4.Tugas;
import java.util.Scanner;
public class Level2b {
    public static void main(String[] args) throws Exception {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukan 'N': ");
        int N = inputan.nextInt();

        long faktorial = 1;

        for (int i=1; i<=N; i++) {
            faktorial = faktorial * i;
        }
        System.out.println(N + "! = "+ faktorial);

        inputan.close();
    }
}
