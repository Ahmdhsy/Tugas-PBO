public class SalesPerson implements Comparable<SalesPerson> {
    private String firstName;
    private String lastName;
    private int totalSales;

    // Konstruktor
    public SalesPerson(String first, String last, int sales) {
        this.firstName = first;
        this.lastName = last;
        this.totalSales = sales;
    }

    // Getter untuk totalSales
    public int getSales() {
        return totalSales;
    }

    // Getter untuk firstName
    public String getFirstName() {
        return firstName;
    }

    // Getter untuk lastName
    public String getLastName() {
        return lastName;
    }

    // Metode compareTo untuk membandingkan berdasarkan totalSales
    @Override
    public int compareTo(SalesPerson other) {
        // Pertama, bandingkan berdasarkan total sales
        if (this.totalSales != other.totalSales) {
            return this.totalSales - other.totalSales; // Mengembalikan selisih total sales
        } else {
            // Jika total sales sama, bandingkan berdasarkan nama belakang
            int lastNameComparison = this.lastName.compareTo(other.lastName);
            if (lastNameComparison != 0) {
                return lastNameComparison; // Mengembalikan hasil perbandingan nama belakang
            } else {
                // Jika nama belakang juga sama, bandingkan berdasarkan nama depan
                return this.firstName.compareTo(other.firstName);
            }
        }
    }

    // Metode toString untuk menampilkan informasi SalesPerson
    @Override
    public String toString() {
        return lastName + ", " + firstName + ": " + totalSales;
    }
}
