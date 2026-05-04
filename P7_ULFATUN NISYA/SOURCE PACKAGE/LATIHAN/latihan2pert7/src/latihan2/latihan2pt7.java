//latihan 2 pert 7 tentang swich case = hewan
//ulfatun nisya

package latihan2;

import java.util.Scanner;

public class latihan2pt7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // S1
        System.out.print("Input pilihan (a/b): ");
        String pilihan = sc.nextLine();

        String hewan;

        switch (pilihan) {
            case "a":
                // P1
                hewan = "Ayam";
                break;
            case "b":
                // P2
                hewan = "Beruang";
                break;
            default:
                // S2
                hewan = "Pilihan tidak tersedia";
                break;
        }

        // S3
        System.out.println("Hewan : " + hewan);

        sc.close();
    }
}