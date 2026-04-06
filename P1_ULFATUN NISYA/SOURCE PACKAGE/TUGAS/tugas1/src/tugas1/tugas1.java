//ulfatun nisya
//tugas pengeluaran

package tugas1;
import java.util.Scanner;

public class tugas1
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double makan, transport, belanja;
        System.out.print("input biaya makan: ");
        makan = input.nextDouble();
        System.out.print("input biaya transport: ");
        transport = input.nextDouble();
        System.out.print("input biaya belanja: ");
        belanja = input.nextDouble();

        System.out.println("makan:" + makan);
        System.out.println("transport:" + transport);
        System.out.println("belanja:" + belanja);


        double total = hitungTotal(makan, transport, belanja);
        System.out.println("Total pengeluaran: " + total);

        System.out.println("Makan = (" + makan + " / " + total + ") x 100 = " + persen(makan, total) + "%");
        System.out.println("Transport = (" + transport + " / " + total + ") x 100 = " + persen(transport, total) + "%");
        System.out.println("Belanja = (" + belanja + " / " + total + ") x 100 = " + persen(belanja, total) + "%");

        input.close();

    }
    public static double hitungTotal(double makan, double transport, double belanja) {
        return makan + transport + belanja;
    }
    
    public static double persen(double biaya, double total) {
        return (biaya / total) * 100;
    }
}
