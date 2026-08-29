import java.util.Scanner;



//        int[] arr = {12, 34, 56, 78, 98};
//        int target = 100;
//        boolean found = false;
//        for (int i = 0; i < arr.length; i++){


////            System.out.println(arr[i]);
//            if (arr[i] == target){
//                found = true;
//                System.out.println("Element found at index " + i);
//                break;
//
//            }
//
//        }
//            if(!found){
//                System.out.println("Element not found!");
//            }
//
//    }

//        int[] arr = {12, 10, 8, 5, 2};
//        int smallest = arr[0];
//
//        for (int i = 0; i < arr.length; i++){
//            if (arr[i]<smallest){
//                smallest=arr[i];
//
//            }
//        }
//                System.out.println("Smallest number in arr: " + smallest);

//
//        int[] arr = {1,2,3,4,5,6,7};
//        int left = 0;
//        int right = arr.length - 1;
//
//        while (left<right){
//            int temp = arr[];
//            arr[left]=arr[right];
//            arr[right]=temp;
//
//            left++;
//            right--;
//        }
//
//        for (int i=0; i< arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }
//
//    }
//
//}
//
//
//        int[] arr = {12, 7, 8, 65, 89, 90, 40};
//        int smallest = arr[0];
//        int SecondSmallest = Integer.MIN_VALUE;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > smallest) {
//                SecondSmallest = smallest;
//                smallest = arr[i];
//            } else if (arr[i]>smallest && arr[i] < SecondSmallest) {
//                SecondSmallest = arr[i];
//            }
//        }
//            System.out.println("Smallest number is: " + smallest);
//        System.out.println("Second Smallest number is: " +SecondSmallest);
//    }
//}
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter array size: ");
//
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i=1; i< arr.length; i++){
//            arr[i]= sc.nextInt();
//        }
//
//
//        int largest = arr[0];
//        int secondLargestValue = Integer.MIN_VALUE;
//
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > largest){
//                secondLargestValue=largest;
//                largest = arr[i];
//            } else if (arr[i]<largest && arr[i]>secondLargestValue) {
//                secondLargestValue=arr[i];
//
//            }
//        }
//        System.out.println("The Largest Values is: " + largest);
//        System.out.println("The Second Largest Values is: " + secondLargestValue);
//    }
//}
//

 public class DSA_Practice_26 {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter arrays---: ");
//        int n = sc.nextInt();
//        System.out.println("Enter " + n + " elements:");
//        int[] arr = new int[n];
//
//        for (int i = 0; i < arr.length; i++){
//            arr[i] = sc.nextInt();
//        }
//
//        boolean sorted = true;
//
//        for (int i=0; i< arr.length-1; i++){
//            if(arr[i]>arr[i+1]){
//                sorted = false;
//                break;
//            }
//        }
//        if (sorted){
//            System.out.println("Array is sorted");
//        }else {
//            System.out.println("Array is not sorted");
//        }
//    }
//}
//        int[] arr = {12,3,4,5,78,90,56,};
//        int target = 78;
//        boolean found = false;
//
//        for (int i=0; i<arr.length; i++){
//            if (arr[i]==target){
//            System.out.println("Element found at index: " + i);
//                found = true;
//                break;
//            }
//        }
//
//        if (!found){
//            System.out.println("Element not found!");
//        }
//
//    }
//}


//        class Solution {
//            public int removeElement(int[] nums, int val) {
//                int k = 0;
//                for (int i = 0; i < nums.length; i++) {
//                    if (nums[i] != val) {
//                        nums[k] = nums[i];
//                        k++;
//                    }
//                }
//                return k;
//            }
//        }
//    }
//


//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter arrays---: ");
//        int n = sc.nextInt();
//        System.out.println("Enter " + n + " elements:");
//        int[] arr = new int[n];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//
//        for (int i = 0; i < arr.length - 1; i++){
//            for (int j=0; j<n-i-1; j++){
//            if (arr[j] > arr[j + 1]) {
//                int temp = arr[j];
//                arr[j]=arr[j+1];
//                arr[j+1]=temp;
//            }
//            }
//        }
//
//        System.out.println("Sorted array:");
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//    }
//
//}


   /* public static int linearSearch(int[] nums, int target) {

            for (int i=0; i<nums.length; i++){
                if (nums[i]==target){
                    return i;
                }
            }
                    return -1;
    }

    public static void main(String[] args) {
        int[] arr = {12, 45, 78, 90,47,65};
        int target = 78;
        System.out.println(linearSearch(arr, target));

    }
}
*/
   public static void main(String[] args) {

int[] arr = {1,2,3,4,5,6};
int target = 4;
boolean found = false;

for (int i=0; i<arr.length; i++){
    if(arr[i]==target){
        System.out.println(i);
        found = true;
        break;
    }
}

if(!found){
    System.out.println("Not Found" + -1);
}
   }



}






