import java.math.BigInteger;
import java.util.Scanner;

public class BigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membaca dua angka besar dari input
        BigInteger a = new BigInteger(scanner.nextLine());
        BigInteger b = new BigInteger(scanner.nextLine());
        
        // Menghitung penjumlahan
        BigInteger sum = a.add(b);
        
        // Menghitung perkalian
        BigInteger product = a.multiply(b);
        
        // Menampilkan hasil
        System.out.println(sum);
        System.out.println(product);
    }
}
