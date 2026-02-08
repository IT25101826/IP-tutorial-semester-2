public class IP_tutorial_Lab4 {
    public static void main(String[] args) {
		
		 System.out.println();

        System.out.println("Using while loop");

        int i = 1;
        while (i <= 5) {
            int j = 1;
            while (j <= 5) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }

        
        System.out.println();


        System.out.println("Using for loop");

        for (int row = 1; row <= 5; row++) {
            // Print leading spaces
            for (int space = 5; space > row; space--) {
                System.out.print(" ");
            }
            // Print stars
            for (int star = 1; star <= row; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
