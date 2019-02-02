package by.epam.java.yukhimchuk.XMLParsing.builder;

import by.epam.java.yukhimchuk.XMLParsing.bean.Gem;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseBuilder {
    protected List<Gem> gemList = new ArrayList<>();

    public List<Gem> getGemList() {
        return gemList;
    }

    public abstract void buildGemList() throws ParserConfigurationException, SAXException, IOException, XMLStreamException;
}
