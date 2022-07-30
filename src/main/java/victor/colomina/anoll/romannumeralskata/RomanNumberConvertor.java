package victor.colomina.anoll.romannumeralskata;

public class RomanNumberConvertor {

    public RomanNumberConvertor() {
    }

    public String convert(int number) {

        String romanNumber = "";

        if (number >= 10) romanNumber += "X".repeat(Math.max(0, number / 10));

        return romanNumber + getOnesNumber(number % 10);
    }

    private String getOnesNumber(int ones) {
        String result = "";

        if (ones == 9) return "IX";

        if (ones >= 5) result += "V";
        if (ones == 4) return "IV";

        return result + "I".repeat(Math.max(0, ones % 5));
    }
}
