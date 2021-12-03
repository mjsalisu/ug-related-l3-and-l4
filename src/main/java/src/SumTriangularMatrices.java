package src;

/**
 * @author Jamilusalism
 */

class SumTriangularMatrices {
    public static void main (String [] agrs) {
        int array_size = 6;
        
        int[][] lower_matrix = {
            {60}, 
            {61, 62}, 
            {63, 64, 65}, 
            {66, 67, 68, 69}, 
            {70, 71, 72, 73, 74}, 
            {75, 76, 77, 78, 79, 80}, 
        };
        
        //upper_matrix
        int[][] upper_matrix = {
            {1, 2, 3,  4,  5, 6},
            {7, 8, 9,  10,  11},
            {12, 13, 14, 15},
            {16, 17, 18},
            {19, 20},
            {21},
        };
        
        System.out.println("Lower Triangular Matrix:");
        for (int[] lower : lower_matrix) {
            for (int i = 0; i < lower.length; i++) {
                System.out.print(lower[i] + " ");
            }
            System.out.println();
        }
        
        System.out.println("\nUpper Triangular Matrix");
        for (int[] upper : upper_matrix) {
            for (int i = 0; i < upper.length; i++) {
                System.out.print(upper[i] + " ");
            }
            System.out.println();
        }
        
        System.out.println("\nSum of Upper and Lower of a Triangular Matrix:");
        for (int i = 0; i < array_size; i++) {
            int lower_diagonal = lower_matrix[i][lower_matrix[i].length-1];
            int upper_diagonal = upper_matrix[i][0];
            
            for (int j = 0; j < lower_matrix[i].length; j++) {
                if (j == (lower_matrix[i].length)-1) {
                    System.out.print(lower_diagonal + upper_diagonal + " ");
                    break;
                }
                System.out.print(lower_matrix[i][j] + " ");
            }
            for (int k = 1; k <upper_matrix[i].length; k++) {
                System.out.print(upper_matrix[i][k] + " ");
            }
            System.out.println();
        }
    }
}
