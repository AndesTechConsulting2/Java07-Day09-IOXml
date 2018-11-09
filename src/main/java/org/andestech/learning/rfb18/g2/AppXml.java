package org.andestech.learning.rfb18.g2;

import javax.xml.bind.*;
import java.io.FileOutputStream;
import java.io.IOException;

public class AppXml {

    public static void main(String[] args)
    {

    //App.feedLibrary();

    Book book =
            new Book(1898, "Джек Лондон", "Белое Безмолвие" );

    try(FileOutputStream fos =
            new FileOutputStream("e:\\datas\\book.xml"))
    {
        JAXBContext context =
                JAXBContext.newInstance(Book.class);


        Marshaller marshaller =
                context.createMarshaller();

        marshaller.setProperty("jaxb.formatted.output", true);

        marshaller.marshal(book, fos);


    }
    catch (JAXBException | IOException ex){ex.printStackTrace();}




    }

}
