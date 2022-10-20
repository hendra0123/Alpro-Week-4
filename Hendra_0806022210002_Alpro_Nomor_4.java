package Hendra_0606022210002_Alpro_Week4;
import java.util.Scanner;

public class Hendra_0806022210002_Alpro_Nomor_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int jam;
        double gajiA, gajiK, gajiB, pajak;

        System.out.println("Total Jam Kerja = ");
        jam = input.nextInt();

        if (jam >= 40) {
            gajiA = jam-40;
            gajiK = 40*6 + gajiA*9;
        
            System.out.println("Gaji Kotor = " + gajiK);
        } else {
            gajiK = jam*6;

            System.out.println("Gaji Kotor = " + gajiK);
        }

        if (gajiK >= 250) {
            pajak = gajiK*0.12;
            System.out.println("Pajak = " + pajak);

        } else {

            pajak = gajiK*0.1;
            System.out.println("Pajak = " + pajak);
        }
        
            gajiB = gajiK - pajak;
            System.out.println("Gaji Bersih = " + gajiB);
    }
}
