public abstract class Transportation {
    // ENCAPSULATION: Data member bersifat private untuk keamanan data
    private String id;
    private String name;
    private String type; // Jenis transportasi (Ekonomi, VIP, Eksekutif, Kereta Cepat)

    public Transportation(String id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    // Method abstrak untuk POLYMORPHISM - setiap subclass harus implement
    public abstract int getTotalCapacity();

    // Getter methods untuk ENCAPSULATION
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    // Method untuk menampilkan informasi transportasi
    public String getInfo() {
        return "Nama Transportasi: " + name + " " + type + ", Kapasitas: " + getTotalCapacity() + " penumpang";
    }
}
