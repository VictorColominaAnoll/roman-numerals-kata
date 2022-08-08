package victor.colomina.anoll.romannumeralskata;

public class RomanNumberConvertor {

    public RomanNumberConvertor() {
    }

    public String convert(int number) {
        return getTensNumber(number / 10) + getOnesNumber(number % 10);
    }

    private String getTensNumber(int number) {
        return transformNumericNumberToRomanNumber(number, "X", "L", "C");
    }

    private String getOnesNumber(int ones) {
        return transformNumericNumberToRomanNumber(ones, "I", "V", "X");
    }

    private String transformNumericNumberToRomanNumber(int number, String small, String middle, String big) {
        String result = "";

        if (number == 9) return small + big;

        if (number >= 5) result += middle;
        if (number == 4) return small + middle;

        return result + small.repeat(Math.max(0, number % 5));
    }


}
