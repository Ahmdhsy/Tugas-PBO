// Kelas Commission yang mewarisi dari Hourly
public class Commission extends Hourly {
    // Dua variabel instance tambahan
    private double totalSales;
    private double commissionRate;

    // Konstruktor yang menerima 6 parameter
    public Commission(String eName, String eAddress, String ePhone, String socSecNumber,
                      double rate, double commissionRate) {
        // Memanggil konstruktor dari kelas induk (Hourly)
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
        this.totalSales = 0;  // Inisialisasi totalSales ke 0
    }

    // Metode untuk menambahkan penjualan
    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }

    // Override metode pay untuk menghitung upah + komisi
    @Override
    public double pay() {
        // Memanggil metode pay dari kelas induk (Hourly) untuk menghitung upah berdasarkan jam kerja
        double payment = super.pay();
        // Menambahkan komisi berdasarkan total penjualan
        payment += totalSales * commissionRate;
        // Mengatur kembali totalSales ke 0 setelah pembayaran
        totalSales = 0;
        return payment;
    }

    // Override metode toString untuk menambahkan informasi total penjualan
    @Override
    public String toString() {
        // Memanggil toString dari kelas induk dan menambahkan informasi totalSales
        return super.toString() + "\nTotal Sales: " + totalSales;
    }
}
