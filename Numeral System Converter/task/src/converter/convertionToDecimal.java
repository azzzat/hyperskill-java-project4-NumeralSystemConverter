package converter;

public class convertionToDecimal {
    public long convertToDecimal (String numberIn, long base1In) {

//        if (base1In == 16 || base1In == 2) {
//            numberIn.substring(2);
//        } else if (base1In == 8) {
//            numberIn.substring(1);
//        }

        long answer = 0;

        for (int i = 0; i < numberIn.length(); i++) {
            char ch1 = numberIn.charAt(i);
            long numChar = (long) ch1;
            long num1 = 0;

            if (numChar > 47 && numChar < 58) {
                String s = String.valueOf(ch1);
                num1 = Long.parseLong(s);
            } else if (numChar > 96 && numChar < 123) {
                num1 = (-87 + numChar);
            }
            answer += num1 * (long) Math.pow(base1In, numberIn.length() - 1 - i);
        }

        return answer;
    }
}
