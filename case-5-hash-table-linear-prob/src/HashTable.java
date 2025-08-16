public class HashTable {
    private String[] table;
    private int size;
    private int capacity;
    
    public HashTable(int capacity) {
        this.capacity = capacity;
        this.table = new String[capacity];
        this.size = 0;
        
        // Initialize table with null values
        for (int i = 0; i < capacity; i++) {
            table[i] = null;
        }
    }
    
    // Hash function: sum of ASCII values modulo capacity
    private int hash(String key) {
        int hash = 0;
        for (char c : key.toCharArray()) {
            hash += (int) c;
        }
        return hash % capacity;
    }
    
    // Insert method using Linear Probing
    public void insert(String key) {
        if (size >= capacity) {
            System.out.println("Hash table penuh! Tidak bisa insert " + key);
            return;
        }
        
        int index = hash(key);
        int originalIndex = index;
        
        // Linear probing: check next slot if collision occurs
        while (table[index] != null) {
            System.out.println("Collision terjadi pada index " + index + " untuk key '" + key + "'");
            index = (index + 1) % capacity;
            
            // If we've checked all slots, table is full
            if (index == originalIndex) {
                System.out.println("Hash table penuh! Tidak bisa insert " + key);
                return;
            }
        }
        
        table[index] = key;
        size++;
        System.out.println("'" + key + "' berhasil diinsert pada index " + index);
    }
    
    // Display the hash table
    public void display() {
        System.out.println("\n=== HASH TABLE LINEAR PROBING ===");
        System.out.println("Index\t| Key");
        System.out.println("--------|--------");
        
        for (int i = 0; i < capacity; i++) {
            if (table[i] != null) {
                System.out.println(i + "\t| " + table[i]);
            } else {
                System.out.println(i + "\t| [null]");
            }
        }
        
        System.out.println("--------|--------");
        System.out.println("Size: " + size + "/" + capacity);
    }
}
