package src;

/**
 * @author Jamilu_Salisu_CST_19_SWE_00409
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
        for (int i=0;i<lower_matrix.length;i++) {
            for (int j=0;j<lower_matrix[i].length;j++) {
                System.out.print(lower_matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("\nUpper Triangular Matrix");
        for (int[] upper_matrix1 : upper_matrix) {
            for (int j = 0; j < upper_matrix1.length; j++) {
                System.out.print(upper_matrix1[j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("\nSum of Upper and Lower of a Triangular Matrix:");
        for (int i=0;i<array_size;i++) {
            int L_point = lower_matrix[i][lower_matrix[i].length-1];
            int U_point = upper_matrix[i][0];
            for (int j=0;j<lower_matrix[i].length;j++) {
                if (j==(lower_matrix[i].length)-1) {
                    System.out.print(L_point + U_point + " ");
                    break;
                }
                System.out.print(lower_matrix[i][j] + " ");
            }
            for (int k=1;k<upper_matrix[i].length;k++) {
                System.out.print(upper_matrix[i][k] + " ");
            }
            System.out.println();
        }
    }
}
