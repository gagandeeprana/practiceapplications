package logical;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.io.Writer;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class APIM {

    public static void main(String[] args) {
        
        BufferedReader br = null;
        BufferedWriter bw = null;
        String finalSt = "";
        try {
            
            String fileName = "admin--Public_API_vinventory_regularvport.xml.tmpl.pre";
            String CONSTANT = "\n</handler>\n<handler class=\"org.wso2.carbon.apimgt.gateway.handlers.throttling.APIThrottleHandler\">\n\t<property name=\"id\" value=\"Gold\"/>\n\t<property name=\"policyKey\" value=\"gov:/apimgt/applicationdata/throttle.xml\"/>\n</handler>\n";
            String targetFolder = "C:\\Users\\gagandeep.rana\\Desktop\\xmlfiles\\";
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            dbf.setValidating(false);
            DocumentBuilder db = dbf.newDocumentBuilder();
            

            br = new BufferedReader(new FileReader(new File(APIM.class.getClassLoader().getResource(fileName).getPath())));
            StringBuilder sb = new StringBuilder();
            String read;
            while((read = br.readLine()) != null) {
                sb.append(read);
                if(read != null && read.contains("ga-config.xml")) {
                    br.skip(18);
                    sb.append(CONSTANT);
                }
            }
            finalSt = sb.toString();
            System.out.println(sb.toString());
            
            bw = new BufferedWriter(new FileWriter(new File(targetFolder + fileName)));
            bw.write(sb.toString());
            bw.close();
            Document doc = db.parse(new FileInputStream(new File(targetFolder + fileName)));
            prettyPrint(doc, targetFolder+fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static final void prettyPrint(Document xml, String path) throws Exception {
//        Transformer tf = TransformerFactory.newInstance().newTransformer();
////        tf.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
//        tf.setOutputProperty(OutputKeys.INDENT, "yes");
//        Writer out = new StringWriter();
//        tf.transform(new DOMSource(xml), new StreamResult(out));
//        System.out.println(out.toString());
        
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new InputSource(new InputStreamReader(new FileInputStream(
            path))));

        Transformer xformer = TransformerFactory.newInstance().newTransformer();
        xformer.setOutputProperty(OutputKeys.METHOD, "xml");
        xformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
        xformer.setOutputProperty(OutputKeys.INDENT, "yes");
        xformer.setOutputProperty("b;http://xml.apache.org/xsltd;indent-amount", "4");
        xformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
        Source source = new DOMSource(document);
        Result result = new StreamResult(new File(path));
        xformer.transform(source, result);
        
        
        
    }
}
