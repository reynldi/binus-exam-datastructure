public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;
    
    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    
    // Method untuk menambah node di akhir list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setPrevious(tail);
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }
    
    // Method untuk insert setelah angka tertentu
    public void insertAfter(int targetData, int newData) {
        Node current = head;
        
        while (current != null) {
            if (current.getData() == targetData) {
                Node newNode = new Node(newData);
                
                // Set pointers untuk newNode
                newNode.setNext(current.getNext());
                newNode.setPrevious(current);
                
                // Update next node's previous pointer
                if (current.getNext() != null) {
                    current.getNext().setPrevious(newNode);
                } else {
                    // Jika current adalah tail, update tail
                    tail = newNode;
                }
                
                // Update current node's next pointer
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
            if (head != null) {
                head.setPrevious(null);
            } else {
                // List menjadi kosong
                tail = null;
            }
            size--;
            System.out.println("Angka " + targetData + " berhasil dihapus!");
            return;
        }
        
        // Cari node yang akan dihapus
        Node current = head;
        while (current.getNext() != null) {
            if (current.getNext().getData() == targetData) {
                Node nodeToDelete = current.getNext();
                
                // Update next pointer
                current.setNext(nodeToDelete.getNext());
                
                // Update previous pointer dari next node
                if (nodeToDelete.getNext() != null) {
                    nodeToDelete.getNext().setPrevious(current);
                } else {
                    // Jika node yang dihapus adalah tail, update tail
                    tail = current;
                }
                
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
