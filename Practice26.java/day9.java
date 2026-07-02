public class day9 {
    public static void main(String[] args) {
//        int[] marks = {12, 34, 56, 76, 87};
////        System.out.println(marks[3]);
//        System.out.println("Reversing Arrays using for loop");
//        for (int i = marks.length - 1; i >= 0; i--) {
//            System.out.println(marks[i]);
//        }
//            System.out.println("Printing using for each loop");
//            for (int element : marks) {
//                System.out.println(element);
//            }
//            System.out.println("Arrays length is");
//            System.out.println(marks.length);



    // 3-D arrays using for loop!

       int [][][] flats;
       flats = new int[2][3][4];

       flats[0][0][0]= 101;
        flats[0][1][1]= 102;
        flats[0][2][2]= 103;
        flats[1][0][0]= 201;
        flats[1][1][1]= 202;
        flats[1][2][2]= 203;

        for (int i = 0; i < flats.length; i++){
            System.out.println("Block"+i);
            for (int j = 0; j < flats[i].length; j++){
                for (int k = 0; k<flats[i][j].length; k++){

                System.out.print(flats[i][j][k]+" ");
//                System.out.print(" ");
                }
            System.out.println("");
            }
            System.out.println("");
        }


        }
    }



