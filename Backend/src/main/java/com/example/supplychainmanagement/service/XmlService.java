package com.example.supplychainmanagement.service;

import com.example.supplychainmanagement.model.Input;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.StringReader;
import java.io.StringWriter;

@Service
public class XmlService {

    public Input importXml(String xmlContent) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Input.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        return (Input) unmarshaller.unmarshal(new StringReader(xmlContent));
    }

    public String exportXml(Input input) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Input.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        StringWriter sw = new StringWriter();
        marshaller.marshal(input, sw);
        return sw.toString();
    }

    public Input importXmlFile(String filePath) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Input.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        return (Input) unmarshaller.unmarshal(new File(filePath));
    }

    public void exportXmlFile(Input input, String filePath) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Input.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(input, new File(filePath));
    }
}
