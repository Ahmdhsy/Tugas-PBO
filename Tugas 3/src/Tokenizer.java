import java.util.Scanner;

public class Tokenizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk membaca input dari pengguna
        String s = scanner.nextLine();            // Membaca satu baris input dari pengguna dan menyimpannya dalam variabel s
        scanner.close();                          // Menutup objek Scanner untuk membebaskan sumber daya

        // Menggunakan regex untuk memisahkan string berdasarkan karakter non-alfabet
        String[] tokens = s.split("[^A-Za-z]+");  // Memisahkan string s menjadi array tokens, dengan delimiter berupa karakter non-alfabet

        // Menghitung jumlah token yang valid (token yang bukan string kosong)
        int count = 0;                            // Inisialisasi variabel count untuk menghitung jumlah token
        for (String token : tokens) {             // Melakukan iterasi pada setiap elemen di array tokens
            if (!token.isEmpty()) {               // Mengecek apakah token tidak kosong
                count++;                          // Jika token valid (tidak kosong), increment count
            }
        }

        // Mencetak jumlah token
        System.out.println(count);                // Mencetak jumlah token yang valid

        // Mencetak setiap token yang valid
        for (String token : tokens) {             // Iterasi lagi pada setiap elemen di array tokens
            if (!token.isEmpty()) {               // Mengecek apakah token tidak kosong
                System.out.println(token);        // Mencetak token yang valid (tidak kosong)
            }
        }
    }
}
