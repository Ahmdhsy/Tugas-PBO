import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk membaca input dari pengguna.
        
        String[] strings = new String[3]; // Array untuk menyimpan String input.
        int[] integers = new int[3]; // Array untuk menyimpan integer input.

        // Mengumpulkan input terlebih dahulu
        for (int i = 0; i < 3; i++) { // Loop sebanyak 3 kali untuk membaca 3 baris input.
            strings[i] = scanner.next(); // Membaca sebuah String dari input dan menyimpannya di array.
            integers[i] = scanner.nextInt(); // Membaca sebuah bilangan bulat (integer) dari input dan menyimpannya di array.
        }

        System.out.println("================================"); // Mencetak garis pembatas di atas output.

        // Mencetak semua input yang telah disimpan dalam array
        for (int i = 0; i < 3; i++) {
            // Mencetak output dengan format:
            // %-15s -> String rata kiri dengan lebar 15 karakter.
            // %03d -> Bilangan bulat dengan 3 digit, menambahkan nol di depan jika kurang dari 3 digit.
            // %n -> Membuat baris baru setelah mencetak output.
            System.out.printf("%-15s%03d%n", strings[i], integers[i]);
        }
        
        System.out.println("================================"); // Mencetak garis pembatas di bawah output.
        
        scanner.close(); // Menutup scanner setelah selesai digunakan.
    }
}
