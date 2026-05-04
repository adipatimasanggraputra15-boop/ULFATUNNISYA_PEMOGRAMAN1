//membuat program dengan menggunakan menu pilihan jurusan, biodata, dan menampilkan data mengunakan switch case dan if else
//ulfatun nisya

package latihan1pert7pt2;
import java.util.Scanner;

public class latihan1pt2pert7 {
    public static void main(String[] args) {

        Scanner simpan = new Scanner(System.in);
        int ulangMenu;

        // simpan data
        String nama = "";
        int umur = 0;
        String jurusan = "";
        String kelas = "";

        do {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Pilih Jurusan");
            System.out.println("2. Biodata");
            System.out.println("3. Tampilkan Data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            int menu = simpan.nextInt();
            simpan.nextLine();

            if (menu == 1) {
                char jawab;

                do {
                    System.out.println("\n=== PILIH JURUSAN ===");
                    System.out.println("1. Teknik Informatika");
                    System.out.println("2. Desain Komunikasi Visual");
                    System.out.println("3. Manajemen Bisnis Syariah");
                    System.out.println("4. Hukum");

                    System.out.print("Input pilihan: ");
                    int pilihan = simpan.nextInt();

                    if (pilihan == 1) {
                        jurusan = "Teknik Informatika";

                        // pilih Reg/kelas
                        System.out.println("\nPilih Kelas:");
                        System.out.println("1. Reg A");
                        System.out.println("2. Reg B");
                        System.out.println("3. Reg CK");
                        System.out.println("4. Reg CS");
                        System.out.print("Input kelas: ");
                        int pKelas = simpan.nextInt();

                        switch (pKelas) {
                            case 1: kelas = "Reg A"; break;
                            case 2: kelas = "Reg B"; break;
                            case 3: kelas = "Reg CK"; break;
                            case 4: kelas = "Reg CS"; break;
                            default: kelas = "Reg A";
                        }

                    } else if (pilihan == 2) {
                        jurusan = "Desain Komunikasi Visual";
                        kelas = "-";
                    } else if (pilihan == 3) {
                        jurusan = "Manajemen Bisnis Syariah";
                        kelas = "-";
                    } else if (pilihan == 4) {
                        jurusan = "Hukum";
                        kelas = "-";
                    } else {
                        jurusan = "Tidak tersedia";
                        kelas = "-";
                    }

                    System.out.print("\nGanti jurusan? (Y/N): ");
                    jawab = simpan.next().charAt(0);

                } while (jawab == 'Y' || jawab == 'y');

                ulangMenu = 1;

            } else if (menu == 2) {
                char edit;

                do {
                    System.out.println("\n=== BIODATA ===");

                    System.out.print("Input nama: ");
                    nama = simpan.nextLine();

                    System.out.print("Input umur: ");
                    umur = simpan.nextInt();
                    simpan.nextLine();

                    System.out.print("\nEdit lagi? (Y/N): ");
                    edit = simpan.next().charAt(0);
                    simpan.nextLine();

                } while (edit == 'Y' || edit == 'y');

                ulangMenu = 1;

            } else if (menu == 3) {

                // S4 (Output seperti TXT)
                System.out.println("\n=== DATA MAHASISWA ===");
                System.out.println("Nama    : " + nama);
                System.out.println("Umur    : " + umur);
                System.out.println("Jurusan : " + jurusan);
                System.out.println("Kelas   : " + kelas);

                ulangMenu = 1;

            } else if (menu == 0) {
                ulangMenu = 0;

            } else {
                System.out.println("Menu tidak tersedia");
                ulangMenu = 1;
            }

        } while (ulangMenu == 1);

        System.out.println("Program selesai");
        simpan.close();
    }
}