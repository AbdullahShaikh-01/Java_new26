import java.util.Arrays;
import java.util.Scanner;

public class arrays_prac_day10 {

    // Practice Question 01!
    public static void main(String[] args) {
//        float [] nums = {23.5f, 34.5f, 56.7f, 23.5f, 98.9f};
//        float sum = 0;
//        for (int i = 0; i<nums.length; i++){
//            sum+=nums[i];
//        }
//        System.out.println("Total sum of arrays is: "+sum);


         //Practice Question 02!

        int [] num = {12,34,56,45};
        int target = 45;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == target) {
                System.out.println("Yes! Integer Present in array.");
                return;
            }
        }
                System.out.println("No! Integer Present in array.");


        // Practice Question 03!
        Scanner sc = new Scanner(System.in);

        int[] Physics = new int [4];
        System.out.println("Enter no: ");
        for (int i = 0; i<Physics.length; i++){
            Physics[i] = sc.nextInt();
        }
            int sum = 0;

                for (int marks: Physics){
                    sum+=marks;

            }
            int avg = sum/Physics.length;

            System.out.println("Total sum = "+sum);
            System.out.println("Total Average = "+avg);


         //Practice Question 04!

        int[][] matrix1 = {{4, 3, 6}, {6, 9, 4}};

        int[][] matrix2 = {{3, 1, 3}, {9, 4, 5}};

        int[][] result;
        result = new int[2][3];


        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];

            }
        }
        System.out.println("Result Matrix");

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");


            }
            System.out.println();
        }

         //Practice Question 05!
//
//        int[] arr = {34,45,34,56,45,98};
//        for (int i = arr.length - 1; i >= 0; i--){
//            System.out.println(arr[i]);
//        }

         //Practice Question 06!

        int[] arr = {23,67,34,29,99};

        int min = arr[0];
        for (int i=1; i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
            System.out.println("Minimum Element = "+min);



    }
}