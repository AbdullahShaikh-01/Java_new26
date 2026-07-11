import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class day11 {
//    Scanner sc = new Scanner(System.in);

//    static int n = 10;
//    static  int sum  = 0;
//
//    public static void main(String[] args) {
//        for (int i = 1; i <= n; i++) {
//            sum += i;
//
//        }
//        System.out.println(sum);

       /* static int num  (int x, int y){
            int z;
            if(x>y){
                z = x+y;
            }else{
                z = (x+y)*5;
            }

            return z;

    }
    public static void main(String[] args){
            int a = 5;
            int b = 7;
            int c;
            c = num(a,b);

            int a1 = 2;
            int b1 = 1;
            int c1;
            c1 = num(a1,b1);

        System.out.println(c);
        System.out.println(c1);
        */


    /*static int nums (int a, int b) {
        return a + b;
    }

        public static void main(String[] args){
        int a=10;
        int b=20;
        int c;
        c=a+b;
            System.out.println(c);

*/

    /*static void bye(){
        System.out.println("Good Bye!");
    }
    public static void main(String[] args){
        bye();
        bye();
        bye();
        bye();
        bye();
        */

    /*static void greet(String name){
        System.out.println("Hello!   " + name);

    }
    public static void main(String[] args){
        greet("Abdullah");
        greet("Rahul");
        greet("Aman");
        */

    /*static int add(int a, int b){
        return a+b;


    }
    public static void main(String[] args) {
        int result = (add(10, 40));
        System.out.println(result);
        */

   /* static void max(int a, int b) {

        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }

    }
    public static void main(String[] args){
        max(20,40);
        */

    /*static void isPositive (int a) {
        if (a > 0) {
            System.out.println(a + " a is positive no. ");

        }else if (a < 0 ){
            System.out.println(a + " a is negative no.");
        }else{
            System.out.println(a + " a is zero no.");
        }

    }
    public static void main(String[] args){
        isPositive(0);
        isPositive(50);
        isPositive(-45);
        */

//    static int largest(int a, int b, int c) {
//        if (a >= b && a >= c) {
//            return a;
//        } else if (b >= a && b >= c) {
//            return b;
//
//        } else {
//            return c;
//        }
//
//    }
//    public static void main(String[] args) {
//        int result = largest(23, 43, 78);
//        System.out.println("largest number is: "+result);


        /*public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
                double s = sc.nextDouble();
                if (s<15){
                    double area = 3*3*0.5*s*s/2;
                    System.out.printf("%.2f",area);
                }else {
                    double perimeter = 6*s;
                    System.out.printf("%.2f",perimeter);

                }
            sc.close();
                */



    /*public static void main(String[] args){
//        System.out.println("enter String: ");
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
          String s = "Python";

        System.out.println(s.substring(0,2)+s.substring(s.length()-2));
    */


   /* public static void main(String[] args){
        System.out.print("Enter number: ");
        Scanner sc = new Scanner(System.in);
        long nums = sc.nextLong();
        if (nums%2==0){
            System.out.println(nums+"  The number is even");
        }else {
            System.out.println(nums+"  The number is odd");
        }
        */

     /*public static void main(String[] args) {
         System.out.print("Enter number: ");
         Scanner sc = new Scanner(System.in);

         double radius = sc.nextDouble();
         if (radius<15) {
             double area = 3.14*radius*radius;
             System.out.printf("%.2f", area);
         }else {
             double circumference = 2*3.14*radius;
             System.out.printf("%.2f", circumference);
         }
         sc.close();
         */


    /*public static void main(String[] args) {
//        System.out.print("Enter Characters: ");
//        Scanner sc = new Scanner(System.in);
//        String ch = sc.nextLine();
        char ch = 'A';


        if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z'){
            System.out.println("It is an alphabet.");

        }else {
            System.out.println("It is not an alphabet.");
        }

        

        */

       /* static void change (int [] arr) {
            arr[0] = 100;

        }

        public static void main(String[] args){
            int[] marks = {45,67,56,98,99};

            change(marks);
            System.out.println("The value of x is: "+marks[0]);
        */

            /*public static void main(String[] args) {
//                System.out.print("Enter number: ");
//                Scanner sc = new Scanner(System.in);
                int nums = 2678;
                int i = 0;
                while (nums!=0){
                    i++;
                 nums= nums/10;
            }
                System.out.println(i);
                */

        /*
            static void change_no (int a) {
                a = 100;
            }
            static void change2(int [] arr){
                arr[0]= 45;
    }

            public static void main(String[] args) {
//                int x = 45;
//                change_no(x);
                int  [] marks = {23,85,78,56,90};
                change2(marks);
                System.out.println("The value of x is after changing: " + arr[0]);
                for (int i = 0; i <marks.length; i++){
                    System.out.print("\t"+marks[i]);
                }

            */


    static int sum(int ... arr) {
        int result = 0;
        for (int ele : arr) {
             result += ele;

        }
        return result;

    }
    public static void main(String[] args){
        System.out.println("The value of nothing is: " +sum());
        System.out.println("The value of 4 and 5 is: "+ sum(4,5));
            }

        }











