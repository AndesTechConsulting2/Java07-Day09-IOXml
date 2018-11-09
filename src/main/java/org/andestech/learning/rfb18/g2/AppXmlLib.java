package org.andestech.learning.rfb18.g2;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class AppXmlLib {

    public static void main(String[] args)
    {

    App.feedLibrary();

    Library library2=null, library = new Library(App.library);
   // System.out.println(library.getBooks());



    try(FileOutputStream fos =
            new FileOutputStream("e:\\datas\\library2.xml"))
    {
        JAXBContext context =
                JAXBContext.newInstance(Library.class);


        Marshaller marshaller =
                context.createMarshaller();

        marshaller.setProperty("jaxb.formatted.output", true);

        marshaller.marshal(library, fos);


    }
    catch (JAXBException | IOException ex){ex.printStackTrace();}



        try(FileInputStream fis =
                    new FileInputStream("e:\\datas\\library.xml"))
        {
            JAXBContext context =
                    JAXBContext.newInstance(Library.class);
           Unmarshaller unmarshaller =  context.createUnmarshaller();

           library2 = (Library) unmarshaller.unmarshal(fis);



        }
        catch (JAXBException | IOException ex){ex.printStackTrace();}


        System.out.println(library2.getBooks());
    }

}
