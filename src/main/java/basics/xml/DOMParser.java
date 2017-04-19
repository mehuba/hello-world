package basics.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * Created by Nico on 4/19/17 10:45.
 */
public class DOMParser {
    DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();

    public static void main(String[] args) {
        DOMParser domParser = new DOMParser();
        Document document = domParser.parse("target/classes/books.xml");
        Element rootElement = document.getDocumentElement();
        NodeList nodes = rootElement.getChildNodes();
        for (int i = 0; i < nodes.getLength(); i++) {
            Node node = nodes.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                System.out.println("element node under root node" + node);
            }
        }
        domParser.traverse(rootElement);
        NodeList nodeList = rootElement.getElementsByTagName("booka");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Element element = (Element) nodeList.item(i);
            System.out.println(element.getAttribute("id"));
        }

    }

    public Document parse(String filePath) {
        Document document = null;
        try {
            DocumentBuilder builder = builderFactory.newDocumentBuilder();
            document = builder.parse(new File(filePath));
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return document;
    }

    public void traverse(Node node) {
        System.out.println(node);
        NodeList nodes = node.getChildNodes();
        for (int i = 0; i < nodes.getLength(); i++) {
            Node child = nodes.item(i);
            if (child.getNodeType() == Node.ELEMENT_NODE) {
                traverse(child);
            } else {
                System.out.println(child);
            }
        }
    }
}
