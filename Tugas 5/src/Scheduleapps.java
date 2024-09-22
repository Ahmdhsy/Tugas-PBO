import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Mahasiswa {
    private String nama;
    private String nim;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public void infoCivitas() {
        System.out.println("Nama: " + nama + ", NIM: " + nim);
    }
}

class Dosen {
    private String nama;
    private String nip;

    public Dosen(String nama, String nip) {
        this.nama = nama;
        this.nip = nip;
    }

    public String getNama() {
        return this.nama;
    }

    public String getNip() {
        return this.nip;
    }

    public void infoCivitas() {
        System.out.println("Nama: " + this.nama + ", NIP: " + this.nip);
    }
}

class Kelas {
    private String namaKelas;

    public Kelas(String namaKelas) {
        this.namaKelas = namaKelas;
    }

    public String getNamaKelas() {
        return namaKelas;
    }
}

class Ruangan {
    private String namaRuangan;

    public Ruangan(String namaRuangan) {
        this.namaRuangan = namaRuangan;
    }

    public String getNamaRuangan() {
        return namaRuangan;
    }
}

class MataKuliah {
    private String namaMataKuliah;

    public MataKuliah(String namaMataKuliah) {
        this.namaMataKuliah = namaMataKuliah;
    }

    public String getNamaMataKuliah() {
        return namaMataKuliah;
    }
}

class Hari {
    private String hari;
    public Hari(String hari) {
        this.hari = hari;
    }

    public String getHari() {
        return this.hari;
    }
}

class Jadwal {
    private Kelas kelas;
    private Ruangan ruangan;
    private MataKuliah mataKuliah;
    private Hari hari;
    private Dosen dosen;

        public Jadwal(Kelas kelas, Ruangan ruangan, MataKuliah mataKuliah, Hari hari, Dosen dosen) {
            this.kelas = kelas;
            this.ruangan = ruangan;
            this.mataKuliah = mataKuliah;
            this.hari = hari;
            this.dosen = dosen;
        }
    
        public Hari getHari() {
            return this.hari;
        }

        public MataKuliah getMataKuliah() {
            return this.mataKuliah;
        }
    
        public Ruangan getRuangan() {
            return this.ruangan;
        }
    
        public Dosen getDosen() {
            return this.dosen;
        }
    

        public void tampilkanJadwal() {
            System.out.println(hari.getHari() + ": " + mataKuliah.getNamaMataKuliah() + " - " +
                               ruangan.getNamaRuangan() + " - " + dosen.getNama());
        }
    }


public class Scheduleapps {
    public static void main(String[] args) {
        // Membuat list mahasiswa dan dosen
        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        List<Dosen> dosenList = new ArrayList<>();
        // Menambahkan data mahasiswa
        mahasiswaList.add(new Mahasiswa("Ahmad", "231511001"));
        mahasiswaList.add(new Mahasiswa("Alya", "231511002"));
        mahasiswaList.add(new Mahasiswa("Alanna", "231511003"));
        mahasiswaList.add(new Mahasiswa("Azka", "231511004"));
        mahasiswaList.add(new Mahasiswa("Bandyaga", "231511005"));
        mahasiswaList.add(new Mahasiswa("Farhan", "231511006"));
        mahasiswaList.add(new Mahasiswa("Dwika", "231511007"));
        mahasiswaList.add(new Mahasiswa("Hanif", "231511008"));
        mahasiswaList.add(new Mahasiswa("Radja", "231511009"));
        mahasiswaList.add(new Mahasiswa("Zidan", "231511010"));

        // Menambahkan data dosen
        dosenList.add(new Dosen("Yudi Widhiyasana", "KO013N"));
        dosenList.add(new Dosen("Santi Sundari", "KO009N"));
        dosenList.add(new Dosen("Trisna Gelar A", "KO078N"));
        dosenList.add(new Dosen("Ade Hodijah", "KO060N"));
        dosenList.add(new Dosen("Muhammad Rizqi S", "KO074N"));
        dosenList.add(new Dosen("Bambang Wisnuadhi", "KO003N"));
        dosenList.add(new Dosen("Wendi Wirasta", "KO079N"));
        dosenList.add(new Dosen("Didik Suwito Pribadi", "KO005N"));
        dosenList.add(new Dosen("Ade Chandra Nugraha", "KO001N"));
        dosenList.add(new Dosen("Zulkifli Arsyad", "KO061N"));
        dosenList.add(new Dosen("Siti Dwi Setiarini", "KO075N"));
        dosenList.add(new Dosen("Yadhi Aditya P.", "KO052N"));

        // Membuat jadwal perkuliahan untuk kelas 2B-D3
        List<Jadwal> jadwalList = new ArrayList<>();

        // Senin
        jadwalList.add(new Jadwal(new Kelas("2B-D3"), new Ruangan("D105-Kelas"), new MataKuliah("Komputer Grafik Teori"), new Hari("Senin"), dosenList.get(0)));
        jadwalList.add(new Jadwal(new Kelas("2B-D3"), new Ruangan("D105-Kelas"), new MataKuliah("PRPL"), new Hari("Senin"), dosenList.get(1)));
        jadwalList.add(new Jadwal(new Kelas("2B-D3"), new Ruangan("D102-Lab. MT"), new MataKuliah("Komputer Grafik Praktek"), new Hari("Senin"), dosenList.get(2)));

        // Selasa
        jadwalList.add(new Jadwal(new Kelas("2B-D3"), new Ruangan("D106-Lab. SDB"), new MataKuliah("Basis Data Praktek"), new Hari("Selasa"), dosenList.get(3)));
        jadwalList.add(new Jadwal(new Kelas("2B-D3"), new Ruangan("D101-Kelas"), new MataKuliah("Aljabar Linear"), new Hari("Selasa"), dosenList.get(4)));

        // Rabu
        jadwalList.add(new Jadwal(new Kelas("2B-D3"), new Ruangan("D116-Lab. PjBL-2"), new MataKuliah("Proyek 3"), new Hari("Rabu"), dosenList.get(5)));
        jadwalList.add(new Jadwal(new Kelas("2B-D3"), new Ruangan("D116-Lab. PjBL-2"), new MataKuliah("Proyek 3"), new Hari("Rabu"), dosenList.get(6)));
        jadwalList.add(new Jadwal(new Kelas("2B-D3"), new Ruangan("D116-Lab. PjBL-2"), new MataKuliah("Proyek 3"), new Hari("Rabu"), dosenList.get(7)));

        // Kamis
        jadwalList.add(new Jadwal(new Kelas("2B-D3"), new Ruangan("D105-Kelas"), new MataKuliah("Basis Data Teori"), new Hari("Kamis"), dosenList.get(8)));
        jadwalList.add(new Jadwal(new Kelas("2B-D3"), new Ruangan("D105-Kelas"), new MataKuliah("PBO Teori"), new Hari("Kamis"), dosenList.get(9)));
        jadwalList.add(new Jadwal(new Kelas("2B-D3"), new Ruangan("D116-Lab. PjBL-2"), new MataKuliah("PBO Praktek"), new Hari("Kamis"), dosenList.get(9)));

        // Jumat
        jadwalList.add(new Jadwal(new Kelas("2B-D3"), new Ruangan("D116-Lab. PjBL-2"), new MataKuliah("PRPL"), new Hari("Jumat"), dosenList.get(11)));

        // Membuat scanner untuk input pengguna
        Scanner scanner = new Scanner(System.in);
        int pilihan = 0;

        // Menu interaktif
        do {
            System.out.println("\n=== Menu Akademik ===");
            System.out.println("1. Tampilkan Data Mahasiswa");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Tampilkan Jadwal Perkuliahan");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("\nData Mahasiswa:");
                    for (Mahasiswa m : mahasiswaList) {
                        m.infoCivitas();
                    }
                    break;

                case 2:
                    System.out.println("\nData Dosen:");
                    for (Dosen d : dosenList) {
                        d.infoCivitas();
                    }
                    break;

                case 3:
                    // Memilih hari dari Senin hingga Jumat
                    System.out.println("\nPilih Hari:");
                    System.out.println("1. Senin");
                    System.out.println("2. Selasa");
                    System.out.println("3. Rabu");
                    System.out.println("4. Kamis");
                    System.out.println("5. Jumat");
                    System.out.print("Masukkan nomor hari: ");
                    int pilihanHari = scanner.nextInt();
                
                    // Menentukan hari yang dipilih
                    String hariDipilih = "";
                    switch (pilihanHari) {
                        case 1:
                            hariDipilih = "Senin";
                            break;
                        case 2:
                            hariDipilih = "Selasa";
                            break;
                        case 3:
                            hariDipilih = "Rabu";
                            break;
                        case 4:
                            hariDipilih = "Kamis";
                            break;
                        case 5:
                            hariDipilih = "Jumat";
                            break;
                        default:
                            System.out.println("Pilihan hari tidak valid.");
                            continue;
                    }
                
                    // Header tabel
                    System.out.println("\nJadwal Perkuliahan untuk Hari " + hariDipilih + ":");
                    System.out.println("+------------------------+--------------------------------+------------------+--------------------------+");
                    System.out.println("|            Hari        |           Mata Kuliah          |      Ruangan     |        Nama Dosen        |");
                    System.out.println("+------------------------+--------------------------------+------------------+--------------------------+");

                    // Menampilkan jadwal sesuai dengan hari yang dipilih
                    boolean jadwalDitemukan = false;
                    for (Jadwal j : jadwalList) {
                        if (j.getHari().getHari().equals(hariDipilih)) {
                            System.out.printf("| %-22s | %-30s | %-16s | %-24s |\n",
                                    j.getHari().getHari(),
                                    ((MataKuliah) j.getMataKuliah()).getNamaMataKuliah(),
                                    ((Ruangan) j.getRuangan()).getNamaRuangan(),
                                    ((Dosen) j.getDosen()).getNama());
                            jadwalDitemukan = true;
                        }
                    }
                
                    // Jika tidak ada jadwal ditemukan
                    if (!jadwalDitemukan) {
                        System.out.println("| Tidak ada jadwal untuk hari " + hariDipilih + "                       |");
                    }
                
                    // Footer tabel
                    System.out.println("+------------------------+--------------------------------+------------------+--------------------------+");
                    break;
                
                

                case 0:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }

        } while (pilihan != 0);

        scanner.close();
    }
}