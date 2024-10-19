import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers do you want to sort?");
        int numItems = scan.nextInt();

        // Membaca array dari Integer (autoboxing dari int)
        Integer[] numbers = new Integer[numItems];
        System.out.println("Enter the numbers:");

        for (int i = 0; i < numItems; i++) {
            numbers[i] = scan.nextInt();  // Autoboxing dari int ke Integer
        }

        // Mengurutkan array menggunakan Insertion Sort
        Sorting.insertionSort(numbers);

        // Menampilkan array yang telah diurutkan
        System.out.println("Your numbers in sorted order...");
        for (int i = 0; i < numItems; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        scan.close(); // Tutup scanner
    }
}
