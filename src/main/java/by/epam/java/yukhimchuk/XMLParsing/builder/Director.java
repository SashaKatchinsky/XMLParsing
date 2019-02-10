package by.epam.java.yukhimchuk.XMLParsing.builder;

import by.epam.java.yukhimchuk.XMLParsing.bean.Gem;
import by.epam.java.yukhimchuk.XMLParsing.exception.DOMBuildException;
import by.epam.java.yukhimchuk.XMLParsing.exception.SAXBuildException;
import by.epam.java.yukhimchuk.XMLParsing.exception.StAXBuildException;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.util.List;

public class Director {
    public static List<Gem> createGemList(BaseBuilder builder) throws IOException, SAXException, ParserConfigurationException, XMLStreamException, SAXBuildException, DOMBuildException, StAXBuildException {
        builder.buildGemList();
        return builder.getGemList();
    }
}
