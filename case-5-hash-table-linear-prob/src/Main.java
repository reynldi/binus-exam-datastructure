public class Main {
    public static void main(String[] args) {
        System.out.println("=== PROGRAM HASH TABLE LINEAR PROBING ===");
        System.out.println("Implementasi Linear Probing dengan ukuran tabel 7\n");
        
        // Membuat hash table dengan ukuran 7
        HashTable hashTable = new HashTable(7);
        
        // Array kendaraan sesuai study case
        String[] vehicles = {"Motor", "Mobil", "Bus", "Truk", "Kereta", "Sepeda", "Kapal"};
        
        System.out.println("Inserting kendaraan dengan urutan:");
        for (int i = 0; i < vehicles.length; i++) {
            System.out.print(vehicles[i]);
            if (i < vehicles.length - 1) {
                System.out.print(" → ");
            }
        }
        System.out.println("\n");
        
        // Insert semua kendaraan ke hash table
        System.out.println("=== PROSES INSERT ===");
        for (String vehicle : vehicles) {
            hashTable.insert(vehicle);
        }
        
        // Tampilkan hash table
        hashTable.display();
    }
}
