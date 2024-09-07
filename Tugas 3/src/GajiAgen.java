import java.util.Scanner;

public class GajiAgen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int penjualan = scanner.nextInt();
        int hargaPerItem = 50000;
        int gajiPokok = 500000;
        int totalGaji = gajiPokok;
        
        if (penjualan >= 40 && penjualan <= 80) {
            totalGaji += penjualan * hargaPerItem * 0.25; // Bonus 25% jika penjualan antara 40-80
        } else if (penjualan > 80) {
            totalGaji += penjualan * hargaPerItem * 0.35; // Bonus 35% jika penjualan lebih dari 80
        } else if (penjualan < 15) {
            totalGaji -= gajiPokok * 0.15; // Penalti 15% dari gaji pokok
            totalGaji -= (15 - penjualan) * hargaPerItem; // Penalti berdasarkan item kurang dari 15
        }

        totalGaji += penjualan * hargaPerItem * 0.10; // Bonus 10% dari penjualan

        System.out.println(totalGaji);
    }
}
