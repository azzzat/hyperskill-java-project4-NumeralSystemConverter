package converter;

public class convertFractional {
    public void convertFractional(int base1, String number, int base2) {
        String part1 = new String();
        String part2 = new String();

        boolean isNumberDouble = false;

        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '.') {
                part1 = number.substring(0, i);
                part2 = number.substring(i + 1);
                isNumberDouble = true;
            }
        }

        convertionToDecimal cb = new convertionToDecimal();
        convertionFromDecimal cd = new convertionFromDecimal();

        if (isNumberDouble) {
            long num1 = cb.convertToDecimal(part1, base1);
            String answerPart1 = cd.convertFromDecimal(num1, base2);

            convertFractionToDec m = new convertFractionToDec();
            convertFractionToBase n = new convertFractionToBase();

            double decFraction = m.convertFractionToDec(part2, base1);
            String answerPart2 = n.convertFractionToBase(decFraction, base2);

            System.out.print(answerPart1);
            System.out.println(answerPart2);
        } else {
            long num1 = cb.convertToDecimal(number, base1);
            String answer = cd.convertFromDecimal(num1, base2);

            System.out.println(answer);
        }
    }
}
