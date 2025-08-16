import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== PROGRAM SEDERHANA BST ===");
        
        // Membuat instance BinarySearchTree
        BinarySearchTree bst = new BinarySearchTree();
        
        // Input node dari user dengan format comma-separated
        System.out.print("Masukkan angka-angka (pisahkan dengan koma): ");
        String input = scanner.nextLine();
        
        // Parse input string dan insert ke BST
        String[] numberStrings = input.split(",");
        System.out.println("Inserting nodes: " + input);
        
        for (String numberStr : numberStrings) {
            try {
                int number = Integer.parseInt(numberStr.trim());
                bst.insert(number);
            } catch (NumberFormatException e) {
                System.out.println("Warning: '" + numberStr.trim() + "' bukan angka yang valid, dilewati.");
            }
        }
        System.out.println();
        
        // Tampilkan informasi tree
        System.out.println("=== INFORMASI TREE ===");
        System.out.println("Jumlah node: " + bst.getSize());
        System.out.println("Height tree: " + bst.getHeight());
        System.out.println();
        
        // Search feature
        System.out.println("=== SEARCH ===");
        System.out.print("Masukkan angka yang ingin dicari: ");
        int searchNumber = scanner.nextInt();
        boolean found = bst.search(searchNumber);
        System.out.println("Angka " + searchNumber + " " + (found ? "ditemukan" : "tidak ditemukan") + " dalam tree");
        System.out.println();
        
        scanner.close();
    }
}
