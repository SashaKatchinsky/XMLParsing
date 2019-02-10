package by.epam.java.yukhimchuk.XMLParsing.validation;

import by.epam.java.yukhimchuk.XMLParsing.exception.InvalidInputStream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class XMLValidator {
    private static class XMLValidatorHolder {
        private static final XMLValidator INSTANCE = new XMLValidator();
    }
    private static final Logger LOGGER = LogManager.getLogger(XMLValidator.class.getName());

    private XMLValidator() {

    }

    public static XMLValidator getInstance() {
        return XMLValidatorHolder.INSTANCE;
    }

    public boolean isValid(StreamSource streamSource , String schemeName) throws InvalidInputStream {
        try {
            SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            ClassLoader classLoader = XMLValidator.class.getClassLoader();
            File schemaLocation = new File(Objects.requireNonNull(classLoader.getResource(schemeName)).getFile());
            Schema schema = schemaFactory.newSchema(schemaLocation);
            Validator validator = schema.newValidator();
            validator.validate(streamSource);
            return true;
        } catch (SAXException e) {
            return false;
        } catch (IOException e) {
            LOGGER.fatal("Invalid stream");
            throw new InvalidInputStream(e);
        }
    }
}
