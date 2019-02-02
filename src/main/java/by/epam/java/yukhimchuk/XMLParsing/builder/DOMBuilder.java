package by.epam.java.yukhimchuk.XMLParsing.builder;

import by.epam.java.yukhimchuk.XMLParsing.bean.Gem;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;
import java.util.StringTokenizer;

public class DOMBuilder extends BaseBuilder {
    private static final Logger logger = LogManager.getLogger(DOMBuilder.class.getName());
    private InputStream fileContent;

    public DOMBuilder(InputStream fileContent) {
        this.fileContent = fileContent;
    }

    @Override
    public void buildGemList() {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;
        try {
            builder = factory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            logger.fatal(e);
        }
        Document document = null;
        try {
            document = builder.parse(fileContent);
        } catch (SAXException e) {
            logger.fatal(e);
        } catch (IOException e) {
            logger.fatal(e);
        }
        NodeList gemNodeList = document.getElementsByTagName("Gem");
        for (int i = 0 ; i < gemNodeList.getLength() ; i++){
            String name = gemNodeList.item(i).getAttributes().item(0).getTextContent();
            StringTokenizer stringTokenizer = new StringTokenizer(gemNodeList.item(i).getTextContent());
            String preciousnes = stringTokenizer.nextToken();
            String origin = stringTokenizer.nextToken();
            String color = stringTokenizer.nextToken();
            double transparency = Double.parseDouble(stringTokenizer.nextToken());
            int edgesCount = Integer.parseInt(stringTokenizer.nextToken());
            double value = Double.parseDouble(stringTokenizer.nextToken());
            String date = stringTokenizer.nextToken();
            String time = stringTokenizer.nextToken();
            gemList.add(new Gem(name , preciousnes , origin , color , transparency , edgesCount , value , date , time));
        }
    }
}
