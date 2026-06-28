import java.util.Scanner;
public class day5 {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Total income: ");
        float tax = 0;

        float income = sc.nextFloat();


        if (income <= 250000){
            tax =  0;
        } else if (income <= 500000) {
            tax =  0.05f * (income - 250000);
        }else if (income <= 1000000) {
            tax =  0.05f * 250000;
            tax +=  0.20f * (income - 500000);

        }else{
            tax = 0.05f *  250000;
            tax += 0.20f * 500000;
            tax += 0.30f * (income - 1000000);



        }

        System.out.println("Total income tax will be: " + tax);
    }
}
