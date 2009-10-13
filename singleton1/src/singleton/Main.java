/*
 * Main.java
 * 
 * Copyright (C) 2009
 * Date    :       Oct 5, 2009
 * Time    :       10:38:02 AM
 * Autor   :       Slim OUERTANI
 * 
 * ---------+-------+-----------+-----------------------------------------
 * #        | Autor | Date      | Info
 * ---------+-------+-----------+-----+-----------------------------------------
 * Creation |  SO   |05/10/2009 |
 * ---------+-------+-----------+-----------------------------------------
 */
package singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 *
 * @author sst
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Elvis elvis1 = Elvis.INSTANCE;
            Elvis elvis2 = Elvis.INSTANCE;
            System.out.println(elvis1 == elvis2);
            //////0          
            Constructor<Elvis> constructor = Elvis.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            Elvis elvis3 = constructor.newInstance();
            System.out.println(elvis1 == elvis3);
            ////1
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
