/*
 * Elvis.java
 * 
 * Copyright (C) 2009
 * Date    :       Oct 5, 2009
 * Time    :       10:56:41 AM
 * Autor   :       Slim OUERTANI
 * 
 * ---------+-------+-----------+-----------------------------------------
 * #        | Autor | Date      | Info
 * ---------+-------+-----------+-----+-----------------------------------------
 * Creation |  SO   |05/10/2009 |
 * ---------+-------+-----------+-----------------------------------------
 */

package singleton2;

import java.io.Serializable;

/**
 *
 * @author Slim OUERTANI
 */
public class Elvis implements Serializable{
// Singleton with static factory

    private static final Elvis INSTANCE = new Elvis();
    private Elvis() {}
    public static Elvis getInstance() { return INSTANCE; }

////
    // readResolve method to preserve singleton property
private Object readResolve() {
     // Return the one true Elvis and let the garbage collector
     // take care of the Elvis impersonator.
    return INSTANCE;
}

}
