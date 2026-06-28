import java.util.Scanner;
public class day4  {
    public  static void main(String[] args) {
        int marks1,marks2,marks3;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter phy marks: ");
        marks1 = sc.nextInt();

        System.out.print("enter chem marks: ");
         marks2 = sc.nextInt();

        System.out.print("enter maths marks: ");
        marks3 = sc.nextInt();
        float avg = (marks1+marks2+marks3)/3.0f;
        System.out.println("Total avg is: "+avg);

        if (avg >= 40 && marks1 >= 33 && marks2 >= 33 && marks3 >= 33){
            System.out.println("Congratulations, You are Passed!");
        }else {
            System.out.println("Sorry, You are Fail!");
        }






    }
}
