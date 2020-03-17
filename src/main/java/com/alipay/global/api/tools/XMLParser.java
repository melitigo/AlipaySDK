package com.alipay.global.api.tools;

import com.alibaba.fastjson.JSONObject;
import org.dom4j.*;
import org.dom4j.io.SAXReader;

import java.util.Iterator;
import java.util.List;

public class XMLParser {
    public static JSONObject XMLtoJSON(String xmlContent) throws DocumentException {
        Document document = DocumentHelper.parseText(xmlContent);
        Element rootElement = document.getRootElement();
        JSONObject jsonObject = new JSONObject();
        getNodes(rootElement, jsonObject);
        return jsonObject;
    }

    private static void getNodes(Element rootElement, JSONObject current) {
        String name = rootElement.attributeValue("name");
        name = name == null ? rootElement.getName() : name;
        String value = rootElement.getTextTrim();
        if (!value.equals("")) {
            current.put(name, value);
            return;
        }
        JSONObject child = new JSONObject();
        current.put(name, child);
        Iterator<Element> elementIterator = rootElement.elementIterator();
        while (elementIterator.hasNext()) {
            Element next = elementIterator.next();
            getNodes(next, child);
        }
    }
}
