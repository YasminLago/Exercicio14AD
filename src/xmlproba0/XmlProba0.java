package xmlproba0;

import java.io.FileWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamWriter;

/**
 *
 * @author oracle
 */
public class XmlProba0 {

    public static void main(String[] args) {
        
        XMLOutputFactory factory = XMLOutputFactory.newInstance();
        
        try{
            XMLStreamWriter write = factory.createXMLStreamWriter(new FileWriter("autores.xml"));
            
            write.writeStartDocument("1.0"); //Declaracion XML con Version especificada
            write.writeStartElement("autores"); //Escribe a etiqueta de inicio dun elemento
            write.writeStartElement("autor");
            write.writeAttribute("codigo", "a1"); //Escribe un atributo para o elemento actual
           
            write.writeStartElement("nome");
            write.writeCharacters("Alexandre Dumas"); //Escribe o contido do elemento
            write.writeEndElement(); //Escribe a etiqueta de peche do elemento actual
            write.writeStartElement("titulo");
            write.writeCharacters("El Conde de Montecristo");
            write.writeEndElement();
            write.writeStartElement("titulo");
            write.writeCharacters("Los Miserables");
            write.writeEndElement();
            write.writeEndElement();
            write.writeStartElement("autor");
            write.writeAttribute("codigo", "a2");
            write.writeStartElement("nome");
            write.writeCharacters("Fiodor Dostoyevski");
            write.writeEndElement();
            write.writeStartElement("titulo");
            write.writeCharacters("El idiota");
            write.writeEndElement();
            write.writeStartElement("titulo");
            write.writeCharacters("Noches blancas");
            write.writeEndElement();
            write.writeEndElement();
            write.writeEndElement();
            
            write.flush(); //Vuelca os datos o fluxo e vacia o buffer temporal 
            write.close();
        }catch(Exception e){
            
        }
        
    }
    
}
