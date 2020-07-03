import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();

        while (!"0".equals(str)) {
            try {
                int num = Integer.parseInt(str);
                int ans = num * 10;
                System.out.println(ans);
            } catch (NumberFormatException e) {
                System.out.printf("Invalid user input: %s\n", str);
            }
            str = scan.next();
        }
    }
}