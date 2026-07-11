import java.util.Scanner;

public class day12 {
    /*static int sum(int x, int ...arr) {
        int result = x;
        for (int ele : arr) {
            result += ele;
        }
            return result;
    }
    public static void main(String[] args) {
        System.out.println("The sum of 1 and  is: "+sum(1));

        System.out.println("The sum of 5 and 9 is: " + sum(5, 9));
        System.out.println("The sum of 5 and 9 and 5 is: " + sum(5, 9, 5));
        System.out.println("The sum of 5 and 9 and 3 and 2 is: " + sum(5, 9, 3, 2));



        */
/*
    static int fact(int n){
        if (n==0 || n==1){
            return 1;

        }else {
            return n * fact(n-1);
        }
    }
    
    public static void main(String[] args){
        int x = 5;
        System.out.println("The factorial number of the given number will be: "+fact(x));
*/


   /*
    public static void main(String[] args) {
        System.out.println("Enter fact no: ");
        Scanner sc = new Scanner(System.in);

        int fact = sc.nextInt();
        int result = 1;

        for (int i = 1; i<=fact; i++){
            result*=i;

    }
        System.out.println("The factorial number is: "+result);
    }
     */

  /*      public static void main(String[] args){
            int n;
            System.out.println("Enter no: ");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            for (int i = 1; i <= 10; i++){
                System.out.println(n*i);
            }
            */



    }

    static void table (int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
        public static void main (String[]args){
            int n;
            System.out.print("Enter no: ");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            table(n);
        }





