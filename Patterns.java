public class TriPattern {
    public static void main(String[] args) {
        int size = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print(" ");
            }
            // Print the pattern
            System.out.print(".");
            System.out.println();
        }
        for (int i = 0; i < size; i++) {
            System.out.print(" ");
        }
        System.out.println(" / \\ ");
        for (int i = 0; i < size; i++) {
            System.out.print(" ");
        }
        System.out.println(" \\ / ");
    }
}
	
