package org.andestech.learning.rfb18.g2;


import java.io.*;
import java.util.ArrayList;

public class App
{
    public static ArrayList<Book> library;

    public static void feedLibrary(){
        library =
                new ArrayList<>(10);

        library.add(new Book(1898, "Джек Лондон", "Белое Безмолвие" ));

        library.add(new Book(1889, "Джек Лондон", "Как аргонавты в старину" ));

        library.add(new Book(1879, "Лев Толстой", "Крейцерова соната" ));

        library.add(new Book(1935, "Алексей Толстой", "Аэлита" ));

        library.add(new Book(1965, "Василий Шукшин", "Калина красная" ));



    }

    public static void main( String[] args )
    {

        feedLibrary();
        //....

        File lib = new File("e:\\datas\\library.bin");

        try(ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(lib)
        ))
        {
            oos.writeObject(library);

        }
        catch (IOException ex){ex.printStackTrace();}



        ArrayList<Book> library2 = null;

        try(ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(lib)
        ))
        {
            library2 =  (ArrayList<Book>) ois.readObject();

        }
        catch (IOException | ClassNotFoundException ex){ex.printStackTrace();}


        System.out.println(library2);


    }
}
