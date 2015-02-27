package xmlparser;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.xml.sax.SAXException;

/**
 *
 * @author sergio
 */
public class PruebaLectorXML {
    
    public static void main(String[] args) throws IOException, FileNotFoundException, SAXException
    {
        XMLParser reader = new XMLParser();
        String pathToXMLFile = System.getProperty("user.dir") + "/xml/point__types_8h.xml";
        
        reader.read(pathToXMLFile);
    }
}
