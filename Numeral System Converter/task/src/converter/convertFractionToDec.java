package converter;

public class convertFractionToDec {
    public double convertFractionToDec(String number, int base) {
        int stringLength = number.length();

        double newNumber = 0;

        for (int i = 0; i < stringLength; i++) {
            char numChar = number.charAt(i);
            int numInt = numChar;
            int num1 = 0;

            if (numInt > 47 && numInt < 58) {
                num1 = (-48 + numInt);
            } else if (numInt > 96 && numInt < 123) {
                num1 = (-87 + numInt);
            }
            newNumber += ((double) num1 / Math.pow(base, (i + 1)));

        }

        return newNumber;

    }
}
