//latihan realisasi nilai mahasiswa 

package Latihan4;

import java.util.Scanner;
public class Latihan4
 
{
    public static void main(String args[])

    {
        Scanner input = new Scanner (System.in);

        String Nama, Nim;
        double Kehadiran, Tugas, UAS, UTS, Realisasi;

        System.out.print("Input nama: ");
        Nama = input.nextLine();

        System.out.print("Input nim: "); 
        Nim = input.nextLine();

        System.out.print("Input kehadiran: ");
        Kehadiran = input.nextDouble();

        System.out.print("Input tugas: ");
        Tugas = input.nextDouble();

        System.out.print("Input UTS: ");
        UTS = input.nextDouble();

        System.out.print("Input UAS: ");
        UAS = input.nextDouble();

        System.out.print("Input realisasi: ");
        Realisasi = input.nextDouble();

        System.out.println("nama: " + Nama);

        System.out.println("nim: " + Nim);

        System.out.println("kehadiran: " + Kehadiran);

        System.out.println("tugas: " + Tugas);

        System.out.println("UTS: " + UTS);

        System.out.println("UAS: " + UAS);

        System.out.println("realisasi: " + Realisasi);

        System.out.println("totalNilai: " + totalNilai(Kehadiran, Tugas, UTS, UAS, Realisasi));

        input.close();
    
    }

    public static double totalNilai(double kehadiran, double tugas, double UTS, double UAS, double realisasi)
     
    {
        double bobotKehadiran = (realisasi / 21) * 10;
        double bobotTugas = (tugas * 20) / 100;
        double bobotUTS = (UTS * 30) / 100;
        double bobotUAS = (UAS * 40) / 100;

        double total = bobotKehadiran + bobotTugas + bobotUTS + bobotUAS;


        return total; 
    
    }
}