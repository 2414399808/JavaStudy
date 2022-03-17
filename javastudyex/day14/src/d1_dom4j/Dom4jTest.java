package d1_dom4j;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import javax.xml.parsers.SAXParser;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Dom4jTest {
    public static void main(String[] args) throws Exception {
        //需求 解析XMl中的数组成为一个List集合
        SAXReader saxReader = new SAXReader();
        InputStream is = Dom4jTest.class.getResourceAsStream("/Contacts.xml");
        Document read = saxReader.read(is);
        Element rootElement = read.getRootElement();
        List<Element> elements = rootElement.elements("contact");
        List<Contact> list=new ArrayList<>();
        for (Element ele : elements) {

                Contact c=new Contact();
                c.setId(Integer.valueOf(ele.attribute("id").getValue()));
                c.setName(ele.element("name").getTextTrim());
                c.setGender(ele.element("gender").getTextTrim().charAt(0));
                c.setEmail(ele.element("email").getTextTrim());
                list.add(c);

        }
        System.out.println(list);


    }
}
