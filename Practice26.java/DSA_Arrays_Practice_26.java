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

// public class DSA_Practice_26 {
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
//
//int[] arr = {1,2,3,4,5,6};
//int target = 4;
//boolean found = false;
//
//for (int i=0; i<arr.length; i++){
//    if(arr[i]==target){
//        System.out.println(i);
//        found = true;
//        break;
//    }
//}
//
//if(!found){
//    System.out.println("Not Found" + -1);
//}
//   }
//


//     int[] arr = {10,20,30,40,50,60,70};
//
//     int target = 30;
//
//     int low = 0;
//     int high = arr.length-1;
//
//
//
//     while (low <= high) {
//     int mid = low + (high - low) / 2;
//         if(arr[mid] == target){
//             System.out.println(mid);
//             System.out.println(arr[mid]);
//             break;
//
//         } else if (arr[mid]<target) {
//             low = mid + 1;
//         }else {
//             high = mid - 1;
//         }
//
//         }
//
//     }
//}


// public static void main(String[] args) {
//     int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//     int target = 5;
//
//     int low = 0;
//     int high = arr.length-1;
//
//     while (low <= high){
//         int mid = low + (high - low) / 2;
//         if (arr[mid]==target){
//             System.out.println(mid);
//             System.out.println(arr[mid]);
//             break;
//         } else if (arr[mid]<target) {
//             low = mid + 1;
//         }else {
//             high = mid - 1;
//         }
//
//         }
//     }
// }
//
//class Main {
//    public static void main(String[] args) {
////
////        int[] arr = {7, 3, 6, 9, 4, 1};
////
////        for (int i = 1; i < arr.length; i++) {
////
////            int key = arr[i];
////            int j = i - 1;
////
////            while (j >= 0 && arr[j] > key) {
////                arr[j + 1] = arr[j];
////                j--;
////            }
////
////            arr[j + 1] = key;
////        }
////
////        for (int i = 0; i < arr.length; i++) {
////            System.out.print(arr[i] + " ");
////        }


//        int[] arr = {12, 7, 87, 45, 8, 11, 30};
//
//        int[] newArray = new int[8];
//        int index = 3;
//        int value = 90;
//
//
//        for (int i=0, j=0; i<newArray.length; i++){
//            if (i == index){
//                newArray[i] = value;
//            }else {
//                newArray[i]=arr[j];
//                j++;
//
//                }
//            }
//
//        for (int i = 0; i < newArray.length; i++) {
//            System.out.print(newArray[i] + " ");
//        }
//
//    }
//
//}


    // Bubble sort
public class DSA_Arrays_Practice_26 {
    public static void main(String[] args) {
        //        int[] arr = {1,4,8,9,2,7};
        //
        //        for (int i=0; i< arr.length-1; i++){
        //            for (int j=0; j< arr.length -1 - i; j++){
        //                if (arr[j]>arr[j+1]){
        //                    int temp = arr[j];
        //                    arr[j] = arr[j+1];
        //                    arr[j+1] = temp;
        //
        //
        //
        //                }
        //            }
        //        }
        //
        //        int[] newArry = new int[7];
        //
        //        int index = 4;
        //        int value = 77;
        //
        //        for (int i=0, j=0; i<newArry.length;i++){
        //            if (i==index){
        //                newArry[i]=value;
        //            }else {
        //                newArry[i]=arr[j];
        //                j++;
        //            }
        //        }
        //
        //
        //
        //        for(int i=0; i<newArry.length; i++){
        //            System.out.print(newArry[i] + " ");
        //        }


//            int[] arr = {2,1,4,7,0,3,9};
//
//            for (int i=0; i< arr.length-1; i++){
//                for (int j=0; j< arr.length-1-i; j++){
//                    if (arr[j]>arr[j+1]){
//                        int temp = arr[j];
//                        arr[j]=arr[j+1];
//                        arr[j+1]=temp;
//                    }
//                }
//            }
//
//            int[] newArray = new int[8];
//            int index = 4;
//            int value = 8;
//
//            for (int i=0,j=0; i<newArray.length; i++){
//                if (i==index){
//                    newArray[i]=value;
//                }else {
//                    newArray[i]=arr[j];
//                    j++;
//                }
//            }
//
//
//            int ind = 4;
//
//            for (int i=ind; i<newArray.length-1; i++){
//                newArray[i]= newArray[i+1];
//
//
//            }
//
//            int newSize = newArray.length - 1;
//
//            for (int i=0; i<newSize; i++){
//                System.out.print(newArray[i] + " ");
//            }


        // Searching in Arrays.....


        // Linear Search.....

//            int[] arr = {10,20,30,40,50};
//
//            int target = 30;
//            boolean found = false;
//
//            for (int i=0; i< arr.length; i++){
//                if (arr[i]==target){
//                    found = true;
//                    System.out.println("array in index is :" + i);
//                    break;
//            }
//
//                }
//            if (found){
//                    System.out.println("Element present in array");
//
//                }else{
//                    System.out.println("Element not present in array");
//                }


        //  Binary Search......

//
//            int[] arr = {10,20,30,40,50};
//
//            int target = 400;
//
//            int low = 0;
//            int high = arr.length-1;
//            boolean found = false;
//
//            while (low<=high){
//                int mid = low + (high-low)/2;
//                if (arr[mid]==target){
//                    System.out.println(mid);
//                    System.out.println(arr[mid]);
//                    found = true;
//                    break;
//                } else if (arr[mid]<target) {
//                    low = mid + 1;
//
//
//                }else {
//                    high = mid - 1;
//                }
//
//            }
//
//            if (!found){
//                System.out.println("Element not found!");
//            }


        // Insertion Sort.......


//            int[] arr = {7, 3, 5, 2, 6};
//
//            for (int i =1; i< arr.length; i++){
//                int key = arr[i];
//                int j = i - 1;
//
//                while (j>=0 && arr[j]>key){
//                    arr[j+1]= arr[j];
//                    j--;
//                }
//
//                arr[j+1]=key;
//            }
//
//            for (int i=0; i< arr.length; i++){
//                System.out.print(arr[i]+ " ");
//            }


        // Selection Sort........


//        int[] arr = {3, 5, 9, 0, 4, 2, 7};
//
//        for (int i = 0; i < arr.length - 1; i++) {
//            int minIndex = i;
//
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[j] < arr[minIndex]) {
//                    minIndex = j;
//                }
//            }
//
//            int temp = arr[i];
//            arr[i] = arr[minIndex];
//            arr[minIndex] = temp;
//        }
//
//        for (int i=0; i< arr.length; i++){
//            System.out.print(arr[i]+ " ");
//        }




    // given the array first you have to do sorted of the array then insert 55 at index no 6

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int[] arr = new int[n];
//
//        System.out.println("Enter "+ n + "Element here: ");
//
//        for (int i=0; i< arr.length; i++){
//            arr[i] = sc.nextInt();
//        }
//
//
//        for (int i=0; i< arr.length; i++){
//            for(int j=0; j< arr.length-i-1; j++){
//                if (arr[j]>arr[j+1]){
//                    int temp = arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
//
//
//
//        for (int i=0; i< arr.length; i++){
//            System.out.print(arr[i]+ " ");
//        }







    }
}






































