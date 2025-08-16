import java.util.ArrayList;
import java.util.Scanner;

// Kelas TransportationManager untuk mengelola sistem transportasi
// Implementasi ENCAPSULATION dengan data member private
public class TransportationManager {
    private ArrayList<Transportation> transportations; // array dimana saya menyimpan data transportasi
    private Scanner scanner;
    private int nextId;

    public TransportationManager() {
        transportations = new ArrayList<>();
        scanner = new Scanner(System.in);
        nextId = 1;
    }

    public void showMainMenu() {
        while (true) {
            System.out.println("\n=== SISTEM PEMESANAN TIKET TRANSPORTASI ===");
            System.out.println("1. Masukan Data Transportasi");
            System.out.println("2. Lihat Daftar Transportasi");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1-3): ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    addTransportation();
                    break;
                case 2:
                    displayTransportations();
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan sistem ini!");
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    // Method untuk menambah transportasi baru
    private void addTransportation() {
        System.out.println("\n=== MASUKAN DATA TRANSPORTASI ===");
        System.out.println("Pilih jenis transportasi:");
        System.out.println("1. Bus");
        System.out.println("2. Kereta");
        System.out.print("Pilih jenis (1-2): ");
        
        int vehicleType = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        if (vehicleType == 1) {
            addBus();
        } else if (vehicleType == 2) {
            addTrain();
        } else {
            System.out.println("Pilihan tidak valid!");
        }
    }

    // Method untuk menambah Bus
    private void addBus() {
        System.out.println("\nPilih tipe Bus:");
        System.out.println("1. Ekonomi");
        System.out.println("2. VIP");
        System.out.print("Pilih tipe (1-2): ");
        
        int busType = scanner.nextInt();
        scanner.nextLine();
        
        String type = "";
        if (busType == 1) {
            type = "Ekonomi";
        } else if (busType == 2) {
            type = "VIP";
        } else {
            System.out.println("Pilihan tidak valid!");
            return;
        }
        
        System.out.print("Masukkan kapasitas kursi: ");
        int capacity = scanner.nextInt();
        scanner.nextLine();
        
        // POLYMORPHISM: Membuat objek Bus dan menyimpannya sebagai Transportation
        Transportation bus = new Bus("B-" + String.format("%03d", nextId++), "Bus", type, capacity);
        transportations.add(bus);
        
        System.out.println("Bus " + type + " ditambahkan ke sistem.");
    }

    // Method untuk menambah Train
    private void addTrain() {
        System.out.println("\nPilih tipe Kereta:");
        System.out.println("1. Ekonomi");
        System.out.println("2. Eksekutif");
        System.out.println("3. Kereta Cepat");
        System.out.print("Pilih tipe (1-3): ");
        
        int trainType = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        String type = "";
        if (trainType == 1) {
            type = "Ekonomi";
        } else if (trainType == 2) {
            type = "Eksekutif";
        } else if (trainType == 3) {
            type = "Kereta Cepat";
        } else {
            System.out.println("Pilihan tidak valid!");
            return;
        }
        
        System.out.print("Masukkan jumlah gerbong: ");
        int carriages = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        System.out.print("Masukkan kapasitas per gerbong: ");
        int capacityPerCarriage = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        // POLYMORPHISM: Membuat objek Train dan menyimpannya sebagai Transportation
        Transportation train = new Train("T-" + String.format("%03d", nextId++), "Kereta", type, carriages, capacityPerCarriage);
        transportations.add(train);
        
        System.out.println("Kereta " + type + " ditambahkan ke sistem.");
    }

    // Method untuk menampilkan daftar transportasi
    private void displayTransportations() {
        if (transportations.isEmpty()) {
            System.out.println("\nBelum ada data transportasi!");
            return;
        }
        
        System.out.println("\nDaftar Transportasi:");
        
        // POLYMORPHISM: Menggunakan method getInfo() dari berbagai subclass
        for (Transportation t : transportations) {
            System.out.println(t.getInfo());
        }
        
        // Menghitung total kapasitas menggunakan POLYMORPHISM
        int totalCapacity = 0;
        for (Transportation t : transportations) {
            totalCapacity += t.getTotalCapacity();
        }
        
        System.out.println("Total Kapasitas Semua Transportasi: " + totalCapacity + " penumpang");
    }
}
