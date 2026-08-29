import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//public class PracticeMethod {
//    static void stars (int n){
//        for (int i = 1; i<=n; i++){
//            for (int j = 1; j<=i; j++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//    }
//    public static void main(String[] args){
//        stars(4);
//    }
////
//    static int num(int n) {
//        if (n==0){
////            return 0;
//        }
//        return n + num(n -1);
//    }
//
//    public static void main(String[] args){
//
//        System.out.println (num(10));
//    }

//    static void stars (int n){
//        for (int i = 4; i>=1; i--){
//            for (int j = 1; j<=i; j++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//
//    }
//    public static void main(String[] args){
//        stars(4);
//    }
//    static int  fib(int n) {
//        if (n == 0 || n == 1)
//            return n;
//        return fib(n - 1) + fib(n - 2);
//
//        }
//
//
//
//    public static void main(String[] args){
//        int n = 10;
//        for (int i = 0; i < n; i++){
//            System.out.println(fib(i)+ " ");
//        }
//    }

//    static void avg(){
//        int sum = 0;
//        int[] n = {12, 32, 43, 45,67};
//        for (int i = 0; i < n.length; i++){
//            sum +=n[i];
//        }
//        double avg = (double) sum/n.length;
//
//        System.out.println("Sum is: "+ sum);
//        System.out.println("Avg is: "+avg);
//
//    }
//    public static void main(String[] args){
//        avg();
//    }

//    static void stars (int n){
//            if (n == 0) {
//                return;
//            }
//                for (int i = 0; i < n; i++) {
//                    System.out.print(" * ");
//                }
//                System.out.println();
//                stars(n-1);
//            }
//
//    public static void main(String[] args){
//        stars(4);
//    }
//
//}

//
//    public static int fact(int n) {
//
//        if(n==0||n==1) {
//            return 1;
//        }
//     return n*fact(n-1);
//    }
//
//    public static void main(String[] args) {
//       int n=5;
//        System.out.println(fact(n));
//
//    }
//
//
//
//
//}


//
//    static int  add(){
//        int a=10;
//        int b=20;
//
//        return a+b;
//    }
//        static int  pow(){
//            int x=20;
//            int y=10;
//
//            return x*y;
//        }
//
//public void main(String[] args) {
//
//    System.out.println(add());
//    System.out.println(pow());
//}

//static int isCheck(int m) {
//    if (m > 0) {
//        System.out.println("M is positive no");
//
//    } else if (m < 0) {
//        System.out.println("M is negative no");
//
//
//    }else {
//        System.out.println("M is zero no");
//    }
//    return m;
//}
//
//public static void main(String[] args) {
//    int num = isCheck(89);
//    System.out.println(num);
//}

//static boolean isPalindrome(int n) {
//    int original = n;
//
//    int reverse = 0;
//    while (n != 0) {
//        int digit = n % 10;
//        reverse = reverse * 10 + digit;
//        n = n / 10;
//    }
//return original==reverse;
//       }
//
//public static void main(String[] args){
//    System.out.println(isPalindrome(121));
//}

//static boolean primeNum(int n){
//    if (n<=1){
//        return false;
//
//    }
//    for (int i = 2; i < n; i++){
//        if (n%i==0){
//            return false;
//        }
//    }
//    return true;
//}
//
//public static void main(String[] args) {
//    System.out.println(primeNum(7));
//    System.out.println(primeNum(10));
//}

//public class PracticeMethod {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        boolean isPrime = true;
//        if (num<=1){
//            isPrime = false;
//
//        }else{
//            for (int i = 2; i<num; i++){
//                if (num % i == 0){
//                    isPrime = false;
//                    break;
//                }else {
//                    isPrime = true;
//                }
//            }
//        }
//
//        if (isPrime){
//            System.out.println("Prime number");
//        }else{
//            System.out.println("Not a prime number");
//        }
//    }
//}

//static int isSum(int n){
//   int sum = 0;
//
//    while (n!=0){
//        int digit = n%10;
//        sum+=digit;
//        n = n/10;
//
//    }
//
//return sum;
//}
//
//public static void main(String[] args) {
//    System.out.println(isSum(745678765));
//}


//static int findMin(int[] arr){
//    int smallest = arr[0];
//
//    for (int i = 0; i<arr.length; i++){
////            System.out.println(i);
//        if (arr[i]<smallest){
//            smallest=arr[i];
//        }
//    }
//    return smallest;
//
//
//}
//
//public static void main(String[] args) {
//    int[] arr = {78,3,67,1,56,87};
//    System.out.println(findMin(arr));
//}








