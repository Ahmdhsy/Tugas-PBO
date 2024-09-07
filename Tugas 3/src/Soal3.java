import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk membaca input dari pengguna.

        // Membaca input dari pengguna
        int A = scanner.nextInt(); // Membaca bilangan A
        char operator = scanner.next().charAt(0); // Membaca operator matematika (+, -, *, /, %)
        int B = scanner.nextInt(); // Membaca bilangan B

        int result = 0; // Variabel untuk menyimpan hasil operasi

        // Menggunakan switch untuk menentukan operasi berdasarkan operator yang diberikan
        switch (operator) {
            case '+':
                result = A + B; // Penjumlahan
                break;
            case '-':
                result = A - B; // Pengurangan
                break;
            case '*':
                result = A * B; // Perkalian
                break;
            case '/':
                result = A / B; // Pembagian
                break;
            case '%':
                result = A % B; // Sisa hasil bagi
                break;
            default:
                System.out.println("Operator tidak valid"); // Jika operator tidak valid
                return;
        }

        // Mencetak hasil dari operasi
        System.out.println(result);

        scanner.close(); // Menutup scanner setelah selesai digunakan.
    }
}
