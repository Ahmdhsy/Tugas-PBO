import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many strings do you want to sort?");
        int numItems = scan.nextInt();
        scan.nextLine(); // Membuang newline karakter setelah nextInt()

        // Membaca array dari String
        String[] strings = new String[numItems];
        System.out.println("Enter the strings:");

        for (int i = 0; i < numItems; i++) {
            strings[i] = scan.nextLine();  // Membaca setiap string dari input
        }

        // Mengurutkan array menggunakan Insertion Sort
        Sorting.insertionSort(strings);  // Menggunakan insertionSort sebagai yang diminta

        // Menampilkan array yang telah diurutkan
        System.out.println("Your strings in sorted order...");
        for (String str : strings) {
            System.out.println(str);
        }

        scan.close(); // Tutup scanner
    }
}
