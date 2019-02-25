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
        frmRegistro reg = new frmRegistro();
        reg.setVisible(true);
        Broker broker = new Broker();
        if(broker.getConn()!=null) System.out.println("Connection successfully");
        else System.out.println("Not connected to database");
    }
    
}
