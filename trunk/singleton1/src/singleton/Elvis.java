/*
 * Elvis.java
 * 
 * Copyright (C) 2009
 * Date    :       Oct 5, 2009
 * Time    :       10:38:28 AM
 * Autor   :       Slim OUERTANI
 * 
 * ---------+-------+-----------+-----------------------------------------
 * #        | Autor | Date      | Info
 * ---------+-------+-----------+-----+-----------------------------------------
 * Creation |  SO   |05/10/2009 |
 * ---------+-------+-----------+-----------------------------------------
 */
package singleton;

/**
 *
 * @author Slim OUERTANI
 */
public class Elvis {
// Singleton with public final field

    public static final Elvis INSTANCE = new Elvis();

//    private Elvis() {
//    }
    private Elvis() {
        if(INSTANCE!=null)throw new AssertionError("I know your attack!!!");
    }
}
