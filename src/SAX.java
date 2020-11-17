
import java.io.File;
import java.io.IOException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author angel
 */
public class SAX {
    SAXParser parser;
    ManejadorSAX sh;
    File ficheroXML;

        
        public int abrirXML_SAX(File fichero){
            try {
                SAXParserFactory factory = SAXParserFactory.newInstance();
                parser = factory.newSAXParser();
                
                sh = new ManejadorSAX();
                ficheroXML = fichero;
                
                return 0;
            } 
            catch (Exception e){
                return -1;
            }
        }
        
        public String recorrerSAX(){
            try {
                sh.cadenaResultado = "";
                parser.parse(ficheroXML, sh);
                return sh.cadenaResultado;
            } 
            catch (SAXException ex) {
                return "Error al parsear coon SAX";
            }
            catch(IOException e){
                return "Error al parsear con SAX";
            }
        }

        class ManejadorSAX extends DefaultHandler{
            String cadenaResultado = "";
            
            @Override
            public void characters(char[] ch, int start, int legth) throws SAXException{
                for (int i = start; i < legth+start; i++) {
                    cadenaResultado = cadenaResultado + ch[i];
                }
                cadenaResultado = cadenaResultado.trim() + "\n";
            }
            
            @Override
            public void endElement(String uri, String localName, String qName) throws  SAXException{
                if(qName.equals("Libro")){
                    cadenaResultado = cadenaResultado + "----------------------\n";
                }
            }
            
            @Override
            public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException{
                if(qName.equals("Libro")){
                    cadenaResultado = String.format("%s Publicado en: %s", cadenaResultado, attributes.getValue(attributes.getQName(0).trim()));
                }
                else if(qName.equals("Titulo")){
                    cadenaResultado = cadenaResultado + " El titulo es: ".trim();
                }
                else if(qName.equals("Autor")){
                    cadenaResultado = cadenaResultado + " El autor es: ".trim();
                }
            }
        }
    }

