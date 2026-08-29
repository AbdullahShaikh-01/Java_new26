package folder.folderl1.folderl2;

class c1 extends problem2{
    void problem2(){
        System.out.println(proInt);
        System.out.println(defInt);
    }
}

public class problem4 extends Calculate{
    public static void main(String[] args){
        System.out.println("I am main Method");

        c1 c = new c1();
        c.problem2();
    }
}
