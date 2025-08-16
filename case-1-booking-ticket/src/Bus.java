// Kelas Bus yang mewarisi Transportation - Implementasi INHERITANCE
public class Bus extends Transportation {
    // ENCAPSULATION: Data member bersifat private
    private int seatCapacity;

    // Constructor yang memanggil constructor parent class
    public Bus(String id, String name, String type, int seatCapacity) {
        super(id, name, type); // Memanggil constructor parent class
        this.seatCapacity = seatCapacity;
    }

    // POLYMORPHISM: Override method abstract dari parent class
    @Override
    public int getTotalCapacity() {
        return seatCapacity;
    }

    // Getter untuk ENCAPSULATION
    public int getSeatCapacity() {
        return seatCapacity;
    }
}
