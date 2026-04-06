package Latihan2;

import java.util.Scanner;

public class Latihan2 
{
    public static void main(String args[]) 
    {
        Scanner input = new Scanner(System.in);
        String nama, nim;

        System.out.print("input nama: ");
        nama = input.nextLine();

        System.out.print("input nim: ");
        nim = input.nextLine();


        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);

    }
}