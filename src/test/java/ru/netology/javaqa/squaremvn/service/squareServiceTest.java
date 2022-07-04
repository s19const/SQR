package ru.netology.javaqa.squaremvn.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class squareServiceTest {

    @ParameterizedTest
    /*
    @CsvSource({
            "100,500",
            "100,1000"
    })
    */
    @CsvFileSource(files ="src/test/resources/bounder.csv")
    public void testBounder() {
        squareService service = new squareService();

        int expected = 13;
        int actual = service.calcSQR(100, 500);

        Assertions.assertEquals(expected, actual);

    }
    /*
    @Test
    public void  testBounderNine() {
        squareService service = new squareService();

        int expected = 9;
        int actual = service.calcSQR(100, 500);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void  testBounderNull() {
        squareService service = new squareService();

        int expected = 13;
        int actual = service.calcSQR(0, 500);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void  testBounderHundred() {
        squareService service = new squareService();

        int expected = 22;
        int actual = service.calcSQR(100, 1000);

        Assertions.assertEquals(expected, actual);
    }
    */
}
