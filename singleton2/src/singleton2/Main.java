/*
 * Main.java
 * 
 * Copyright (C) 2009
 * Date    :       Oct 5, 2009
 * Time    :       10:56:25 AM
 * Autor   :       Slim OUERTANI
 * 
 * ---------+-------+-----------+-----------------------------------------
 * #        | Autor | Date      | Info
 * ---------+-------+-----------+-----+-----------------------------------------
 * Creation |  SO   |05/10/2009 |
 * ---------+-------+-----------+-----------------------------------------
 */
package singleton2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author sst
 */
public class Main {

 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  throws Exception{
        Elvis elvis1 = Elvis.getInstance();
        Elvis elvis2 = Elvis.getInstance();
        System.out.println(elvis1 == elvis2);
//        ////0
        serialise(elvis1);
        Elvis elvis3 = deserialise();
         System.out.println(elvis1 == elvis3);

    }

    private static void serialise(Object object) throws Exception {
        FileOutputStream fos = new FileOutputStream("elevis.ser");

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(object);

        oos.close();


    }

    private static Elvis deserialise() throws Exception {

           FileInputStream fis = new FileInputStream("elevis.ser");

   ObjectInputStream ois = new ObjectInputStream(fis);

   Elvis elvis = (Elvis) ois.readObject();

   ois.close();
return elvis;

    }
}
