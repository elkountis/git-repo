public class ChiffreEnRomain {

    public String convertNumbToRomain(int numAr) {

        StringBuilder numRom = new StringBuilder();
        String[] numrROmLetters = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] numArValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        for (int i = 0; i < numArValues.length; i++) {

            while (numAr >= numArValues[i]) {
                numAr = numAr - numArValues[i];
                numRom.append(numrROmLetters[i]);
            }
        }

        return numRom.toString();
    }
}
