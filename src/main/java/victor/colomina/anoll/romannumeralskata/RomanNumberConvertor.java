package victor.colomina.anoll.romannumeralskata;

public class RomanNumberConvertor {

    public RomanNumberConvertor() {
    }

    public String convert(int number) {
        String result = "";

        if (number >= 100) {
            result += getHundredsNumber(number / 100);
            number =  number % 100;
        }

        return result + getTensNumber(number / 10) + getOnesNumber(number % 10);
    }

    private String getHundredsNumber(int number) {
        return transformNumericNumberToRomanNumber(number, "C", "D", "M");
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
