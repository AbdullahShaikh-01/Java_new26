import java.util.Scanner;

//import java.util.Scanner;
//
public class classP {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int a = sc.nextInt();
//
//        System.out.println(a+"Abdullah Shaikh");
//    }
//
//}

//
//import java.util.Scanner;
//
//public  class classP {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int b = sc.nextInt();
//
//        System.out.println(5*b);
//    }
//}


//import java.util.Scanner;
//
//public class classP {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//
//        int c = sc.nextInt();
//
//        if (c%2==0){
//            System.out.println("C is even"+c);
//        }else{
//            System.out.println("C is odd");
//        }
//    }


    public static void main(String[] args) {
//        int a = 99;
//        while (a<200){
//            a++;
//            System.out.println(a);
//        }
//        int n = 1;
//        do{
//            System.out.println(n);
//            n++;
//        }while (n<=100);


//        for (int i = 100; i>=0; i--){
////            if(i%2!=0){
//                System.out.println(i);
////            }
//        }
//    }
//        for (int i = 5; i >= 1; i--){
//            for (int j = 1; j<=i; j++){
//                System.out.print("*");
//            }
//                System.out.println();
//        }
//        Scanner sc = new Scanner(System .in);
//        System.out.println("Enter number: ");
//        int n = sc.nextInt();
//        int fact = 1;
//        int i = 0;
//        while (i<n){
//            i++;
//            if (i%2==0) {
//            fact *= i;
//                System.out.println(i);
//            }
//
//        }
//            System.out.println("total fact number is");
//            System.out.println(fact);
//            int[] marks = {17, 45, 78, 67, 90};
//            for (int Element: marks){
//                System.out.print(Element+ " ");
//            }

//            int[][] flats = {
//                    {12, 34, 56},
//                    {23, 45, 76},
//                    {23, 47, 90}
//            };
//            int sum = 0;
////            flats [0][0] = 100;
////            flats [0][1] = 101;
////            flats [0][2] = 102;
////            flats [1][0] = 200;
////            flats [1][1] = 201;
////            flats [1][2] = 202;
//
//            for (int i=0; i < flats.length; i++){
//                for (int j=0; j<flats[i].length; j++){
//                    sum += flats[i][j];
//                    System.out.print(flats[i][j]+ " ");
//                }
//                System.out.println();
//            }
//                System.out.println("The total sum of entire matrix is");
//                System.out.println(sum);
//        }
//    }

//        int[] arr = {1,2,3,4,5};
//        int target = 3;
//
//        for (int i=0;i<arr.length; i++){
//            if (arr[i]==target){
//                System.out.println(arr[i]);
//               System.out.println("Yes it is present in arr");
//    }
//        }

//    int[] array = {1,2,3,5,4,6};
//    boolean sorted = true;
//        for (int i=0;i<array.length-1; i++){
//            if (array[i]<=array[i+1]){
//                sorted = false;
//            }
//        }
//
//        Scanner sc = new Scanner(System.in);

//        int n = sc.nextInt();
//
//        int fact = 1;
//        if (n==0 || n==1){
//            return ;
//        }
//        fact = n*(fact (n-1));
//        System.out.println(fact);

//        int[] arr = {1, 2, 3, 4, 5, 6, 7};
//        int left = 0;
//        int right = arr.length - 1;
//
//        while (left < right) {
//            int temp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = temp;
//
//            left++;
//            right--;
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//

//        int  num = 121;
//        long original = num;
//
//        int reverse = 0;
//        while (num!=0){
//            int digit = num%10;
//            reverse = reverse*10+digit;
//            num = num/10;
//        }
//        if (original==reverse){
//            System.out.println("Yes it is Palindrome!");
//        }else {
//            System.out.println("Not a Palindrome");
//        }
////        System.out.println(original);
////            System.out.println("reverse number is : "+ reverse);
//
//    }
//}

        int fib = 7;
        int a = 0;
        int b = 1;
        int c;
        for (int i = 0; i < fib; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;

        }
    }
}






