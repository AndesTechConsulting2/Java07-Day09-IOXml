package org.andestech.learning.rfb18.g2;

import javax.xml.bind.*;
import java.io.FileOutputStream;
import java.io.IOException;

public class AppXml {

    public static void main(String[] args)
    {



    try(FileOutputStream fos =
            new FileOutputStream("e:\\datas\\book.xml"))
    {
        JAXBContext context =
                JAXBContext.newInstance(Book.class);


        Marshaller marshaller =
                context.createMarshaller();




    }
    catch (JAXBException | IOException ex){ex.printStackTrace();}




    }

}
