/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subastas;

/**
 *
 * @author lflt9
 */
public class Subastas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Broker broker = new Broker();
        if(broker.getConnection()==null){System.out.println("Not connected to database");}else{System.out.println("Connection successfully");}
    }
    
}
