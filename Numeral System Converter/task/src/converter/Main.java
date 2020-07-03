package converter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rad1 = 0;
        String number = new String();
        int rad2 = 0;

        try {
            rad1 = scan.nextInt();
            number = scan.next();
            rad2 = scan.nextInt();
        } catch (Exception e) {
            System.out.println("error");
        }

        if (rad1 > 0 && rad2 > 0 && rad1 < 37 && rad2 < 37) {
            convertFractional c = new convertFractional();
            c.convertFractional(rad1, number, rad2);
        } else {
            System.out.println("error");
        }

        }

}

