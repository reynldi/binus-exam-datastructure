
public class Main {
    public static void main(String[] args) {
        System.out.println("=== PROGRAM SINGLE LINKED LIST ===");
        System.out.println("Implementasi operasi insert dan delete\n");
        
        // Membuat instance SingleLinkedList
        SingleLinkedList list = new SingleLinkedList();
        
        // Array angka sesuai study case
        int[] numbers = {43, 5, 9, 42, 6, 40, 36, 16, 35, 14, 30, 25, 11, 41, 7, 13, 100, 12, 70, 24};
        
        // a. Insert semua angka ke Single Linked List dan tampilkan
        System.out.println("Case 1:Insert semua angka ke Single Linked List:");
        for (int number : numbers) {
            list.insertAtEnd(number);
        }
        list.display();
        System.out.println();
        
        // b. Insert angka 66 setelah angka 16
        System.out.println("Case 2: Insert angka 66 setelah angka 16:");
        list.insertAfter(16, 66);
        list.display();
        System.out.println();
        
        // c. Delete angka 100
        System.out.println("Case 3: Delete angka 100:");
        list.delete(100);
        list.display();
        System.out.println();
    }
}
