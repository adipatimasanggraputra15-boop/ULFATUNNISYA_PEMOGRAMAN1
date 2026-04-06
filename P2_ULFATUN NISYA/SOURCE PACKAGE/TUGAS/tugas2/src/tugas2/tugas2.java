//ULFATUN NISYA
//241011401644
//MENGEMBANGKAN PROGRAM DATA MAHASISWA

package tugas2;

import java.util.Scanner;

public class tugas2 
{
    public static void main(String args[]) 
    {
        try (Scanner input = new Scanner(System.in)) {
            String nama, nim, address,jurusan, fakultas;

            System.out.print("input nama: ");
            nama = input.nextLine();

            System.out.print("input nim: ");
            nim = input.nextLine();

            System.out.print("input address: ");
            address = input.nextLine();

            System.out.print("input jurusan : ");
            jurusan = input.nextLine();

            System.out.print("input fakultas : ");
            fakultas = input.nextLine();

            System.out.println("\nData Mahasiswa:");

            System.out.println("Nama: " + nama);
            System.out.println("NIM: " + nim);
            System.out.println("Address: " + address);
            System.out.println("Jurusan: " + jurusan);
            System.out.println("Fakultas: " + fakultas);
            System.out.println("=====================================");

            System.out.println("Terima kasih telah menggunakan program ini!");
        }
    }
}