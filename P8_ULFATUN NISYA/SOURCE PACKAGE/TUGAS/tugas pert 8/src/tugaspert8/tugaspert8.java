package tugaspert8;

import java.util.Scanner;

public class tugaspert8 
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int menu;
        int maxHari = 21;
        int hadir = 0;
        int sakit = 0;
        int absen = 0;
        double persen = 0;

        double tugas = 0, uts = 0, uas = 0, total = 0;

        String nama, nim;

        // Input Data Mahasiswa
        System.out.println("=== INPUT DATA MAHASISWA ===");
        System.out.print("Nama : ");
        nama = input.nextLine();
        System.out.print("NIM  : ");
        nim = input.nextLine();

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Input Kehadiran");
            System.out.println("2. Cetak Data");
            System.out.print("Pilih menu: ");
            menu = input.nextInt();

            switch (menu) {

                case 1:
                    hadir = 0;
                    sakit = 0;
                    absen = 0;

                    // Input kehadiran per pertemuan
                    for (int i = 1; i <= maxHari; i++) {
                        System.out.println("\nPertemuan ke-" + i);
                        System.out.println("1. Hadir");
                        System.out.println("2. Sakit");
                        System.out.println("3. Absen");
                        System.out.print("Pilih: ");
                        int pilih = input.nextInt();

                        if (pilih == 1) {
                            hadir++;
                        } else if (pilih == 2) {
                            sakit++;

                            // aturan sakit (bisa dihitung hadir / tidak)
                            System.out.print("Sakit dihitung hadir? (y/t): ");
                            char opsi = input.next().charAt(0);

                            if (opsi == 'y' || opsi == 'Y') {
                                hadir++;
                            }

                        } else if (pilih == 3) {
                            absen++; // otomatis tidak hadir
                        } else {
                            System.out.println("Pilihan tidak valid!");
                            i--; // ulangi input
                        }
                    }

                    // Hitung persentase
                    persen = (hadir / (double) maxHari) * 100;

                    // Cek kelulusan
                    if (persen < 70) {
                        System.out.println("\nKehadiran kurang dari 70% (" + persen + "%)");
                        System.out.println("Status: TIDAK LULUS");
                    } else {
                        System.out.println("\nKehadiran memenuhi syarat (" + persen + "%)");
                        System.out.println("Status: LULUS");

                        // Input nilai hanya jika lulus kehadiran
                        System.out.print("Nilai Tugas : ");
                        tugas = input.nextDouble();
                        System.out.print("Nilai UTS   : ");
                        uts = input.nextDouble();
                        System.out.print("Nilai UAS   : ");
                        uas = input.nextDouble();

                        total = (tugas * 0.3) + (uts * 0.3) + (uas * 0.4);

                        System.out.println("Total Nilai: " + total);
                    }
                    break;

                case 2:
                    System.out.println("\n=== DATA MAHASISWA ===");
                    System.out.println("Nama       : " + nama);
                    System.out.println("NIM        : " + nim);
                    System.out.println("Hadir      : " + hadir);
                    System.out.println("Sakit      : " + sakit);
                    System.out.println("Absen      : " + absen);
                    System.out.println("Persentase : " + persen + "%");

                    if (persen >= 70) {
                        System.out.println("Status     : LULUS");
                    } else {
                        System.out.println("Status     : TIDAK LULUS");
                    }

                    System.out.println("Total Nilai: " + total);
                    break;

                default:
                    System.out.println("Menu tidak tersedia!");
            }

        } while (menu != 2);

        input.close();
    }
}