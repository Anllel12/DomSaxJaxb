
import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;
import java.io.File;
import java.io.FileOutputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author angel
 */
public class DOM {
    
    Document doc;
    
    public int abrirXML_DOM(File fichero){
        doc = null;
        
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setIgnoringComments(true);
            factory.setIgnoringElementContentWhitespace(true);
            
            DocumentBuilder builder = factory.newDocumentBuilder();
            
            doc = builder.parse(fichero);
            
            return 0;
        } catch (Exception e) {
            return -1;
        }       
    }
    
    public String recorrerDomMostrar(){
        
        String salida = "";
        Node node;
        String datosNodo[] = null;
        
        Node raiz =  (Node) doc.getFirstChild();
        
        NodeList nodeList = raiz.getChildNodes();
        
        for (int i = 0; i < nodeList.getLength(); i++) {
            
            node = (Node) nodeList.item(i);
            
            if (node.getNodeType()==Node.ELEMENT_NODE) {
                
                datosNodo = procesarLibro(node);
//                salida = String.format("%s  \n Publicado en: %s", salida, datosNodo[0]);
//                salida = String.format("%s  \n El titulo es: %s", salida, datosNodo[1]);
//                salida = String.format("%s  \n El autor es: %s", salida, datosNodo[2]);
//                salida = String.format("%s  \n ----------------", salida);
                
                salida = salida +"\n Publicado en: " + datosNodo[0];
                salida = salida +"\n Publicado en: " + datosNodo[1];
                salida = salida +"\n Publicado en: " + datosNodo[2];
                salida = salida + "\n ---------------";
                
            }
            
        }
        
        return salida;
    }
    
    public void modifica(String item, String text) {
        Node raiz = doc.getDocumentElement();
        Node temp;
        NodeList nodeList = raiz.getChildNodes();
        for (int i = 0; i < nodeList.getLength(); i++) {
            NodeList subNodes = nodeList.item(i).getChildNodes();
            int k = 0;
            for (int j = 0; j < subNodes.getLength(); j++) {
                temp = subNodes.item(j);
                if (temp.getNodeType() == Node.ELEMENT_NODE) {
                    if (k == 0 && temp.getFirstChild().getNodeValue().equals(item)) {
                        temp.setTextContent(text);
                    }
                    k++;
                }
            }
        }
    }
    
    public int añadirDom(String titulo, String autor, String año){
        try{
            Node nTitulo = doc.createElement("Titulo");
            Node nTituloText = doc.createTextNode(titulo);
            nTitulo.appendChild(nTituloText);
            
            Node nAutor = doc.createElement("Autor");
            Node nAutorText = doc.createTextNode(autor);
            nAutor.appendChild(nAutorText);
            
            Node nLibro = doc.createElement("Lobro");
            ((Element)nLibro).setAttribute("publicado_en", año);
            nLibro.appendChild(nTitulo);
            nLibro.appendChild(nAutor);
            
            Node raiz = doc.getFirstChild();
            raiz.appendChild(nLibro);
            
            return 0;
        }
        catch(Exception e){
            return -1;
        }
    }
    
    public int guardarDom(File fichero){
        try{            
            OutputFormat format = new OutputFormat(doc);
            
            format.setIndenting(true);
            
            XMLSerializer serializer = new XMLSerializer(new FileOutputStream(fichero), format);
            
            serializer.serialize(doc);
            return 0;
        }
        catch(Exception e){
            return -1;
        }
    }
    
    
    
    private String[] procesarLibro(Node n) {
        
        String datos[] = new String[3];
        Node ntemp = null;
        int contador = 1;
        
        datos[0] = n.getAttributes().item(0).getNodeValue();
        
        NodeList nodos = n.getChildNodes();
        
        for (int i = 0; i < nodos.getLength(); i++) {
            
            ntemp =  (Node) nodos.item(i);
            
            if (ntemp.getNodeType() == Node.ELEMENT_NODE) {
                
                datos[contador] = ntemp.getFirstChild().getNodeValue();
                contador++;
            }         
        }
        
        return datos;
    }
}
