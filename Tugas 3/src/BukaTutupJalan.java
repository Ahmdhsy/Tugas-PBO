import java.util.Scanner;

public class BukaTutupJalan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        // Menggabungkan plat nomor menjadi satu string tanpa spasi
        String gabunganPlat = input.replace(" ", "");
        
        // Konversi gabungan string ke angka
        long angkaPlat = Long.parseLong(gabunganPlat);
        
        // Cek apakah angka tersebut jika dikurangi 999999 kemudian dibagi 5 sisa bagi 0
        if (angkaPlat % 5 == 0) {
            System.out.println("berhenti");
        } else {
            System.out.println("jalan");
        }
    }
}

