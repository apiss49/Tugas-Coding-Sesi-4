package Belajar.Sesi4.Tugas;
import java.util.Scanner;
public class Level2a {
    public static void main(String[] args) throws Exception {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukan 'N': ");
        int N = inputan.nextInt();

        int sum = 0;

        for (int i=1; i<=N; i++) {
            if(i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.print("Sum of even numbers = "+ sum);

        inputan.close();
    }
}
