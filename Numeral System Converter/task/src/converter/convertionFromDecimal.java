package converter;

public class convertionFromDecimal {

    public String convertFromDecimal (long number, long base) {
        StringBuilder answer = new StringBuilder("");
        do {
            int n1 = (int) (number % base);
            number = number / base;

            if (base == 1) {
                n1 = 1;
                number -= 1;
            }

            if (n1 < 10) {
                answer.append(n1);
            }
            if (n1 >= 10 && n1 < 37) {
                char a = (char) (n1 + 87);
                answer.append(a);
            }

            if (number < base && number != 0) {
                if (number < 10) {
                    answer.append(number);
                }
                if (number >= 10 && number < 37) {
                    char a = (char) (number + 87);
                    answer.append(a);
                }
            }

        } while (number >= base);

//        if (base == 16) {
//            answer.append("x0");
//        } else if (base == 2) {
//            answer.append("b0");
//        } else if (base == 8) {
//            answer.append("0");
//        }

        return answer.reverse().toString();
    }
}
