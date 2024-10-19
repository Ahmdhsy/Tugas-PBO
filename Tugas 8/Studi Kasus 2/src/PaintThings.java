import java.text.DecimalFormat;

public class PaintThings {
    public static void main(String[] args) {
        Paint paint = new Paint(350); // 1 gallon covers 350 square feet

        // Membuat objek Shape: persegi panjang, bola, dan silinder
        Shape deck = new Rectangle(20, 35);
        Shape bigBall = new Sphere(15);
        Shape tank = new Cylinder(10, 30);

        // Menghitung jumlah cat yang diperlukan untuk masing-masing bentuk
        double deckAmt = paint.amount(deck);
        double ballAmt = paint.amount(bigBall);
        double tankAmt = paint.amount(tank);

        // Menggunakan DecimalFormat untuk memformat hasil ke satu desimal
        DecimalFormat fmt = new DecimalFormat("0.#");

        // Menampilkan hasil perhitungan yang sudah diformat
        System.out.println("\nAmount of paint needed:");
        System.out.println("Deck: " + fmt.format(deckAmt));
        System.out.println("Big Ball: " + fmt.format(ballAmt));
        System.out.println("Tank: " + fmt.format(tankAmt));
    }
}
