public class SingleLinkedList {
    private Node head;
    private int size;
    
    public SingleLinkedList() {
        this.head = null;
        this.size = 0;
    }
    
    // Method untuk menambah node di akhir list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
    }
    
    // Method untuk insert setelah angka tertentu
    public void insertAfter(int targetData, int newData) {
        Node current = head;
        
        while (current != null) {
            if (current.getData() == targetData) {
                Node newNode = new Node(newData);
                newNode.setNext(current.getNext());
                current.setNext(newNode);
                size++;
                System.out.println("Angka " + newData + " berhasil diinsert setelah angka " + targetData);
                return;
            }
            current = current.getNext();
        }
        System.out.println("Angka " + targetData + " tidak ditemukan!");
    }
    
    // Method untuk delete angka tertentu
    public void delete(int targetData) {
        if (head == null) {
            System.out.println("List kosong!");
            return;
        }
        
        // Jika head yang akan dihapus
        if (head.getData() == targetData) {
            head = head.getNext();
            size--;
            System.out.println("Angka " + targetData + " berhasil dihapus!");
            return;
        }
        
        // Cari node yang akan dihapus
        Node current = head;
        while (current.getNext() != null) {
            if (current.getNext().getData() == targetData) {
                current.setNext(current.getNext().getNext());
                size--;
                System.out.println("Angka " + targetData + " berhasil dihapus!");
                return;
            }
            current = current.getNext();
        }
        
        System.out.println("Angka " + targetData + " tidak ditemukan!");
    }
    
    // Method untuk menampilkan semua data
    public void display() {
        if (head == null) {
            System.out.println("List kosong!");
            return;
        }
        
        System.out.print("Data: ");
        Node current = head;
        while (current != null) {
            System.out.print(current.getData());
            if (current.getNext() != null) {
                System.out.print(" -> ");
            }
            current = current.getNext();
        }
        System.out.println();
        System.out.println("Jumlah node: " + size);
    }
    
    // Getter untuk size
    public int getSize() {
        return size;
    }
}
