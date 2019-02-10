package by.epam.java.yukhimchuk.XMLParsing.validation;

import by.epam.java.yukhimchuk.XMLParsing.exception.InvalidInputStream;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.transform.stream.StreamSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class XMLValidatorTest {
    @Test
    public void testIsValid() throws FileNotFoundException, InvalidInputStream {
        //given
        boolean isValid = XMLValidator.getInstance().isValid(new StreamSource(new FileInputStream("src/main/resources/Gems.xml")) , "Gems.xsd");
        Assert.assertTrue(isValid);
    }
}
