/*
 * Elvis.java
 * 
 * Copyright (C) 2009
 * Date    :       Oct 5, 2009
 * Time    :       12:25:52 PM
 * Autor   :       Slim OUERTANI
 * 
 * ---------+-------+-----------+-----------------------------------------
 * #        | Autor | Date      | Info
 * ---------+-------+-----------+-----+-----------------------------------------
 * Creation |  SO   |05/10/2009 |
 * ---------+-------+-----------+-----------------------------------------
 */
package singleton3;

/**
 *
 * @author Slim OUERTANI
 */
public class Elvis {

    private static class ElvisHolder {

        static final Elvis INSTANCE = new Elvis();
    }

    private Elvis() {
        System.out.println("initialised!");
    }

    static Elvis getInstance() {
        return ElvisHolder.INSTANCE;
    }
    static void  print(){
        System.out.println("not initialised yet!");
    }


}
