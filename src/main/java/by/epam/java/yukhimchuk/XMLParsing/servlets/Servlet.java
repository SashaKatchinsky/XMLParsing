package by.epam.java.yukhimchuk.XMLParsing.servlets;

import by.epam.java.yukhimchuk.XMLParsing.bean.Gem;
import by.epam.java.yukhimchuk.XMLParsing.builder.DOMBuilder;
import by.epam.java.yukhimchuk.XMLParsing.builder.Director;
import by.epam.java.yukhimchuk.XMLParsing.builder.SAXBuilder;
import by.epam.java.yukhimchuk.XMLParsing.builder.StAXBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.xml.sax.SAXException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

@MultipartConfig
public class Servlet extends HttpServlet {
    private static final Logger logger = LogManager.getLogger(Servlet.class.getName());

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Part filePart = request.getPart("file"); // Retrieves <input type="file" name="file">
        InputStream fileContent = filePart.getInputStream();
        String table = null;
        String parserName = request.getParameter("parserChooser");
        List<String> columnList = formColumnName();
        try {
            if (parserName.equalsIgnoreCase("dom")) {
                table = formTable(columnList , Director.createGemList(new DOMBuilder(fileContent)));
            } else if (parserName.equalsIgnoreCase("sax")) {
                table = formTable(columnList , Director.createGemList(new SAXBuilder(fileContent)));
            } else {
                table = formTable(columnList , Director.createGemList(new StAXBuilder(fileContent)));
            }
            request.setAttribute("table", table);
            request.setAttribute("parser" , parserName);
            request.getRequestDispatcher("/jsp/result.jsp").forward(request, response);
        } catch (SAXException e) {
            logger.fatal(e);
        } catch (ParserConfigurationException e) {
            logger.fatal(e);
        } catch (XMLStreamException e) {
            logger.fatal(e);
        }
    }

    private String formTable(List<String> columnList , List<Gem> gemList) {
        String table = "";
        table += "<table border=\"1\" align=\"center\"><tr>";
        for (String str : columnList) {
            table += "<td>" + str + "</td>";
        }
        table += "</tr>";
        for (Gem gem : gemList) {
            table += "<tr>";
            StringTokenizer stringTokenizer = new StringTokenizer(gem.toString());
            while (stringTokenizer.hasMoreElements()) {
                table += "<td>" + stringTokenizer.nextToken() + "</td>";
            }
            table += "</tr>";
        }
        table += "</table>";
        return table;
    }

    private List<String> formColumnName() {
        List<String> columnList = new ArrayList<>();
        columnList.add("Name");
        columnList.add("Preciousnes");
        columnList.add("Origin");
        columnList.add("Color");
        columnList.add("Transparency");
        columnList.add("Count of edges");
        columnList.add("Value");
        columnList.add("Date");
        columnList.add("Time");
        return columnList;
    }
}
