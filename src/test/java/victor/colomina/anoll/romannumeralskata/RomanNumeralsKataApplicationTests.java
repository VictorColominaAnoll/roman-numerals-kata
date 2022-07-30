package victor.colomina.anoll.romannumeralskata;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RomanNumeralsKataApplicationTests {

    private final RomanNumberConvertor romanNumberConvertor;

    public RomanNumeralsKataApplicationTests() {
        this.romanNumberConvertor = new RomanNumberConvertor();
    }

    @Test
    void it_should_return_value_for_number_1() {
        assertEquals(romanNumberConvertor.convert(1), "I");
    }

    @Test
    void it_should_return_value_for_number_2() {
        assertEquals(romanNumberConvertor.convert(2), "II");
    }

    @Test
    void it_should_return_value_for_number_3() {
        assertEquals(romanNumberConvertor.convert(3), "III");
    }

    @Test
    void it_should_return_value_for_number_4() {
        assertEquals(romanNumberConvertor.convert(4), "IV");
    }

    @Test
    void it_should_return_value_for_number_5() {
        assertEquals(romanNumberConvertor.convert(5), "V");
    }

    @Test
    void it_should_return_value_for_number_6() {
        assertEquals(romanNumberConvertor.convert(6), "VI");
    }

    @Test
    void it_should_return_value_for_number_7() {
        assertEquals(romanNumberConvertor.convert(7), "VII");
    }

    @Test
    void it_should_return_value_for_number_8() {
        assertEquals(romanNumberConvertor.convert(8), "VIII");
    }

    @Test
    void it_should_return_value_for_number_9() {
        assertEquals(romanNumberConvertor.convert(9), "IX");
    }

    @Test
    void it_should_return_value_for_number_10() {
        assertEquals(romanNumberConvertor.convert(10), "X");
    }

    @Test
    void it_should_return_value_for_number_11() {
        assertEquals(romanNumberConvertor.convert(11), "XI");
    }

    @Test
    void it_should_return_value_for_number_13() {
        assertEquals(romanNumberConvertor.convert(13), "XIII");
    }

    @Test
    void it_should_return_value_for_number_21() {
        assertEquals(romanNumberConvertor.convert(21), "XXI");
    }

    @Test
    void it_should_return_value_for_number_22() {
        assertEquals(romanNumberConvertor.convert(22), "XXII");
    }

    @Test
    void it_should_return_value_for_number_23() {
        assertEquals(romanNumberConvertor.convert(23), "XXIII");
    }

    @Test
    void it_should_return_value_for_number_24() {
        assertEquals(romanNumberConvertor.convert(24), "XXIV");
    }

    @Test
    void it_should_return_value_for_number_25() {
        assertEquals(romanNumberConvertor.convert(25), "XXV");
    }

    @Test
    void it_should_return_value_for_number_29() {
        assertEquals(romanNumberConvertor.convert(29), "XXIX");
    }



}
