import java.util.Scanner;

public class example {

    public static void main(String[] agrs) {
        // condistional statments
        Scanner sc = new Scanner(System.in);
        // pen = 10 and notbook = 40
        System.out.println("what is your amount..?");
        int cash = sc.nextInt();
        if (cash < 10) {
            System.out.println("cannot buy anything..");
            System.out.println("get more cash");
        } else if (cash > 10 && cash < 50) {
            System.out.println("you can get one thing..");
        } else {
            System.out.println("you can get both thing..");
        }

    }
}
