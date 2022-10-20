package Hendra_0606022210002_Alpro_Week4;
import java.util.Scanner;
public class Hendra_0806022210002_Alpro_Nomor_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        double n;

        System.out.println("Masukkan Nilai Anda = ");
        n = input.nextDouble();

        if (n >= 75 && n <= 100) {

            System.out.println("Lulus");

        } else {
            System.out.println("Tidak Lulus");
        }
    }
}
