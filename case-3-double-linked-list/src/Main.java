public class Main {
    public static void main(String[] args) {
        System.out.println("=== PROGRAM DOUBLY LINKED LIST ===");
        System.out.println("Implementasi operasi insert dan delete\n");
        
        // Membuat instance DoublyLinkedList
        DoublyLinkedList list = new DoublyLinkedList();
        
        // Contoh data
        int[] numbers = {43, 5, 9, 42, 6, 11, 41, 7, 13, 100, 12, 70, 24, 40, 36};
        
        // a. Insert semua angka ke Doubly Linked List dan tampilkan
        System.out.println("Case 1: Insert semua angka ke Doubly Linked List:");
        for (int number : numbers) {
            list.insertAtEnd(number);
        }
        list.display();
        System.out.println();
        
        // b. Insert angka 15 setelah angka 12
        System.out.println("Case 2: Insert angka 15 setelah angka 12:");
        list.insertAfter(12, 15);
        list.display();
        System.out.println();
        
        // c. Delete angka 41
        System.out.println("Case 3: Delete angka 41:");
        list.delete(41);
        list.display();
        System.out.println();
    }
}
