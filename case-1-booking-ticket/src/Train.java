// Kelas Train yang mewarisi Transportation - Implementasi INHERITANCE
public class Train extends Transportation {
    // ENCAPSULATION: Data member bersifat private
    private int numberOfCarriages;
    private int capacityPerCarriage;

    // Constructor yang memanggil constructor parent class
    public Train(String id, String name, String type, int numberOfCarriages, int capacityPerCarriage) {
        super(id, name, type); // Memanggil constructor parent class
        this.numberOfCarriages = numberOfCarriages;
        this.capacityPerCarriage = capacityPerCarriage;
    }

    // POLYMORPHISM: Override method abstract dari parent class
    @Override
    public int getTotalCapacity() {
        return numberOfCarriages * capacityPerCarriage;
    }

    // Getter methods untuk ENCAPSULATION
    public int getNumberOfCarriages() {
        return numberOfCarriages;
    }

    public int getCapacityPerCarriage() {
        return capacityPerCarriage;
    }
}
