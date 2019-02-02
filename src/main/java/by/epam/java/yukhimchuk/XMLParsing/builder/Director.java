package by.epam.java.yukhimchuk.XMLParsing.builder;

import by.epam.java.yukhimchuk.XMLParsing.bean.Gem;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.util.List;

public class Director {
    public static List<Gem> createGemList(BaseBuilder builder) throws IOException, SAXException, ParserConfigurationException, XMLStreamException {
        builder.buildGemList();
        return builder.getGemList();
    }
}
