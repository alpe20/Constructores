package coche;

import static java.sql.DriverManager.println;

/**
 *
 * @author lizbethpichardo
 * @version 1.0
 */
public class Coche {
    String gasolina;
    
    Coche (String gasolina){
        this.gasolina=gasolina;
        System.out.println("Tanque lleno "+this.gasolina);
    }
}
