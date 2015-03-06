package xmlparser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

/**
 *
 * @author sergio
 */
public class XMLParser extends DefaultHandler {

    private final XMLReader xr;
    private static FileWriter fw = null;
    private static PrintWriter pw = null;
    
    public XMLParser() throws SAXException
    {
        
        xr = XMLReaderFactory.createXMLReader();
        xr.setContentHandler(this);
        xr.setErrorHandler(this);
        
        try {
            fw = new FileWriter("/home/sergio/Documentos/Dropbox/MaquinaVirtualPCL/XMLParser/swig/point_types.i");
            pw = new PrintWriter(fw);
            
        } catch (IOException ex) {
            Logger.getLogger(XMLParser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void read(String fileXML) throws FileNotFoundException, IOException, SAXException
    {
        FileReader fr = new FileReader(fileXML);
        InputSource is = new InputSource(fr);
        
        xr.parse(is);
    }
    
    @Override
    public void startElement(String uri, String name, String qName, Attributes atts)
    {
        //System.out.println("tElemento: " + name);
        
        if (name.contains("includes"))
        {
            System.out.println("tElemento: " + name);
            //pw.print("#include <"+qName.getValue("")+">");
            
            try {
                // TODO falta cerrar el archivo
                //#include <pcl/pcl_macros.h>
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(XMLParser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        /*for(int i=0; qName.equals("codeline") && i<atts.getLength(); i++)
        {
            System.out.println("ttAtributo: " + atts.getLocalName(i) + " = "+ atts.getValue(i));
        }*/
    }
    
    /**
     * This will be called everytime parser encounter a value node
     **/
    @Override
    public void characters(char[] ch, int start, int length)
    {
        String value = new String(ch, start, length).trim();
        
        // Ignore empty value
        if (value.length() == 0) 
            return;
        
        // Handle the value 
        
        
        //System.out.println("/***value: "+ value);
    }
    
    /*
    <codeline lineno="425">
    <highlight class="normal"><ref refid="point__types_8h_1affaf530fa6f8b7ced3fe780eaa8dd32e" kindref="member">POINT_CLOUD_REGISTER_POINT_STRUCT</ref><sp/>(pcl::_Normal,</highlight></codeline><codeline lineno="426"><highlight class="normal"><sp/><sp/><sp/><sp/>(</highlight><highlight class="keywordtype">float</highlight><highlight class="normal">,<sp/>normal_x,<sp/>normal_x)</highlight></codeline><codeline lineno="427"><highlight class="normal"><sp/><sp/><sp/><sp/>(</highlight><highlight class="keywordtype">float</highlight><highlight class="normal">,<sp/>normal_y,<sp/>normal_y)</highlight></codeline><codeline lineno="428"><highlight class="normal"><sp/><sp/><sp/><sp/>(</highlight><highlight class="keywordtype">float</highlight><highlight class="normal">,<sp/>normal_z,<sp/>normal_z)</highlight></codeline><codeline lineno="429"><highlight class="normal"><sp/><sp/><sp/><sp/>(</highlight><highlight class="keywordtype">float</highlight><highlight class="normal">,<sp/>curvature,<sp/>curvature)</highlight></codeline><codeline lineno="430"><highlight class="normal">)</highlight></codeline>
    */
    /*public void writeElementSWING(FileWriter fw)
    {
        FileWriter fw = null;
        PrintWriter pw = null;
        
        try 
        {
            fw = new FileWriter(pathFileXML);
            pw = new PrintWriter(fw);
            
        } catch (IOException ex) {
            Logger.getLogger(XMLParser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/
    
}
