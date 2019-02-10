package by.epam.java.yukhimchuk.XMLParsing.action;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.LocalTime;

public class StringToLocalTimeConverterTest {
    StringToLocalTimeConverter stringToLocalTimeConverter;

    @BeforeClass
    public void setUp() {
        stringToLocalTimeConverter = StringToLocalTimeConverter.getInstance();
    }

    @Test
    public void testConvert() {
        //given
        LocalTime expected = LocalTime.of(10 , 10 , 10);
        //when
        LocalTime actual = stringToLocalTimeConverter.convert("10:10:10");
        //then
        Assert.assertEquals(expected , actual);
    }
}
