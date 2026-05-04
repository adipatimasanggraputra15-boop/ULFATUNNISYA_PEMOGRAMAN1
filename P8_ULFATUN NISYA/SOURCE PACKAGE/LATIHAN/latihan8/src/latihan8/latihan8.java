package latihan8;

import java.util.Scanner;

public class latihan8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int menu;
        int hadir = 0;
        int totalPertemuan = 21;
        double persen;

        // nilai tambahan
        double tugas, uts, uas, nilaiAkhir;

        do {
            // S1: Menu
            System.out.println("\n=== MENU ===");
            System.out.println("1. Input Data Mahasiswa");
            System.out.println("2. Keluar");
            System.out.print("Pilih: ");
            menu = input.nextInt();

            switch (menu) {

                case 1:
                    hadir = 0;

                    // S2: Input Kehadiran
                    for (int i = 1; i <= totalPertemuan; i++) {
                        System.out.print("Pertemuan ke-" + i + " (1=Hadir, 0=Tidak): ");
                        int nilai = input.nextInt();

                        if (nilai == 1) {
                            hadir++;
                        }
                    }

                    persen = (hadir / (double) totalPertemuan) * 100;

                    // S3: Ulang jika < 75%
                    while (persen < 75) {
                        System.out.println("\nKehadiran kurang dari 75% (" + persen + "%)");
                        System.out.println("Silakan input ulang!\n");

                        hadir = 0;

                        for (int i = 1; i <= totalPertemuan; i++) {
                            System.out.print("Pertemuan ke-" + i + " (1=Hadir, 0=Tidak): ");
                            int nilai = input.nextInt();

                            if (nilai == 1) {
                                hadir++;
                            }
                        }

                        persen = (hadir / (double) totalPertemuan) * 100;
                    }

                    // Input nilai tambahan (pengembangan)
                    System.out.print("\nInput Nilai Tugas : ");
                    tugas = input.nextDouble();

                    System.out.print("Input Nilai UTS   : ");
                    uts = input.nextDouble();

                    System.out.print("Input Nilai UAS   : ");
                    uas = input.nextDouble();

                    // Hitung nilai akhir
                    nilaiAkhir = (tugas * 0.3) + (uts * 0.3) + (uas * 0.4);

                    // S4: Output
                    System.out.println("\n=== HASIL ===");
                    System.out.println("Total Hadir     : " + hadir);
                    System.out.println("Persentase      : " + persen + "%");
                    System.out.println("Nilai Akhir     : " + nilaiAkhir);

                    if (nilaiAkhir >= 75) {
                        System.out.println("Status          : LULUS");
                    } else {
                        System.out.println("Status          : TIDAK LULUS");
                    }

                    break;

                case 2:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Menu tidak tersedia!");
            }

        } while (menu != 2);

        input.close();
    }
}