package d1_dom4j;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import javax.xml.parsers.SAXParser;
import javax.xml.transform.sax.SAXResult;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

/**
 * 目标 学会使用dom4j 解析XML文件中的数据
 *  1 导入dom4j框架
 *  2 准备一个XML文件
 */
public class Dom4jHelloWorldDemo1 {

    @Test
    public void parseXMLData() throws Exception {
        //1 创建一个Dom4j解析器对象 代表了整个dom4j框架
        SAXReader saxReader = new SAXReader();
        //2 把XML文件加载到内存中成为一个Document文档对象
        // /直接取src下寻找文件
        InputStream is=Dom4jHelloWorldDemo1.class.getResourceAsStream("/Contacts.xml");
        Document document = saxReader.read(is);
        //3 获取根元素对象
        Element rootElement = document.getRootElement();
        System.out.println(rootElement.getName());

        //4拿根元素下的全部子元素
        List<Element> sonEles=rootElement.elements();
        for (Element sonEle : sonEles) {
            System.out.println(sonEle.getName());
        }
        //5 那某个子元素
        Element user = rootElement.element("user");
        System.out.println(user.getName());
        //有多个默认拿第一个
        Element contact = rootElement.element("contact");
        //获得子元素文本
        System.out.println(contact.elementText("name"));
        System.out.println(contact.elementTextTrim("name"));//去掉前后空格

        //根据元素获取属性值
        Attribute id = contact.attribute("id");
        System.out.println(id.getName()+" "+id.getValue());
        System.out.println(contact.attributeValue("id"));

        //获取当前元素下的子元素对象
        Element email = contact.element("email");
        System.out.println(email.getName()+" "+ email.getText());

    }
}
