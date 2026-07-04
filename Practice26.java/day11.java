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

    static int largest(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;

        } else {
            return c;
        }

    }
    public static void main(String[] args) {
        int result = largest(23, 43, 78);
        System.out.println("largest number is: "+result);

    }



}



