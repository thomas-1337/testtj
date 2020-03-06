import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import java.io.*;

public class Exercise1 {
    public static void main(String[] args) throws IOException {
        try(InputStream in = new FileInputStream(".idea/workspace.xml")) {
            XMLInputFactory factory = XMLInputFactory.newFactory();
            XMLEventReader parser = factory.createXMLEventReader(in);

            while (parser.hasNext()) {
                System.out.println(parser.nextEvent());
            }
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }
}
