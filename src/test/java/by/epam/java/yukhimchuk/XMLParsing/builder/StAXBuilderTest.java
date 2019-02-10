package by.epam.java.yukhimchuk.XMLParsing.builder;

import by.epam.java.yukhimchuk.XMLParsing.bean.Gem;
import by.epam.java.yukhimchuk.XMLParsing.bean.Preciousnes;
import by.epam.java.yukhimchuk.XMLParsing.exception.DOMBuildException;
import by.epam.java.yukhimchuk.XMLParsing.exception.SAXBuildException;
import by.epam.java.yukhimchuk.XMLParsing.exception.StAXBuildException;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StAXBuilderTest {
    @Test
    public void testBuildGemList() throws IOException, SAXException, XMLStreamException, ParserConfigurationException, SAXBuildException, DOMBuildException, StAXBuildException {
        //given
        List<Gem> expected = Director.createGemList(new StAXBuilder(new FileInputStream(new File("src/test/resources/testGems.xml"))));
        //when
        List<Gem> actual = new ArrayList<>();
        actual.add(new Gem("Diamond" , Preciousnes.precious.toString() , "Tanzania" , "BLUE" , 89 , 6 , 1.25 , "1999-12-07" , "02:34:56"));
        //then
        Assert.assertEquals(expected , actual);
    }
}
