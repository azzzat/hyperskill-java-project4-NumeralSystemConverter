package converter;

public class convertFractionToBase {
    public String convertFractionToBase(double number, int base) {
        StringBuilder numStr = new StringBuilder();
        numStr.append(number);

        double num = number;

        StringBuilder ans = new StringBuilder(".");

        for (int i = 0; i < 5; i++) {

            double num2 = num * (double) base;
            int addNumber = (int) num2;
            num = num2 % 1.0;

            if (addNumber < 10) {
                ans.append(addNumber);
            } else if (addNumber >= 10 && addNumber < 37) {
                char a = (char) (addNumber + 87);
                ans.append(a);
            }
        }

        return ans.substring(0);
    }
}
