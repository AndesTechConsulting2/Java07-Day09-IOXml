package org.andestech.learning.rfb18.g2;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class App
{
    public static void main( String[] args )
    {

        ArrayList<Book> library =
                new ArrayList<>(10);

        library.add(new Book(1898, "Джек Лондон", "Белое Безмолвие" ));

        library.add(new Book(1889, "Джек Лондон", "Как аргонавты в старину" ));

        library.add(new Book(1879, "Лев Толстой", "Крейцерова соната" ));

        library.add(new Book(1935, "Алексей Толстой", "Аэлита" ));

        library.add(new Book(1965, "Василий Шукшин", "Калина красная" ));


        //....

        File lib = new File("e:\\datas\\library.bin");

        try(ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(lib)
        ))
        {
            oos.writeObject(library);

        }
        catch (IOException ex){ex.printStackTrace();}





    }
}
