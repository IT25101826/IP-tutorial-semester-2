public class ArrayAddition {
    public static void main(String[] args) {

        // Declare and initialize arrays A and B
        int[] A = {10, 20, 30, 40, 50};
        int[] B = {34, 67, 12, 89, 12};

        // Declare array C
        int[] C = new int[5];

        // Add corresponding elements of A and B
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i] + B[i];
        }

        // Display array C
        System.out.print("Array C: [");
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i]);
            if (i < C.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
