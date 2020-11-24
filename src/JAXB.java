
import java.io.File;
import java.util.List;
import javalibros.Libros;
import javalibros.Libros.Libro;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author angel
 */
public class JAXB {
    Libros misLibros;
    
    public int abrirXML_JAXB(File fichero){
        try {
            JAXBContext contexto = JAXBContext.newInstance(Libros.class);// crea una instancia JAXB
            
            Unmarshaller u = contexto.createUnmarshaller();// crea el objeto
            
            misLibros = (Libros) u.unmarshal(fichero);// deserializa el fichero
            return 0;
        } 
        catch (Exception e) {
            return -1;
        }
    }
    
    public String recorrerJAXB(){
        String cadenaResultado = "";
        List<Libros.Libro> lLibros = misLibros.getLibro();
        
        for (int i = 0; i < lLibros.size(); i++){
            Libro libroTemp = lLibros.get(i);
            cadenaResultado = String.format("%s \nPublicado en: %s", cadenaResultado, libroTemp.getPublicadoEn());
            cadenaResultado = String.format("%s \nEl titulo es: %s", cadenaResultado, libroTemp.getTitulo());
            cadenaResultado = String.format("%s \nEl autor es: %s", cadenaResultado, libroTemp.getAutor());
            cadenaResultado = String.format("%s \nLa editorial es: %s", cadenaResultado, libroTemp.getEditorial());
            cadenaResultado = String.format("%s \n----------------", cadenaResultado);           
        }
        
        return cadenaResultado;
    }
}
