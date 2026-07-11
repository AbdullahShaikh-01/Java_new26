public class PracticeMethod {
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
//
//    static int num(int n) {
//        if (n==0){
//            return 0;
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

    static void stars (int n){
            if (n == 0) {
                return;
            }
                for (int i = 0; i < n; i++) {
                    System.out.print(" * ");
                }
                System.out.println();
                stars(n-1);
            }

    public static void main(String[] args){
        stars(4);
    }

}




