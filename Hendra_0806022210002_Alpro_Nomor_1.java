package Hendra_0606022210002_Alpro_Week4;
import java.util.Scanner;

public class Hendra_0806022210002_Alpro_Nomor_1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        double suhu, reamur, farenheit, kelvin;
        String pilihan;
        
        System.out.println("-----Alat Konversi Suhu-----");
        System.out.println("Suhu Celcius = ");

        suhu = input.nextDouble();

        System.out.println("Pilih Pilihan Konversi: ");
        System.out.println("1. Reamur = R");
        System.out.println("2. Kelvin = K");
        System.out.println("3. Farenheit = F");

        pilihan = input.next();

        if (pilihan.equals("R")) {
            
            reamur = (0.8)*suhu;

            System.out.println("Suhu Reamur = " + reamur);

        }else if (pilihan.equals("K")) {

            kelvin = suhu + 273;

            System.out.println("Suhu Kelvin = " + kelvin);


        }else if (pilihan.equals("F")) {
            
            farenheit = (1.8)*suhu + 32;

            System.out.println("Suhu Farenheit = " + farenheit);
        }




    }
}
