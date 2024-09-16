// package com.example;


// public class Jagged {
    

//     int nums[][]=new int[3][]; // jagged array: We don't specify or fix coulmn size
//     //we individually fix the coulmn size
//     nums[0]=new int[3];
//     nums[1]=new int[4];
//     nums[2]=new int[2];

//     for(int i=0;i<nums.length;i++)
//     {
//         for(int j=0;j<nums[i].length;j++)
//         {
//             System.out.print(nums[i][j]);
//         }
//         System.out.println();
//     }

// }

package com.example;

public class Jagged {

    // Declare the jagged array
    int nums[][] = new int[3][];

    // Instance initializer block to initialize the jagged array
    {
        // Initialize each row with different column sizes
        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[2];

        // Fill and display the jagged array
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = i + j; // Assign some values
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Main method to run the code
    public static void main(String[] args) {
        // Creating an instance will automatically trigger the instance initializer block
        new Jagged();
    }
}
