////////import java.util.Scanner;
////////
//////////public class Basicjava_practice {
//////////    public static void main(String[] args) {
//////////        Scanner sc = new Scanner(System.in);
//////////        System.out.println("Enter Character: ");
//////////        char a = sc.();
//////////
//////////        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u'){
//////////            System.out.println("Vowel");
//////////        }else{
//////////            System.out.println("not Vowel");
//////////        }
//////////   }
////////
//////////        static boolean isEven(int n){
//////////            if (n%2==0){
//////////
//////////               return true;
//////////            }else {
//////////
//////////                return false;
//////////            }
//////////
//////////
//////////    }
//////////    public static void main(String[] args){
//////////            Scanner sc = new Scanner(System.in);
//////////            System.out.println("Enter number: ");
//////////            int num = sc.nextInt();
//////////
//////////        System.out.println(isEven(num));
////////
//////////        static int fact(int n) {
//////////            int fact = 1;
//////////            for (int i = 1; i <= n; i++) {
//////////                fact *= i;
//////////            }
//////////                 return fact;
//////////
//////////        }
//////////        public static void main(String[] args){
////////////                Scanner sc = new Scanner(System.in);
////////////                System.out.println("Enter a number: ");
////////////
////////////                int a = sc.nextInt();
//////////
//////////                System.out.println(fact(5));
//////////            }
////////
//////////        public static void main(String[] args){
//////////            int num = 5;
//////////            int fact = 1;
//////////            for (int i = 1; i<=num; i++){
//////////                fact*=i;
//////////            }
//////////            System.out.println(fact);
//////////
//////////        static int fibo(int n) {
//////////            if (n < 2) {
//////////                return n;
//////////
//////////            }
//////////                return fibo(n - 1) + fibo(n - 2);
//////////        }
//////////        public static void main(String[] args){
//////////            int ans = fibo(10);
//////////            System.out.println(ans);
//////////
//////////        static int sum(int a, int b) {
//////////            return a + b;
//////////        }
//////////        static int sum(int a, int b, int c){
//////////            return a + b + c;
//////////}
//////////    public static void main(String[] args){
//////////            int a = sum(12,20);
//////////            int b = sum(23,12,67);
//////////        System.out.println("The Sum of a is: "+a);
//////////        System.out.println("The Sum of b is: "+b);
//////////
//////////        public static void main(String[] args){
//////////            int[] arr = {12,34,5,6,78,79};
//////////            int min = arr[0];
//////////
//////////            for (int i = 0; i < arr.length; i++){
//////////                if (arr[i] < min){
//////////                    min = arr[i];
//////////                }
//////////
//////////            }
//////////            System.out.println(min);
////////
//////////        public static void main(String[] args){
//////////            Scanner sc = new Scanner(System.in);
//////////            System.out.print("enter the target: ");
//////////            int[] arr = {12,43,56,7,56,87};
//////////            int target = sc.nextInt();
//////////            boolean found = false;
//////////
//////////            for (int i = 0; i<arr.length; i++){
//////////                if (arr[i]==target){
//////////                    System.out.println("found element: "+i);
//////////                    found = true;
//////////                    break;
//////////                }
//////////            }
//////////            if (!found){
//////////                System.out.println("element not found!");
//////////            }
////////
//////////            public static void main(String[] args) {
//////////                int[] arr = {12, 93, 56, 43, 56,22};
//////////                int largest = arr[0];
//////////                int secondLargest = Integer.MIN_VALUE;
//////////                for (int i=1; i<arr.length; i++) {
//////////                    if (arr[i] > largest) {
//////////                        secondLargest = largest;
//////////                        largest = arr[i];
//////////
//////////                    } else if (arr[i] > secondLargest && arr[i] != largest){
//////////
//////////                        secondLargest = arr[i];
//////////                    }
//////////                }
//////////
//////////                        System.out.println("The first largest number is: "+largest);
//////////
//////////                    if (secondLargest == Integer.MIN_VALUE){
//////////                        System.out.println("Second number is not exist");
//////////                    }else{
//////////                        System.out.println("The Second largest number is: "+secondLargest);
//////////
//////////            }
////////
////////
//////
//////import java.util.Scanner;
//////
//////////                public static void main(String[] args){
//////////                    Scanner sc = new Scanner(System.in);
//////////                    System.out.println("Enter marks: ");
//////////
//////////                    int[] marks = new int[5];
//////////                    int sum = 0;
//////////
//////////
//////////                    for (int i=0; i<marks.length; i++){
//////////                       marks[i]= sc.nextInt();
//////////                    }
//////////                    System.out.println("Marks are: ");
//////////                    for (int i=0; i<marks.length; i++){
//////////                        sum+=marks[i];
//////////
//////////                        System.out.print(marks[i]+" ");
//////////                    }
//////////                    System.out.println();
//////////
//////////                    System.out.println("The Sum of marks: ");
//////////
//////////                    System.out.println(sum);
////////
////////
////////
////////
////////
////////
////////    static int reverse(int n, int digits) {
////////
////////        if (n < 10) {
////////            return n;
////////        }
////////
////////        int lastDigit = n % 10;
////////
////////        return (int) (lastDigit * Math.pow(10, digits - 1))
////////                + reverse(n / 10, digits - 1);
////////    }
////////
////////    public static void main(String[] args) {
////////
////////        int num = 1234;
////////
////////        int digits = String.valueOf(num).length();
////////
////////        System.out.println(reverse(num, digits));
////////    }
//////
//////public class Basicjava_practice {
//////    static void main() {
//////        Scanner sc = new Scanner(System.in);
//////
//////        System.out.println("Subject 1 marks: ");
//////        int marks1 = sc.nextInt();
//////
//////
//////        System.out.println("Subject 2 marks: ");
//////        int marks2 = sc.nextInt();
//////
//////
//////        System.out.println("Subject 3 marks: ");
//////        int marks3 = sc.nextInt();
//////
//////
//////        System.out.println("Subject 4 marks: ");
//////        int marks4 = sc.nextInt();
//////
//////
//////        System.out.println("Subject 5 marks: ");
//////        int marks5 = sc.nextInt();
//////
//////        if (marks1+marks2+marks3+marks4+marks5 <= 0 && marks1+marks2+marks3+marks4+marks5 >= 100){
//////            System.out.println("Invalid Marks!");
//////        }
//////        if (marks1+marks2+marks3+marks4+marks5 < 33 ){
//////            System.out.println("Result : Fail");
//////        }
//////
//////        int total = (marks1+marks2+marks3+marks4+marks5);
//////
//////        double percentage = total/5.0;
//////
//////        System.out.println("-----Results------");
//////
//////        System.out.println("Total: " + total);
//////        System.out.println("Percentage " + percentage + "%");
//////
//////
//////
//////
//////        if ( percentage >= 90){
//////            System.out.println("Grade A");
//////        } else if (percentage >= 80 && percentage <= 90) {
//////            System.out.println("Grade B");
//////
//////        } else if (percentage >= 70  && percentage <= 80) {
//////            System.out.println("Grade C");
//////
//////        } else if (percentage >= 50 && percentage <= 70) {
//////            System.out.println("Grade D");
//////        } else if (percentage >= 40 && percentage <= 50 ) {
//////            System.out.println("Grade E");
//////        }else {
//////            System.out.println("Your are Fail");
//////        }
//////
////
////import java.util.Scanner;
////
//
//import org.w3c.dom.ls.LSOutput;
//
////import java.awt.*;
//import java.util.Random;
//import java.util.Scanner;
//
////////        System.out.println("Total marks" + marks+ sc.nextInt() + "%");
//////
//////
//////    }
//////}
////
////public class Basicjava_practice {
////   public static void main(String[] args) {
////       Scanner sc = new Scanner(System.in);
////       int a = sc.nextInt();
////       int b = sc.nextInt();
////
////       int choice = sc.nextInt();
////
////       switch (choice){
////           case 1:
////               System.out.println(a+b);
////               break;
////           case 2:
////               System.out.println(a-b);
////               break;
////           case 3:
////               System.out.println(a*b);
////               break;
////
////           case 4:
////               System.out.println(a/b);
////               break;
////           case 5:
////               System.out.println(a%b);
////               break;
////           default:
////               System.out.println("Invalid number");
////
////       }
////
////
////    }
////
////}
//
//
////public class Basicjava_practice {
////   public static void main(String[] args) {
////
////       Scanner sc = new Scanner(System.in);
////       System.out.println("guess number: ");
////       int target  = 54;
////       int nums = sc.nextInt();
////
////       int i =0;
////
////    while (true) {
////
////
////
////        if (nums > target) {
////            System.out.println("TOO HIGH");
////            nums=sc.nextInt();
////            i++;
////
////        }
////
////        else if (nums <= target) {
////            System.out.println("TOO LOW");
////            nums=sc.nextInt();
////        }
////
////
////        else if (nums == target) {
////            System.out.println("Congratulation You have guess the correct number!");
////            break;
////        }
////        else{
////                System.out.println("Invalid number!");
////            }
////
////        }
////    }
////
////
////
////    }
//
//
//public class Basicjava_practice {
//    public static void main(String[] args) {
////           int count = 1;
////       do {
////
////           System.out.println(count);
////           count++;
////
////       }while (count<=100);
//
////        int n;
////        for (int i=0; i<=4; i++){
////            for (int j=4-i; j>0; j--){
////                System.out.print("*" + " ");
////            }
////            System.out.println();
////        }
//
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter number: ");
////        int num = sc.nextInt();
////
////
////        int fact = 1;
////        int count = 1;
////
////        while (count<=num){
////            fact *= count;
////            count++;
////
////        }
////
////        System.out.println(fact);
//
////        int[][][] arr = {
////                {
////                {1, 2, 3, 4},
////                {3, 2, 7, 9}
////        },
////
////
////            {
////                {4, 9, 7, 5}
////            }
////        };
////
////        for (int i = 0; i < arr.length; i++) {
////            for (int j = 0; j < arr[i].length; j++) {
////                for (int k = 0; k < arr[i][j].length; k++) {
////
////                    System.out.print(arr[i][j][k] + " ");
////                }
////
////                System.out.println();
//
////        Scanner sc = new Scanner(System.in);
////        float num = sc.nextFloat();
////        System.out.println(num);
////            float[] arr = new float[5];
////        float[] arr = {4.5f, 6.9f, 8.6f, 9.2f};
////        float sum = 0;
////
////            for (int i=0; i<=arr.length; i++){
////                sum+=arr[i];
////            }
////
////                System.out.println(sum);
//        public class Basicjava_practice {
//    public static void main(String[] args) {





//        int[] a = {30, 69, 87};
//        int num = 70;
//
//        boolean check = false;
//        for (int i=0; i<=a.length; i++) {
//            if (a[i]==num) {
//                check = true;
//                break;
//            }
//            }
//
//        System.out.println(check);
//
//        int[][][] array = {
//             {
//                {1,4,6,9},
//                {3,8,6,9}
//             },
//             {
//                {2, 6, 9, 4},
//                {7, 6, 1, 0},
//              },
//               {
//                  {4, 3, 2, 1},
//                  {9, 6, 3, 8}
//
//                }
//        };
//
//
//        for (int i=0; i<array.length; i++){
//            for (int j=0; j<array[i].length; j++){
//                for (int k=0; k<array[i][j].length; k++){
//                    System.out.print(array[i][j][k]+ " ");
//                }
//                System.out.println();
//
//            }
//            System.out.println();
//        }
////
//        System.out.println();
//
//        int[] arr = {24,89,65,90,78};
//        int sum = 0;
//        for (int element: arr){
//            sum+=element;
//
//        }
//         double avg = sum/ arr.length;
//
//        System.out.println(avg);


//        int[] arr = {1,2,3,4,5};
//
//        int start = 0;
//        int end = arr.length -1;
//
//        while (start<end){
//
//
//
//                int temp = arr[start];
//                arr[start] = arr[end];
//                arr[end] = temp;
//
//                start++;
//                end--;
//
//            }
//
//
//
//        for (int i=0; i<arr.length; i++){
//            System.out.print(arr[i] + " ");

//        }

//        int smallest = arr[0];
//
//        for (int i =0; i< arr.length; i++){
//            if (arr[i]<=smallest){
//                smallest=arr[i];
//
//            }
//        }
//                System.out.println("Largest value is: " + smallest);
//        int[] arr = {1,2,3,7,6};
//        boolean found = false;
//
//        for (int i=0; i< arr.length-1; i++){
//            if (arr[i]>arr[i+1]){
//                found = true;
//                break;
//            }
//        }
//        if (found)
//            System.out.println("Array is not sorted ");
//        else {
//            System.out.println("Array is sorted");
//        }
//
//        class Sum {
//
//            int totalOfSum(int a, int b) {
//                return a + b;
//            }
//
//            public static void main(String[] args) {
//                Sum sc = new Sum();
//
//                System.out.println(sc.totalOfSum(12, 58));
//            }
//        }

//
//    public static int findMax(int... numbers) {
//
//        int largest = numbers[0];
//
//
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] > largest) {
//                largest = numbers[i];
//
//
//
//            }
//
//        }
//        return largest;
//
//    }
//
//public static void main(String[] args) {
//    System.out.println(findMax(12,4,5,987,69,34));
//
//
//}


//class Calculator {
//    public int add(int a, int b) {
//        return a + b;
//    }
//
//    public int add(int a, int b, int c) {
//        return a + b + c;
//    }
//
//    public double add(double a, double b) {
//        return a + b;
//    }
//
//    public void displayData(){
//        System.out.println(add(15,15));
//        System.out.println(add(20,20,20));
//        System.out.println(add(8.0, 7.5));
//    }
//
//    public static void main(String[] args) {
//        Calculator calc = new Calculator();
//        calc.displayData();
//
//    }
//
//
//}



