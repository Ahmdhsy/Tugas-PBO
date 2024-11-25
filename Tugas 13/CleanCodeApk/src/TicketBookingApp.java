import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TicketBookingApp {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Ticket> ticketList = new ArrayList<>();
    private static final Logger logger = Logger.getLogger(TicketBookingApp.class.getName());

    public static void main(String[] args) {
        while (true) {
            displayMenu();
            int menuChoice = getUserInputInt("Pilih: ");

            switch (menuChoice) {
                case 1 -> bookTicket();
                case 2 -> viewTickets();
                case 3 -> cancelTicket();
                case 4 -> {
                    logger.log(Level.INFO, "Keluar aplikasi.");
                    return;
                }
                default -> logger.log(Level.WARNING, "Pilihan salah!");
            }
        }
    }

    private static void displayMenu() {
        logger.log(Level.INFO, "\n--- Menu ---");
        logger.log(Level.INFO, "1. Pesan Tiket");
        logger.log(Level.INFO, "2. Lihat Tiket");
        logger.log(Level.INFO, "3. Batalkan Tiket");
        logger.log(Level.INFO, "4. Keluar");
    }

    private static void bookTicket() {
        logger.log(Level.INFO, "=== Pesan Tiket ===");

        String departure = getUserInputString("Keberangkatan: ");
        String destination = getUserInputString("Tujuan: ");

        logger.log(Level.INFO, "Kelas Kereta:");
        logger.log(Level.INFO, "1. Ekonomi Premium");
        logger.log(Level.INFO, "2. Bisnis");
        logger.log(Level.INFO, "3. Eksekutif");
        int trainClass = getUserInputInt("Pilih: ");

        double ticketPrice = getTicketPrice(trainClass);
        if (ticketPrice == 0) {
            logger.log(Level.WARNING, "Pilihan kelas tidak valid.");
            return;
        }

        int seatCount = getUserInputInt("Jumlah kursi: ");
        double totalPrice = ticketPrice * seatCount;

        logger.log(Level.INFO, "Total: {0}", totalPrice);
        double payment = getUserInputDouble("Bayar: ");

        if (payment < totalPrice) {
            logger.log(Level.WARNING, "Uang kurang!");
            return;
        }

        ticketList.add(new Ticket(departure, destination, trainClass, seatCount, totalPrice));
        logger.log(Level.INFO, "Tiket berhasil dipesan.");
    }

    private static void viewTickets() {
        logger.log(Level.INFO, "=== Tiket ===");
        if (ticketList.isEmpty()) {
            logger.log(Level.INFO, "Belum ada tiket.");
        } else {
            for (Ticket ticket : ticketList) {
                logger.log(Level.INFO, ticket.toString());
            }
        }
    }

    private static void cancelTicket() {
        logger.log(Level.INFO, "=== Batalkan Tiket ===");
        int ticketId = getUserInputInt("Masukkan ID tiket: ");
        Optional<Ticket> ticketToRemove = ticketList.stream()
                .filter(ticket -> ticket.getId() == ticketId)
                .findFirst();

        if (ticketToRemove.isPresent()) {
            ticketList.remove(ticketToRemove.get());
            logger.log(Level.INFO, "Tiket berhasil dibatalkan.");
        } else {
            logger.log(Level.WARNING, "ID tiket tidak valid.");
        }
    }

    private static double getTicketPrice(int trainClass) {
        return switch (trainClass) {
            case 1 -> 50000;
            case 2 -> 100000;
            case 3 -> 150000;
            default -> 0;
        };
    }

    private static String getUserInputString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    private static int getUserInputInt(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.println("Input harus berupa angka. Coba lagi.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static double getUserInputDouble(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.println("Input harus berupa angka desimal. Coba lagi.");
            scanner.next();
        }
        return scanner.nextDouble();
    }
}

class Ticket {
    private final int id;
    private final String departure;
    private final String destination;
    private final int trainClass;
    private final int seatCount;
    private final double totalPrice;
    private static int counter = 1;

    public Ticket(String departure, String destination, int trainClass, int seatCount, double totalPrice) {
        this.id = counter++;
        this.departure = departure;
        this.destination = destination;
        this.trainClass = trainClass;
        this.seatCount = seatCount;
        this.totalPrice = totalPrice;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Dari: %s, Ke: %s, Kelas: %d, Kursi: %d, Total: %.2f",
                id, departure, destination, trainClass, seatCount, totalPrice);
    }
}
