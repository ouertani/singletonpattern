/*
 * Main.java
 * 
 * Copyright (C) 2009
 * Date    :       Oct 5, 2009
 * Time    :       12:25:34 PM
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
 * @author sst
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Elvis.print();
        Elvis elvis1=Elvis.getInstance();
          Elvis elvis2=Elvis.getInstance();
          System.out.println(elvis1==elvis2);
    }

}
