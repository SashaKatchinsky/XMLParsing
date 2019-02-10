package by.epam.java.yukhimchuk.XMLParsing.action;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.LocalDate;

public class StringToLocalDateConverterTest {
    StringToLocalDateConverter stringToLocalDateConverter;

    @BeforeClass
    public void setUp() {
        stringToLocalDateConverter = StringToLocalDateConverter.getInstance();
    }

    @Test
    public void testConvert() {
        //given
        LocalDate expected = LocalDate.of(1999 , 12 , 07);
        //when
        LocalDate actual = stringToLocalDateConverter.convert("1999-12-07");
        //then
        Assert.assertEquals(actual , expected);
    }
}
