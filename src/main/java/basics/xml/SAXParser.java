package basics.xml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nico on 4/19/17 15:48.
 */
public class SAXParser {
    class BookHandler extends DefaultHandler {

        private List<String> nameList;
        private boolean title = false;
        private String preTag;

        @Override
        public void startDocument() throws SAXException {
            System.out.println("Starting parsing document...");
            nameList = new ArrayList<String>();
        }

        @Override
        public void endDocument() throws SAXException {
            System.out.println("End");
        }

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            preTag = qName;
            if (qName.equals("title")) {
                title = true;
            }
        }

        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {
            if (title) {
                title = false;
            }
        }

        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {
            if (title) {
                String bookTitle = new String(ch, start, length);
                System.out.println("Book Title: " + bookTitle);
                nameList.add(bookTitle);
            }
        }
    }

    public static void main(String[] args) throws SAXException, IOException {
        XMLReader xmlReader = XMLReaderFactory.createXMLReader();
        BookHandler bookHandler = new SAXParser().new BookHandler();
        xmlReader.setContentHandler(bookHandler);
        xmlReader.parse("target/classes/books.xml");
        System.out.println(bookHandler.nameList);
    }
}
