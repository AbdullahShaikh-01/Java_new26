//////import java.util.Scanner;
//////
////////public class Basicjava_practice {
////////    public static void main(String[] args) {
////////        Scanner sc = new Scanner(System.in);
////////        System.out.println("Enter Character: ");
////////        char a = sc.();
////////
////////        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u'){
////////            System.out.println("Vowel");
////////        }else{
////////            System.out.println("not Vowel");
////////        }
////////   }
//////
////////        static boolean isEven(int n){
////////            if (n%2==0){
////////
////////               return true;
////////            }else {
////////
////////                return false;
////////            }
////////
////////
////////    }
////////    public static void main(String[] args){
////////            Scanner sc = new Scanner(System.in);
////////            System.out.println("Enter number: ");
////////            int num = sc.nextInt();
////////
////////        System.out.println(isEven(num));
//////
////////        static int fact(int n) {
////////            int fact = 1;
////////            for (int i = 1; i <= n; i++) {
////////                fact *= i;
////////            }
////////                 return fact;
////////
////////        }
////////        public static void main(String[] args){
//////////                Scanner sc = new Scanner(System.in);
//////////                System.out.println("Enter a number: ");
//////////
//////////                int a = sc.nextInt();
////////
////////                System.out.println(fact(5));
////////            }
//////
////////        public static void main(String[] args){
////////            int num = 5;
////////            int fact = 1;
////////            for (int i = 1; i<=num; i++){
////////                fact*=i;
////////            }
////////            System.out.println(fact);
////////
////////        static int fibo(int n) {
////////            if (n < 2) {
////////                return n;
////////
////////            }
////////                return fibo(n - 1) + fibo(n - 2);
////////        }
////////        public static void main(String[] args){
////////            int ans = fibo(10);
////////            System.out.println(ans);
////////
////////        static int sum(int a, int b) {
////////            return a + b;
////////        }
////////        static int sum(int a, int b, int c){
////////            return a + b + c;
////////}
////////    public static void main(String[] args){
////////            int a = sum(12,20);
////////            int b = sum(23,12,67);
////////        System.out.println("The Sum of a is: "+a);
////////        System.out.println("The Sum of b is: "+b);
////////
////////        public static void main(String[] args){
////////            int[] arr = {12,34,5,6,78,79};
////////            int min = arr[0];
////////
////////            for (int i = 0; i < arr.length; i++){
////////                if (arr[i] < min){
////////                    min = arr[i];
////////                }
////////
////////            }
////////            System.out.println(min);
//////
////////        public static void main(String[] args){
////////            Scanner sc = new Scanner(System.in);
////////            System.out.print("enter the target: ");
////////            int[] arr = {12,43,56,7,56,87};
////////            int target = sc.nextInt();
////////            boolean found = false;
////////
////////            for (int i = 0; i<arr.length; i++){
////////                if (arr[i]==target){
////////                    System.out.println("found element: "+i);
////////                    found = true;
////////                    break;
////////                }
////////            }
////////            if (!found){
////////                System.out.println("element not found!");
////////            }
//////
////////            public static void main(String[] args) {
////////                int[] arr = {12, 93, 56, 43, 56,22};
////////                int largest = arr[0];
////////                int secondLargest = Integer.MIN_VALUE;
////////                for (int i=1; i<arr.length; i++) {
////////                    if (arr[i] > largest) {
////////                        secondLargest = largest;
////////                        largest = arr[i];
////////
////////                    } else if (arr[i] > secondLargest && arr[i] != largest){
////////
////////                        secondLargest = arr[i];
////////                    }
////////                }
////////
////////                        System.out.println("The first largest number is: "+largest);
////////
////////                    if (secondLargest == Integer.MIN_VALUE){
////////                        System.out.println("Second number is not exist");
////////                    }else{
////////                        System.out.println("The Second largest number is: "+secondLargest);
////////
////////            }
//////
//////
////
////import java.util.Scanner;
////
////////                public static void main(String[] args){
////////                    Scanner sc = new Scanner(System.in);
////////                    System.out.println("Enter marks: ");
////////
////////                    int[] marks = new int[5];
////////                    int sum = 0;
////////
////////
////////                    for (int i=0; i<marks.length; i++){
////////                       marks[i]= sc.nextInt();
////////                    }
////////                    System.out.println("Marks are: ");
////////                    for (int i=0; i<marks.length; i++){
////////                        sum+=marks[i];
////////
////////                        System.out.print(marks[i]+" ");
////////                    }
////////                    System.out.println();
////////
////////                    System.out.println("The Sum of marks: ");
////////
////////                    System.out.println(sum);
//////
//////
//////
//////
//////
//////
//////    static int reverse(int n, int digits) {
//////
//////        if (n < 10) {
//////            return n;
//////        }
//////
//////        int lastDigit = n % 10;
//////
//////        return (int) (lastDigit * Math.pow(10, digits - 1))
//////                + reverse(n / 10, digits - 1);
//////    }
//////
//////    public static void main(String[] args) {
//////
//////        int num = 1234;
//////
//////        int digits = String.valueOf(num).length();
//////
//////        System.out.println(reverse(num, digits));
//////    }
////
////public class Basicjava_practice {
////    static void main() {
////        Scanner sc = new Scanner(System.in);
////
////        System.out.println("Subject 1 marks: ");
////        int marks1 = sc.nextInt();
////
////
////        System.out.println("Subject 2 marks: ");
////        int marks2 = sc.nextInt();
////
////
////        System.out.println("Subject 3 marks: ");
////        int marks3 = sc.nextInt();
////
////
////        System.out.println("Subject 4 marks: ");
////        int marks4 = sc.nextInt();
////
////
////        System.out.println("Subject 5 marks: ");
////        int marks5 = sc.nextInt();
////
////        if (marks1+marks2+marks3+marks4+marks5 <= 0 && marks1+marks2+marks3+marks4+marks5 >= 100){
////            System.out.println("Invalid Marks!");
////        }
////        if (marks1+marks2+marks3+marks4+marks5 < 33 ){
////            System.out.println("Result : Fail");
////        }
////
////        int total = (marks1+marks2+marks3+marks4+marks5);
////
////        double percentage = total/5.0;
////
////        System.out.println("-----Results------");
////
////        System.out.println("Total: " + total);
////        System.out.println("Percentage " + percentage + "%");
////
////
////
////
////        if ( percentage >= 90){
////            System.out.println("Grade A");
////        } else if (percentage >= 80 && percentage <= 90) {
////            System.out.println("Grade B");
////
////        } else if (percentage >= 70  && percentage <= 80) {
////            System.out.println("Grade C");
////
////        } else if (percentage >= 50 && percentage <= 70) {
////            System.out.println("Grade D");
////        } else if (percentage >= 40 && percentage <= 50 ) {
////            System.out.println("Grade E");
////        }else {
////            System.out.println("Your are Fail");
////        }
////
//
//import java.util.Scanner;
//

import java.util.Random;
import java.util.Scanner;

//////        System.out.println("Total marks" + marks+ sc.nextInt() + "%");
////
////
////    }
////}
//
//public class Basicjava_practice {
//   public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       int a = sc.nextInt();
//       int b = sc.nextInt();
//
//       int choice = sc.nextInt();
//
//       switch (choice){
//           case 1:
//               System.out.println(a+b);
//               break;
//           case 2:
//               System.out.println(a-b);
//               break;
//           case 3:
//               System.out.println(a*b);
//               break;
//
//           case 4:
//               System.out.println(a/b);
//               break;
//           case 5:
//               System.out.println(a%b);
//               break;
//           default:
//               System.out.println("Invalid number");
//
//       }
//
//
//    }
//
//}


public class Basicjava_practice {
   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       System.out.println("guess number: ");
       int target  = 54;
       int nums = sc.nextInt();

       int i =0;

    while (true) {



        if (nums > target) {
            System.out.println("TOO HIGH");
            nums=sc.nextInt();
            i++;

        }

        else if (nums <= target) {
            System.out.println("TOO LOW");
            nums=sc.nextInt();
        }


        else if (nums == target) {
            System.out.println("Congratulation You have guess the correct number!");
            break;
        }
        else{
                System.out.println("Invalid number!");
            }

        }
    }



    }
