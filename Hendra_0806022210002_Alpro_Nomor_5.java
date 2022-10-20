package Hendra_0606022210002_Alpro_Week4;
import java.util.Scanner;

public class Hendra_0806022210002_Alpro_Nomor_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nama, jKelamin, menikah;

        System.out.println("Masukkan Nama Anda = ");
        nama = input.next();

        System.out.println("Masukkan Jenis Kelamin Anda (L/P) = ");
        jKelamin = input.next();

        System.out.println("Apakah Sudah Menikah (Y/T)");
        menikah = input.next();

        if (jKelamin.equals("L")) {

            System.out.println("Hello, Mr. " + nama);

        } else if (jKelamin.equals("P") && menikah.equals("T")) {
            System.out.println("Hello, Ms. " + nama);

        } else if (jKelamin.equals("P") && menikah.equals("Y")) {
            System.out.println("Hello, Mrs. " + nama);

        }


    }
}
