public class TriPattern {
    public static void main(String[] args) {
        int size = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print(" ");
            }
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




public class TriPattern1 {
    public static void main(String[] args) {
        int size = 3;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" /");
                System.out.print(" ");
            }
            System.out.print(" ");
            for (int j = 0; j <= i; j++) {
                System.out.print(" .");
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" \\");
                System.out.print(" ");
            }
            
            System.out.println();
        }
        for (int i = size - 1; i > 0; i--) {
            for (int j = 0; j < size - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("/ ");
                System.out.print(" ");
            }
            System.out.print(" ");
            for (int j = 0; j < i; j++) {
                System.out.print(". ");
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("\\ ");
                System.out.print(" ");
            }
            
            System.out.println();
        }
        for (int i = 1; i < size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            // Print slashes and dots in the middle
            for (int j = 0; j < size - i; j++) {
                System.out.print(" /");
                System.out.print(" ");
            }
            
            // Print dots
            System.out.print(" ");
            for (int j = 0; j < size - i; j++) {
                System.out.print(" .");
                System.out.print(" ");
	    }
            for (int j = 0; j < size - i; j++) {
                System.out.print(" \\");
                System.out.print(" ");
            }
            
            System.out.println();
        }
    }
}
	
