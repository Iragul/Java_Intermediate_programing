package Conversion;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;

public class XmltoJsonConversion {
    public static void Convertxmltojson(String xmlpath,String jsonpath,String outputFilePath){
        try {
            XmlMapper xmlMapper = new XmlMapper();
            xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);

            File xmlfile=new File(xmlpath);
            Object xmlobject=xmlMapper.readValue(xmlfile,Object.class);

            ObjectMapper jsonMapper=new ObjectMapper();
            jsonMapper.enable(SerializationFeature.INDENT_OUTPUT);

            String jsonstring=jsonMapper.writeValueAsString(xmlobject);

            File jsonfile=new File(jsonpath);
            jsonMapper.writeValue(jsonfile,jsonstring);

            System.out.println("Sucessflly converted");

            Object jsonobject=jsonMapper.readValue(jsonfile,Object.class);

            File outputFile = new File(outputFilePath);
            jsonMapper.writeValue(outputFile, jsonobject);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
    public static void main(String[] args)
    {
          Convertxmltojson("E:\\Automation\\SCB\\Javalearning\\Conversion\\xmltojson\\xml\\payment.xml","E:\\Automation\\SCB\\Javalearning\\Conversion\\xmltojson\\json\\payment.json","E:\\\\Automation\\\\SCB\\\\Javalearning\\\\Conversion\\\\xmltojson\\\\jsonparse\\\\payment.json");
    }
}
