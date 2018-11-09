package org.andestech.learning.rfb18.g2;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.FileOutputStream;
import java.io.IOException;

public class AppXmlLib {

    public static void main(String[] args)
    {

    App.feedLibrary();

    Library library = new Library(App.library);
    System.out.println(library.getBooks());



    try(FileOutputStream fos =
            new FileOutputStream("e:\\datas\\library.xml"))
    {
        JAXBContext context =
                JAXBContext.newInstance(Library.class);


        Marshaller marshaller =
                context.createMarshaller();

        marshaller.setProperty("jaxb.formatted.output", true);

        marshaller.marshal(library, fos);


    }
    catch (JAXBException | IOException ex){ex.printStackTrace();}




    }

}
