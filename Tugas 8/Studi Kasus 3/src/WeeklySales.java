import java.util.Arrays;
import java.util.Scanner;

public class WeeklySales {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How many salespersons do you want to enter? ");
        int numSalespersons = scan.nextInt();
        scan.nextLine(); // Membuang newline karakter setelah nextInt()

        // Membuat array SalesPerson dengan ukuran sesuai input pengguna
        SalesPerson[] salesStaff = new SalesPerson[numSalespersons];

        // Mengumpulkan data salesperson dari pengguna
        for (int i = 0; i < numSalespersons; i++) {
            System.out.print("Enter first name for salesperson " + (i + 1) + ": ");
            String firstName = scan.nextLine();
            System.out.print("Enter last name for salesperson " + (i + 1) + ": ");
            String lastName = scan.nextLine();
            System.out.print("Enter total sales for " + firstName + " " + lastName + ": ");
            int totalSales = scan.nextInt();
            scan.nextLine(); // Membuang newline karakter setelah nextInt()

            // Membuat objek SalesPerson dan menyimpannya dalam array
            salesStaff[i] = new SalesPerson(firstName, lastName, totalSales);
        }

        // Mengurutkan array SalesPerson berdasarkan penjualan menggunakan metode sort
        Arrays.sort(salesStaff);

        // Menampilkan hasil pengurutan
        System.out.println("\nSales staff in order of sales:");
        for (SalesPerson s : salesStaff) {
            System.out.println(s);
        }

        scan.close(); // Tutup scanner
    }
}
